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
import java.util.List;

import javax.swing.*;
import javax.xml.bind.JAXBException;

import org.apache.batik.dom.svg.SAXSVGDocumentFactory;
import org.apache.batik.swing.JSVGCanvas;
import org.apache.batik.swing.gvt.GVTTreeRendererAdapter;
import org.apache.batik.swing.gvt.GVTTreeRendererEvent;
import org.apache.batik.swing.svg.GVTTreeBuilderAdapter;
import org.apache.batik.swing.svg.GVTTreeBuilderEvent;
import org.apache.batik.swing.svg.SVGDocumentLoaderAdapter;
import org.apache.batik.swing.svg.SVGDocumentLoaderEvent;
import org.apache.batik.util.XMLResourceDescriptor;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import cdxml.dom.B;
import cdxml.dom.CDXML;
import cdxml.dom.Fragment;
import cdxml.dom.N;
import cdxml.utils.BoundingBox;
import cdxml.utils.Line;
import common.utils.Point;
import svg.utils.Path;


public class SwingDemo{
	
    // The frame.
    protected JFrame frame;

    // The "Load" button, which displays up a file chooser upon clicking.
    protected JButton buttonSVG = new JButton("LoadSVG");
    protected JButton buttonCDXML = new JButton("LoadCDXML");

    // The status label.
    protected JLabel label = new JLabel();

    // The SVG canvas.
    protected JSVGCanvas svgCanvas = new JSVGCanvas();

    public SwingDemo(JFrame f) {
        frame = f;
    }

    public JComponent createComponents() {
        // Create a panel and add the button, status label and the SVG canvas.
        final JPanel panel = new JPanel(new BorderLayout());

        JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));
        p.add(buttonSVG);
        p.add(label);
        p.add(buttonCDXML);

        panel.add("North", p);
        panel.add("Center", svgCanvas);

        // Set the button action.
        buttonSVG.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                JFileChooser fc = new JFileChooser(".");
                int choice = fc.showOpenDialog(panel);
                if (choice == JFileChooser.APPROVE_OPTION) {
                    File f = fc.getSelectedFile();
                    try {
                        svgCanvas.setURI(f.toURL().toString());
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
	private static BoundingBox boundingBox;
	private static Document svg;
	private static List<Path> pathList = new ArrayList<Path>();
	private static String CDXML_DOM_N = "cdxml.dom.N";
	private static String CDXML_DOM_B = "cdxml.dom.B";
	
	// Attribute in CDXML
	private static int NCount = 6;
	private static List<Object> NList = null;
	private static List<Point> PList = new ArrayList<Point>();
	private static List<Line> LList = new ArrayList<Line>();
	

	private static void readCDXML(String path){
		try {
			cdxml = CDXMLTest.readString(CDXML.class, path);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void readSVG(String path){
		InputStream svgfile = null;
		try {
			svgfile = new FileInputStream(path);
			String parser = XMLResourceDescriptor.getXMLParserClassName();
			SAXSVGDocumentFactory f = new SAXSVGDocumentFactory(parser);
			String svgURI = "http://www.w3.org/2000/svg";
			svg = f.createDocument(svgURI, svgfile);
			//svgfile.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void validate(){
		if(pathList != null && PList != null){
			System.out.println("Validate points:");
			for(int i=0;i<pathList.size();i++){
				Path p = pathList.get(i);
				boolean right_start = false,right_end = false;
				for(int j=0;j<PList.size();j++){
					if(p.getPointList().size()>=Path.POINT_COUNT){
						if((p.getPointList().get(1).getX() == PList.get(j).getX()) && (p.getPointList().get(1).getY() == PList.get(j).getY())){
							right_start = true;
						}
						if((p.getPointList().get(4).getX() == PList.get(j).getX()) && (p.getPointList().get(4).getY() == PList.get(j).getY())){
							right_end = true;						
						}
						if(right_start && right_end){
							System.out.println(p.getPointList().get(1).getX()+"," + p.getPointList().get(1).getY()
									+ "-" + p.getPointList().get(4).getX()+","+p.getPointList().get(4).getY());
							right_start = false;
							right_end = false;
						}
					}
				}
			}
		}
	}
	
	
	private static void parseCDXML(){
        if(cdxml == null) return;

        // Configure BoundingBox
//        if(cdxml.getBoundingBox() != null){
//            
//            String[] boundingBoxData =  cdxml.getBoundingBox().split(" ");
//           
//            Point startpoint = new Point(Double.parseDouble(boundingBoxData[0]), Double.parseDouble(boundingBoxData[1]));
//            Point endpoint = new Point(Double.parseDouble(boundingBoxData[2]), Double.parseDouble(boundingBoxData[3]));
//            
//            boundingBox = new BoundingBox(startpoint, endpoint);
//        }
        
        // Set N List in CDXML
     	List<Object> fragmentlist = cdxml.getPage().get(0).getTOrFragmentOrGroup();
     	Fragment f = Fragment.class.cast(fragmentlist.get(0));
     	NList = f.getNOrBOrT();
     	NCount = NList.size();
     		
     	// Set Point List and Line List
     	for(int i=0;i<NCount;i++){
     		String curName = NList.get(i).getClass().getName();
     		if(curName == CDXML_DOM_N){
     			Point curP = new Point();
     			N n = N.class.cast(NList.get(i));
     			String p = n.getP();
     			String[] str = p.split(" ",2);
     			if(str.length >= 2){
     				curP = new Point(n.getId(), Double.parseDouble(str[0]), Double.parseDouble(str[1]));
     			}
     			PList.add(curP);
     		}else if(curName == CDXML_DOM_B){
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
	}
	
	
	private static void parseSVG(NodeList nodeList) {

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
					
					System.out.println("attr name : " + node.getNodeName());
					System.out.println("attr value : " + node.getNodeValue());

				}

			}

			if (tempNode.hasChildNodes()) {
				// loop again if has child nodes
				parseSVG(tempNode.getChildNodes());
			}

			System.out.println("Node Name =" + tempNode.getNodeName() + " [CLOSE]");

		}
	   }
	}


	public static void main(String[] args){
		// Read CDXML
		//readCDXML("C:\\Users\\LIUJF\\Desktop\\CDXMLTest\\cdxml2svg_Result\\ValidResult\\Brackets_Testing Data\\Corss bond data file\\cross_bond_1.cdxml");
		//readSVG("C:\\Users\\LIUJF\\Desktop\\CDXMLTest\\cdxml2svg_Result\\ValidResult\\Brackets_Testing Data\\Corss bond data file\\cross_bond_1.svg");
		readCDXML("C:\\Users\\LIUJF\\Desktop\\CDXMLTest\\Benzene.cdxml");
		readSVG("C:\\Users\\LIUJF\\Desktop\\CDXMLTest\\Benzene.svg");
		parseCDXML();
		
		svg.getDocumentElement().normalize();
		//Element root = svg.getDocumentElement();
		NodeList nList = svg.getChildNodes();
		parseSVG(nList);
		validate();
		//System.out.println(root.getNodeName()+":"+root.getNodeValue());
		
		
		// Create a new JFrame.
//		JFrame f = new JFrame("Batik"){
//			@Override
//			public void paint(Graphics g){
//				super.paint(g);
//				g.drawRect((int)Double.parseDouble(boundingBox.getStartPoint().getX()), (int)Double.parseDouble(boundingBox.getStartPoint().getY()), 
//						(int)Double.parseDouble(boundingBox.getEndPoint().getX()),(int)Double.parseDouble(boundingBox.getEndPoint().getY()));
//				
//			}
//		};
//        SwingDemo app = new SwingDemo(f);
//
//        // Add components to the frame.
//        f.getContentPane().add(app.createComponents());
//
//        // Display the frame.
//        f.addWindowListener(new WindowAdapter() {
//            public void windowClosing(WindowEvent e) {
//                System.exit(0);
//            }
//        });
//        f.setSize(500, 500);
//        f.setVisible(true);
		
		

	}

}


