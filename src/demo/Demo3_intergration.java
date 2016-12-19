package demo;

import generated.B;
import generated.CDXML;
import generated.Fragment;
import generated.N;
import utils.BoundingBox;
import utils.Line;
import utils.Point;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.apache.batik.dom.GenericDOMImplementation;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;



public class Demo3_intergration {
	
	private static DOMImplementation impl = GenericDOMImplementation.getDOMImplementation();
	//String svgNS = SVGDOMImplementation.SVG_NAMESPACE_URI;
	private static String svgNS="http://www.w3.org/2000/svg";
	private static Document doc = impl.createDocument(svgNS, "svg", null);
	private static BoundingBox box ;
	private static int NCount = 6;
	
	
	private static Element CreatePageGroup(Element root){
		Element clipElement = doc.createElement("clipPath");
		clipElement.setAttribute("id", "23");
		
		Element clipRectangle = doc.createElement("rect");
		clipRectangle.setAttribute("x", box.getStartPoint().getX());
		clipRectangle.setAttribute("y", box.getStartPoint().getY());
		clipRectangle.setAttribute("width", "100%");
		clipRectangle.setAttribute("height", "100%");
		
		clipElement.appendChild(clipRectangle);
		root.appendChild(clipElement);
		
		Element pageGroup = doc.createElement("g");
		pageGroup.setAttribute("id", "page");
		pageGroup.setAttribute("clip-path", "url(#23)");
		
		return pageGroup;
	}
	
	private static void AddSubElements(Element pageGroup, Element root, List<Line> LList){
		if(LList.size() <= 0){
			return;
		}
		for(int i=0;i<LList.size();i++){
			Element Solid = doc.createElement("g");
			Solid.setAttribute("id", "Solid");
			
			Element Line = doc.createElement("line");
			Line.setAttribute("x1", LList.get(i).getStartPoint().getX());
			Line.setAttribute("y1", LList.get(i).getStartPoint().getY());
			Line.setAttribute("x2", LList.get(i).getEndPoint().getX());
			Line.setAttribute("y2", LList.get(i).getEndPoint().getY());
			Line.setAttribute("stroke", "rgb(0,0,0)");
			Line.setAttribute("stroke-width", "1");
			Line.setAttribute("shape-rendering", "auto");
			
			Solid.appendChild(Line);
			pageGroup.appendChild(Solid);
		}
	}
	

	public static void main(String[] args) throws JAXBException {
		List<Object> NList = null;
		List<Point> PList = new ArrayList<Point>();
		List<Line> LList = new ArrayList<Line>();
		
		// Set N List in CDXML
		CDXML cdxml = CDXMLTest.readString(CDXML.class, "C:\\Users\\LIUJF\\Desktop\\new\\structure.cdxml");
		System.out.println(cdxml.getPage().size());
		List<Object> fragmentlist = cdxml.getPage().get(0).getTOrFragmentOrGroup();
		Fragment f = Fragment.class.cast(fragmentlist.get(0));
		NList = f.getNOrBOrT();
		NCount = NList.size();
		
		// Set Point List and Line List
		for(int i=0;i<NCount;i++){
			String curName = NList.get(i).getClass().getName();
			if(curName == "generated.N"){
				Point curP = new Point();
				N n = N.class.cast(NList.get(i));
				String p = n.getP();
				String[] str = p.split(" ",2);
				if(str.length >= 2){
					curP = new Point(n.getId(), str[0], str[1]);
				}
				PList.add(curP);
			}else if(curName == "generated.B"){
				B b = B.class.cast(NList.get(i));
				Line line = new Line();
				for(int j=0;j<PList.size();j++){
					if(b.getB().equals(PList.get(j).getId())){
						line.setStartPoint(PList.get(j));
					}else if(b.getE().equals(PList.get(j).getId())){
						line.setEndPoint(PList.get(j));
					}
				}
				if(line.isValid()){
					LList.add(line);
				}
			}
		}
		
		// Set BoundingBox
		String boxString = cdxml.getBoundingBox();
		String[] boxstr = boxString.split(" ",4);
		if(boxstr.length >= 4){
			box = new BoundingBox(new Point(boxstr[0], boxstr[1]), new Point(boxstr[2], boxstr[3]));
		}
		
		// Add Element for svg doc
		Element svgRoot = doc.getDocumentElement();
		
		svgRoot.setAttribute("xmlns:xlink", "http://www.w3.org/1999/xlink");
		
		svgRoot.setAttribute("viewBox", box.getMyDescription());
		
		svgRoot.setAttribute("preserveAspectRatio", "xMidYMid");
		svgRoot.setAttribute("width", "100%");
		svgRoot.setAttribute("height", "100%");
		
		Element drawingGroup = doc.createElement("g");
		drawingGroup.setAttribute("id", "drawing");
		
		Element drawingBox = doc.createElement("rect");
		drawingBox.setAttribute("x", box.getStartPoint().getX());
		drawingBox.setAttribute("y", box.getStartPoint().getY());
		drawingBox.setAttribute("width", "100%");
		drawingBox.setAttribute("height", "100%");
		drawingBox.setAttribute("fill", "rgb(255, 255, 255)");

		svgRoot.appendChild(drawingBox);
		
		// Add pages
		Element pageGroup = CreatePageGroup(svgRoot);
		drawingGroup.appendChild(pageGroup);
		// Add path or line
		AddSubElements(pageGroup, svgRoot, LList);
		
		svgRoot.appendChild(drawingGroup);
		
		// Write svg document 
		try {
			TransformerFactory transFactory = TransformerFactory.newInstance();
			Transformer transFormer = transFactory.newTransformer();
			
			DOMSource domsource = new DOMSource(doc);
			
			File file = new File("C:\\Users\\LIUJF\\Desktop\\new\\Demo3.svg");
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
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
