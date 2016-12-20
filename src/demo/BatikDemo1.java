package demo;
 
import java.awt.Color;  
import java.awt.Graphics2D;  
import java.awt.Rectangle;  
import java.io.OutputStream;  
import java.io.OutputStreamWriter;  
import java.io.UnsupportedEncodingException;  
import java.io.Writer;  
   
import org.apache.batik.dom.GenericDOMImplementation;  
//import org.apache.batik.svggen.SVGGraphics2D;  
//import org.apache.batik.svggen.SVGGraphics2DIOException;  
import org.w3c.dom.DOMImplementation;  
import org.w3c.dom.Document;  
   
   
public class BatikDemo1 {  
   
	public void paint(Graphics2D g2d){  
		g2d.setPaint(Color.red);  
		//画一个矩形  
		g2d.fill(new Rectangle(10,10,100,100));  
	}  
	public static void main(String[] args) throws UnsupportedEncodingException{  
		DOMImplementation domImpl=GenericDOMImplementation.getDOMImplementation();  
		String svgURI="http://www.w3.org/2000/svg";  
		//创建SVG文件  
		Document doc=domImpl.createDocument(svgURI, "svg", null);
		
//		SVGGraphics2D svggener=new SVGGraphics2D(doc);  
//		BatikDemo1 test=new BatikDemo1();  
//		test.paint(svggener);  
//		boolean useCSS=true;  
//		//输出SVG文件  
//		Writer out =new OutputStreamWriter(System.out,"UTF-8");  
//		svggener.stream(out,useCSS);  
	}  
}  