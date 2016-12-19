package demo;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

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

import generated.CDXML;
import utils.BoundingBox;
import utils.Point;


public class SwingDemo{
	
    // The frame.
    protected JFrame frame;
//    class myFrame extends JFrame{
//    	public myFrame(String title){
//    		this.setTitle(title);
//    	}
//    	
//    	@Override
//    	public void paint(Graphics g) 
//        {
//    		super.paint(g);
//    		g.drawRect((int)Double.parseDouble(boundingBox.getStartPoint().getX()), (int)Double.parseDouble(boundingBox.getStartPoint().getY()), 
//    				(int)Double.parseDouble(boundingBox.getEndPoint().getX()),(int)Double.parseDouble(boundingBox.getEndPoint().getY()));
//        }
//    }
//    
//    protected myFrame frame;

    // The "Load" button, which displays up a file chooser upon clicking.
    protected JButton button = new JButton("Load...");

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
        p.add(button);
        p.add(label);

        panel.add("North", p);
        panel.add("Center", svgCanvas);

        // Set the button action.
        button.addActionListener(new ActionListener() {
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
	
//	@Override
//	public void paint(Graphics g){
//		super.paint(g);
//		g.drawRect((int)Double.parseDouble(boundingBox.getStartPoint().getX()), (int)Double.parseDouble(boundingBox.getStartPoint().getY()), 
//				(int)Double.parseDouble(boundingBox.getEndPoint().getX()),(int)Double.parseDouble(boundingBox.getEndPoint().getY()));
//		
//	}
	
	private static void configure(){
        if(cdxml == null) return;
        // Configure BoundingBox
        if(cdxml.getBoundingBox() != null){
            
            String[] boundingBoxData =  cdxml.getBoundingBox().split(" ");
           
            Point startpoint = new Point(boundingBoxData[0], boundingBoxData[1]);
            Point endpoint = new Point(boundingBoxData[2], boundingBoxData[3]);
            
            boundingBox = new BoundingBox(startpoint, endpoint);
        }
	}
	
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
	
	private static void printNote(NodeList nodeList) {

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
					System.out.println("attr name : " + node.getNodeName());
					System.out.println("attr value : " + node.getNodeValue());

				}

			}

			if (tempNode.hasChildNodes()) {
				// loop again if has child nodes
				printNote(tempNode.getChildNodes());
			}

			System.out.println("Node Name =" + tempNode.getNodeName() + " [CLOSE]");

		}
	   }
	}


	public static void main(String[] args){
		// Read CDXML
		readCDXML("C:\\Users\\LIUJF\\Desktop\\CDXMLTest\\cdxml2svg_Result\\ValidResult\\Brackets_Testing Data\\Corss bond data file\\cross_bond_1.cdxml");
		readSVG("C:\\Users\\LIUJF\\Desktop\\CDXMLTest\\cdxml2svg_Result\\ValidResult\\Brackets_Testing Data\\Corss bond data file\\cross_bond_1.svg");
		configure();
		
		svg.getDocumentElement().normalize();
		//Element root = svg.getDocumentElement();
		NodeList nList = svg.getChildNodes();
		//printNote(nList);
		//System.out.println(root.getNodeName()+":"+root.getNodeValue());
		
		// Show
//		SwingDemo canvas = new SwingDemo();
//		JFrame window = new JFrame("CDXML");
//		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		window.setBounds(30,30,1000,1000);
//		window.getContentPane().add(canvas);
//		window.setVisible(true);
		
		// Create a new JFrame.
//		myFrame f = (myFrame) new JFrame("Batik");
		JFrame f = new JFrame("Batik"){
			@Override
			public void paint(Graphics g){
				super.paint(g);
				g.drawRect((int)Double.parseDouble(boundingBox.getStartPoint().getX()), (int)Double.parseDouble(boundingBox.getStartPoint().getY()), 
						(int)Double.parseDouble(boundingBox.getEndPoint().getX()),(int)Double.parseDouble(boundingBox.getEndPoint().getY()));
				
			}
		};
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
        
//        Graphics g = null;
//        g.drawRect((int)Double.parseDouble(boundingBox.getStartPoint().getX()), (int)Double.parseDouble(boundingBox.getStartPoint().getY()), 
//				(int)Double.parseDouble(boundingBox.getEndPoint().getX()),(int)Double.parseDouble(boundingBox.getEndPoint().getY()));
//        f.paint(g);
		
		

	}

}


