package demo;
//文件输出类
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
//映射类
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;

//xml映射输入和输出类
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.apache.batik.dom.GenericDOMImplementation;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;


public class Demo2_rectangle {
	private static DOMImplementation impl = GenericDOMImplementation.getDOMImplementation();
	//String svgNS = SVGDOMImplementation.SVG_NAMESPACE_URI;
	private static String svgNS="http://www.w3.org/2000/svg";
	private static Document doc = impl.createDocument(svgNS, "svg", null);
	
	private static Element ConvertToPath(int temp_i){
		/*Element Path = doc.createElement("path");
		
		StringBuilder result = new StringBuilder();
		boolean first = true;
		if(first){
			
		}
		switch(temp_i){
		case 0:
			Path.setAttribute("d", "M137.3 115.96 L137.3 115.96 L137.8 116.25 L138.3 116.54 L138.3 145.96 L137.8 146.25 L137.3 146.54 Z");
			break;
		case 1:
			Path.setAttribute("d", "M137.3 146.54 L137.3 146.54 L137.8 146.25 L138.3 145.96 L163.78 160.67 L163.78 161.25 L163.78 161.83 Z");
			break;
		case 2:
			Path.setAttribute("d", "M163.78 161.83 L163.78 161.83 L163.78 161.25 L163.78 160.67 L189.27 145.96 L189.77 146.25 L190.27 146.54 Z");
			break;
		case 3:
			Path.setAttribute("d", "M190.27 146.54 L190.27 146.54 L189.77 146.25 L189.27 145.96 L189.27 116.54 L189.77 116.25 L190.27 115.96 Z");
			break;
		case 4:
			Path.setAttribute("d", "M190.27 115.96 L190.27 115.96 L189.77 116.25 L189.27 116.54 L163.78 101.83 L163.78 101.25 L163.78 100.67 Z");
			break;
		case 5:
			Path.setAttribute("d", "M163.78 100.67 L163.78 100.67 L163.78 101.25 L163.78 101.83 L138.3 116.54 L137.8 116.25 L137.3 115.96 Z");
			break;
		}
		Path.setAttribute("stroke", "rgb(0, 0, 0)");
		Path.setAttribute("stroke-width", "0");
		Path.setAttribute("fill-rule", "evenodd");
		Path.setAttribute("stroke-linejoin", "miter");
		Path.setAttribute("fill", "rgb(0, 0, 0)");
		Path.setAttribute("shape-rendering", "geometricPrecision");*/
		Element Line = doc.createElement("line");
		Line.setAttribute("x1", "137.80");
		Line.setAttribute("y1", "116.25");
		Line.setAttribute("x2", "137.80");
		Line.setAttribute("y2", "146.25");
		Line.setAttribute("stroke", "rgb(0,0,0)");
		Line.setAttribute("stroke-width", "1");
		Line.setAttribute("shape-rendering", "auto");
		
		return Line;
	}
	
	private static Element CreatePageGroup(Element root){
		Element clipElement = doc.createElement("clipPath");
		clipElement.setAttribute("id", "23");
		
		Element clipRectangle = doc.createElement("rect");
		clipRectangle.setAttribute("x", "137.3");
		clipRectangle.setAttribute("y", "100.67");
		clipRectangle.setAttribute("width", "100%");
		clipRectangle.setAttribute("height", "100%");
		
		clipElement.appendChild(clipRectangle);
		root.appendChild(clipElement);
		
		Element pageGroup = doc.createElement("g");
		pageGroup.setAttribute("id", "page");
		pageGroup.setAttribute("clip-path", "url(#23)");
		
		return pageGroup;
	}

	private static void AddSubElements(Element pageGroup, Element root){
		for(int i=0;i<1;i++){
			Element Solid = doc.createElement("g");
			Solid.setAttribute("id", "Solid");
			Solid.appendChild(ConvertToPath(i));
			pageGroup.appendChild(Solid);
		}
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Element svgRoot = doc.getDocumentElement();
		
		svgRoot.setAttribute("xmlns:xlink", "http://www.w3.org/1999/xlink");
		
		svgRoot.setAttribute("viewBox", "137.3 100.67 52.97 61.16");
		
		svgRoot.setAttribute("preserveAspectRatio", "xMidYMid");
		svgRoot.setAttribute("width", "100%");
		svgRoot.setAttribute("height", "100%");
		
		Element drawingGroup = doc.createElement("g");
		drawingGroup.setAttribute("id", "drawing");
		
		Element drawingBox = doc.createElement("rect");
		drawingBox.setAttribute("x", "137.3");
		drawingBox.setAttribute("y", "100.67");
		drawingBox.setAttribute("width", "100%");
		drawingBox.setAttribute("height", "100%");
		drawingBox.setAttribute("fill", "rgb(255, 255, 255)");

		svgRoot.appendChild(drawingBox);
		
		//write the pages
		Element pageGroup = CreatePageGroup(svgRoot);
		drawingGroup.appendChild(pageGroup);
		AddSubElements(pageGroup, svgRoot);
		
		svgRoot.appendChild(drawingGroup);
		
		//输出到文件
		try {
			TransformerFactory transFactory = TransformerFactory.newInstance();
			Transformer transFormer = transFactory.newTransformer();
			
			DOMSource domsource = new DOMSource(doc);
			
			File file = new File("C:\\Users\\LIUJF\\Desktop\\new\\rectangle.svg");
			if(!file.exists()){
				file.createNewFile();
			}
			
			FileOutputStream out = new FileOutputStream(file);
			StreamResult xmlResult = new StreamResult(out);
			transFormer.transform(domsource, xmlResult);
			System.out.println(file.getAbsolutePath());
		} catch (TransformerConfigurationException e) {
			e.printStackTrace();
		} catch (TransformerException e) {
			e.printStackTrace();
		}
		  

	}

}
