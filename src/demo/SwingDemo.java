package demo;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.*;
import javax.xml.bind.JAXBException;

import org.apache.batik.dom.GenericDOMImplementation;
import org.apache.batik.dom.svg.SAXSVGDocumentFactory;
import org.apache.batik.swing.JSVGCanvas;
import org.apache.batik.swing.gvt.GVTTreeRendererAdapter;
import org.apache.batik.swing.gvt.GVTTreeRendererEvent;
import org.apache.batik.swing.svg.GVTTreeBuilderAdapter;
import org.apache.batik.swing.svg.GVTTreeBuilderEvent;
import org.apache.batik.swing.svg.SVGDocumentLoaderAdapter;
import org.apache.batik.swing.svg.SVGDocumentLoaderEvent;
import org.apache.batik.util.XMLResourceDescriptor;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import cdxml.dom.B;
import cdxml.dom.CDXML;
import cdxml.dom.Fragment;
import cdxml.dom.N;
import cdxml.parser.CDXMLParser;
import cdxml.utils.BoundingBox;
import common.utils.Line;
import common.utils.Point;
import svg.utils.Path;
import cdxml.dom.Page;


public class SwingDemo{
	
    // The frame.
    protected JFrame frame;
    protected JButton buttonSVG = new JButton("LoadSVG");
    protected JButton buttonCDXML = new JButton("LoadCDXML");
    // The status label.
    protected JLabel label = new JLabel();
    // The SVG canvas.
    protected JSVGCanvas svgCanvas = new JSVGCanvas();
    protected static JSVGCanvas resultCanvas = new JSVGCanvas();
    public SwingDemo(JFrame f) {
        frame = f;
    }

    public JComponent createComponents() {
        // Create a panel and add the button, status label and the SVG canvas.
        final JPanel panel = new JPanel(new BorderLayout());

        JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));
        p.add(buttonSVG);
        p.add(buttonCDXML);
        p.add(label);

        panel.add(BorderLayout.NORTH, p);
        panel.add(BorderLayout.WEST, svgCanvas);
        panel.add(BorderLayout.CENTER, resultCanvas);
        

        // Set the button action.
        buttonSVG.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                JFileChooser fc = new JFileChooser(".");
                int choice = fc.showOpenDialog(panel);
                if (choice == JFileChooser.APPROVE_OPTION) {
                    File f = fc.getSelectedFile();
                    try {
                        svgCanvas.setURI(f.toURL().toString());
                        
                        System.out.println("Read SVG..."+f.toURL().toString());
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });
        buttonCDXML.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                JFileChooser fc = new JFileChooser(".");
                int choice = fc.showOpenDialog(panel);
                if (choice == JFileChooser.APPROVE_OPTION) {
                    File f = fc.getSelectedFile();
                    try {
                    	//resultCanvas.setURI(f.toURL().toString());
                    	
                    	System.out.println("Read CDXML..."+f.toURL().toString());
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });

        // Set the JSVGCanvas listeners.
        svgCanvas.addSVGDocumentLoaderListener(new SVGDocumentLoaderAdapter() {
            public void documentLoadingStarted(SVGDocumentLoaderEvent e) {
                label.setText("Document Loading...");
            }
            public void documentLoadingCompleted(SVGDocumentLoaderEvent e) {
                label.setText("Document Loaded.");
            }
        });

        svgCanvas.addGVTTreeBuilderListener(new GVTTreeBuilderAdapter() {
            public void gvtBuildStarted(GVTTreeBuilderEvent e) {
                label.setText("Build Started...");
            }
            public void gvtBuildCompleted(GVTTreeBuilderEvent e) {
                label.setText("Build Done.");
                frame.pack();
            }
        });

        svgCanvas.addGVTTreeRendererListener(new GVTTreeRendererAdapter() {
            public void gvtRenderingPrepare(GVTTreeRendererEvent e) {
                label.setText("Rendering Started...");
            }
            public void gvtRenderingCompleted(GVTTreeRendererEvent e) {
                label.setText("");
            }
        });

        return panel;
    }
	
	
	private static CDXML cdxml;
	//private static BoundingBox boundingBox;
	private static Document svg;
	private static List<Path> pathList = new ArrayList<Path>();
	
	// Attribute in CDXML
	private static CDXMLParser cdxmlParser = new CDXMLParser();
	private static int NCount = 6;
	public static List<Object> NList = null;
	public static List<Point> cdxmlPoints = new ArrayList<Point>();
	public static List<Line> cdxmlLines = new ArrayList<Line>();
	
	// Result SVG
	private static DOMImplementation impl = GenericDOMImplementation.getDOMImplementation();
	private static String svgNS="http://www.w3.org/2000/svg";
	private static Document resultSVG = impl.createDocument(svgNS, "svg", null);
	private static Element resultRoot = resultSVG.getDocumentElement();
	private static String COLOR_RIGHT = "rgb(133, 238, 176)";
	private static String COLOR_WRONG = "";
	private static Set svgPoints = new HashSet();
	

	private static void readCDXML(String path){
		try {
			cdxml = CDXMLTest.readString(CDXML.class, path);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	
	private static void readSVG(String path){
		InputStream svgfile = null;
		try {
			svgfile = new FileInputStream(path);
			String parser = XMLResourceDescriptor.getXMLParserClassName();
			SAXSVGDocumentFactory f = new SAXSVGDocumentFactory(parser);
			svg = f.createDocument(svgNS, svgfile);
			//svgfile.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	private static void parseCDXML(){
        if(cdxml == null) return;

        List<Page> pagelist = cdxml.getPage();
        for(int i=0;i<pagelist.size();i++){
        	cdxmlParser.parsePage(pagelist.get(i));
        }
        
	}
	
	private void parseSVG(){
		NodeList pathlist = svg.getElementsByTagName("path");
		for(int i=0;i<pathlist.getLength();i++){
			NamedNodeMap nodeMap = pathlist.item(i).getAttributes();
			Node dnode = nodeMap.getNamedItem("d");
			Path p = new Path(dnode.getNodeValue());
			if(p.getPointList().size()>=Path.POINT_COUNT){
				Point startpoint = p.getPointList().get(1);
				Point endpoint = p.getPointList().get(4);
				Line line = new Line(startpoint, endpoint);
				if(!svgPoints.contains(startpoint)){
					svgPoints.add(startpoint);
				}
				
			}
		}
	}
	
	
	private static void printSVG(NodeList nodeList) {

	    for (int count = 0; count < nodeList.getLength(); count++) {

			Node tempNode = nodeList.item(count);
	
			// make sure it's element node.
			if (tempNode.getNodeType() == Node.ELEMENT_NODE) {
				// get node name and value
				System.out.println("\nNode Name =" + tempNode.getNodeName() + " [OPEN]");
				//System.out.println("Node Value =" + tempNode.getTextContent());
	
				if (tempNode.hasAttributes()) {
	
					// get attributes names and values
					NamedNodeMap nodeMap = tempNode.getAttributes();
	
					for (int i = 0; i < nodeMap.getLength(); i++) {
	
						Node node = nodeMap.item(i);
						if(node.getNodeName() == "d"){
							Path path = new Path(node.getNodeValue());
							pathList.add(path);
							System.out.println("**************path**************");
						}
						if(node.getNodeName() == "x1"){
							System.out.println("**************line**************");
						}
						System.out.println(node.getNodeName()+":"+node.getNodeValue());
	
					}
	
				}
	
				if (tempNode.hasChildNodes()) {
					// loop again if has child nodes
					printSVG(tempNode.getChildNodes());
				}
	
				System.out.println("Node Name =" + tempNode.getNodeName() + " [CLOSE]");
	
			}
	   }
	}

	private static void validateSVG(Node node){
		if (node.getNodeType() == Node.ELEMENT_NODE) {
			// get node name and value
			System.out.println("\nNode Name =" + node.getNodeName() + " [OPEN]");
			if (node.hasAttributes()) {
				// get attributes names and values
				NamedNodeMap nodeMap = node.getAttributes();
				
				if(node.getNodeName() == "path"){
					boolean right_start = false,right_end = false;
					Node dnode = nodeMap.getNamedItem("d");
					Node colornode = nodeMap.getNamedItem("fill");
					Path p = new Path(dnode.getNodeValue());
					//Line line = new Line();
					for(int j=0;j<cdxmlPoints.size();j++){
						if(p.getPointList().size()>=Path.POINT_COUNT){
							if((p.getPointList().get(1).getX() == cdxmlPoints.get(j).getX()) && (p.getPointList().get(1).getY() == cdxmlPoints.get(j).getY())){
								right_start = true;
								//line.setStartPoint(p.getPointList().get(1));
							}
							if((p.getPointList().get(4).getX() == cdxmlPoints.get(j).getX()) && (p.getPointList().get(4).getY() == cdxmlPoints.get(j).getY())){
								right_end = true;	
								//line.setEndPoint(p.getPointList().get(4));
							}
							if(right_start && right_end){
								System.out.println(p.getPointList().get(1).getX()+"," + p.getPointList().get(1).getY()
										+ "-" + p.getPointList().get(4).getX()+","+p.getPointList().get(4).getY());
								colornode.setNodeValue(COLOR_RIGHT);
								break;
							}else{
								//colornode.setNodeValue(COLOR_RIGHT);
							}
						}
					}
				}
					
				for (int i = 0; i < nodeMap.getLength(); i++) {
					Node attrnode = nodeMap.item(i);
					System.out.println(attrnode.getNodeName()+":"+attrnode.getNodeValue());
				}
			}
	
			if (node.hasChildNodes()) {
				// loop again if has child nodes
				NodeList nodelist = node.getChildNodes();
				for(int i=0;i<nodelist.getLength();i++){
					Node tempnode = nodelist.item(i);
					validateSVG(tempnode);
				}
			}
	
			System.out.println("Node Name =" + node.getNodeName() + " [CLOSE]");
	
		}
		
	}


	public static void main(String[] args){
		// Read CDXML and SVG
		//readCDXML("C:\\Users\\LIUJF\\Desktop\\CDXMLTest\\cdxml2svg_Result\\ValidResult\\Brackets_Testing Data\\Corss bond data file\\cross_bond_1.cdxml");
		//readSVG("C:\\Users\\LIUJF\\Desktop\\CDXMLTest\\cdxml2svg_Result\\ValidResult\\Brackets_Testing Data\\Corss bond data file\\cross_bond_1.svg");
		readCDXML("C:\\Users\\LIUJF\\Desktop\\CDXMLTest\\all_tags_dsk.cdxml");
		readSVG("C:\\Users\\LIUJF\\Desktop\\CDXMLTest\\[DSK]all_tags_118(3).svg");
		//readCDXML("C:\\Users\\LIUJF\\Desktop\\CDXMLTest\\8.cdxml");
		//readSVG("C:\\Users\\LIUJF\\Desktop\\CDXMLTest\\8.svg");
		parseCDXML();
		
        svg.getDocumentElement().normalize();
		
		// Write result to SVG
		validateSVG(svg.getFirstChild());
		resultCanvas.setDocument(svg);
		
		// Create a new JFrame.
		JFrame f = new JFrame("Batik");
        SwingDemo app = new SwingDemo(f);

        // Add components to the frame.
        f.getContentPane().add(app.createComponents());

        // Display the frame.
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        f.setSize(500, 500);
        f.setVisible(true);
		
		

	}

}


