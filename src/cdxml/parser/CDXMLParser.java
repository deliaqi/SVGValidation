package cdxml.parser;

import java.util.List;

import cdxml.dom.Altgroup;
import cdxml.dom.Arrow;
import cdxml.dom.B;
import cdxml.dom.Bioshape;
import cdxml.dom.Border;
import cdxml.dom.Constraint;
import cdxml.dom.Curve;
import cdxml.dom.Embeddedobject;
import cdxml.dom.Fragment;
import cdxml.dom.Geometry;
import cdxml.dom.Graphic;
import cdxml.dom.Group;
import cdxml.dom.N;
import cdxml.dom.Objecttag;
import cdxml.dom.Page;
import cdxml.dom.Plasmidmap;
import cdxml.dom.Spectrum;
import cdxml.dom.Stoichiometrygrid;
import cdxml.dom.T;
import cdxml.dom.Table;
import cdxml.dom.Tlcplate;
import common.utils.Line;
import common.utils.Point;
import demo.SwingDemo;

public class CDXMLParser {
	public CDXMLParser(){
		
	}
	
	public void parsePage(Page page){
		for(Object possibleFragment : page.getTOrFragmentOrGroup()){
            // Parse according to type
            if(possibleFragment instanceof Border){
                parseBorder((Border) possibleFragment);
            } else if(possibleFragment instanceof Fragment){
                parseFragment((Fragment) possibleFragment);
            } else if (possibleFragment instanceof Group) {
                parseGroup((Group) possibleFragment);
            } else if(possibleFragment instanceof Tlcplate){
                parseTLCPlate((Tlcplate) possibleFragment);
            } else if (possibleFragment instanceof T) {
                parseText((T) possibleFragment);
            //} else if (possibleFragment instanceof Rlogic){
                
            } else if (possibleFragment instanceof Table){
                parseTable((Table) possibleFragment);
            } else if(possibleFragment instanceof Curve){
                parseCurve((Curve) possibleFragment);
            } else if (possibleFragment instanceof Arrow) {
                parseArrow((Arrow) possibleFragment);
            } else if(possibleFragment instanceof Graphic) {
                Graphic graphic = (Graphic) possibleFragment;
                parseGraphic(graphic);
            } else if(possibleFragment instanceof Embeddedobject) {
                Embeddedobject embeddedObject = (Embeddedobject)possibleFragment;
                parseEmbeddedObject(embeddedObject);
                
            } else if(possibleFragment instanceof Stoichiometrygrid){
            	Stoichiometrygrid stoichiometrygrid = (Stoichiometrygrid) possibleFragment;
                parseStoichiometryGrid(stoichiometrygrid);
            } else if(possibleFragment instanceof Objecttag){
                Objecttag objecttag = (Objecttag) possibleFragment;
                parseObjectTag(objecttag);
            } else if(possibleFragment instanceof Spectrum){
            	Spectrum spectrum = (Spectrum) possibleFragment;
                parseSpectrum(spectrum);
                
            } else if(possibleFragment instanceof Altgroup){
            	Altgroup altgroup = (Altgroup) possibleFragment;
                parseAlternativeGroup(altgroup);
            } else if(possibleFragment instanceof Constraint){
            	Constraint constraint = (Constraint) possibleFragment;
                parseConstraint(constraint);
            } else if(possibleFragment instanceof Geometry){
            	Geometry geometry = (Geometry) possibleFragment;
                parseGeometric(geometry);
            } else if(possibleFragment instanceof Bioshape){
            	Bioshape bioshape = (Bioshape) possibleFragment;
                parseBioShape(bioshape);
            } else if(possibleFragment instanceof Plasmidmap){
            	Plasmidmap plasmidmap = (Plasmidmap) possibleFragment;
            	parsePlasmidmap(plasmidmap);
            }
        }
	}

	private void parsePlasmidmap(Plasmidmap plasmidmap) {
		// TODO Auto-generated method stub
		
	}

	private void parseBioShape(Bioshape bioshape) {
		// TODO Auto-generated method stub
		
	}

	private void parseGeometric(Geometry geometry) {
		// TODO Auto-generated method stub
		
	}

	private void parseConstraint(Constraint constraint) {
		// TODO Auto-generated method stub
		
	}

	private void parseAlternativeGroup(Altgroup altgroup) {
		for(Object possibleText : altgroup.getObjecttagOrTOrFragment()){
            if(possibleText instanceof T){
                parseText((T) possibleText);
            } else if (possibleText instanceof Fragment) {
                parseFragment((Fragment)possibleText);
            } else if(possibleText instanceof Objecttag){
            	parseObjectTag((Objecttag)possibleText);
            }
        }
	}

	private void parseSpectrum(Spectrum spectrum) {
		// TODO Auto-generated method stub
		
	}

	private void parseObjectTag(Objecttag objecttag) {
		// TODO Auto-generated method stub
		
	}

	private void parseStoichiometryGrid(Stoichiometrygrid stoichiometrygrid) {
		// TODO Auto-generated method stub
		
	}

	private void parseEmbeddedObject(Embeddedobject embeddedObject) {
		// TODO Auto-generated method stub
		
	}

	private void parseGraphic(Graphic graphic) {
		// TODO Auto-generated method stub
		
	}

	private void parseArrow(Arrow arrow) {
		// TODO Auto-generated method stub
		
	}

	private void parseCurve(Curve curve) {
		// TODO Auto-generated method stub
		
	}

	private void parseTable(Table table) {
		// TODO Auto-generated method stub
		
	}

	private void parseText(T text) {
		// TODO Auto-generated method stub
		
	}

	private void parseTLCPlate(Tlcplate tlcPlateNode) {
		// TODO Auto-generated method stub
		
	}

	private void parseGroup(Group groupNode) {
		for (Object innerNode : groupNode.getTOrFragmentOrGroup()) {
            if (innerNode instanceof Fragment) {
                parseFragment((Fragment) innerNode);
            } else if (innerNode instanceof Group) {
                parseGroup((Group) innerNode);
            } else if (innerNode instanceof Curve) {
                parseCurve((Curve) innerNode);
            } else if (innerNode instanceof Graphic) {
                parseGraphic((Graphic) innerNode);
            } else if (innerNode instanceof Arrow) {
                parseArrow((Arrow) innerNode);
            } else if(innerNode instanceof T){
                parseText((T) innerNode);
            } else if(innerNode instanceof Objecttag){
            	parseObjectTag((Objecttag) innerNode);            
            } else if(innerNode instanceof Altgroup){
            	parseAlternativeGroup((Altgroup) innerNode);
            } else if (innerNode instanceof Spectrum) {
            	parseSpectrum((Spectrum) innerNode);
            } else if (innerNode instanceof Plasmidmap) {
            	parsePlasmidmap((Plasmidmap) innerNode);
            //} else if (innerNode instanceof Rlogic) {
                
            } else if (innerNode instanceof Bioshape) {
                parseBioShape((Bioshape) innerNode);
            }
        }
	}

	private void parseFragment(Fragment fragmentNode) {
		for(Object innerNode : fragmentNode.getNOrBOrT()){
            if(innerNode instanceof N){
                parseNode((N) innerNode);
            } else if(innerNode instanceof B){
            	parseBond((B) innerNode);
            } else if (innerNode instanceof Curve) {
                parseCurve((Curve) innerNode);
            } else if (innerNode instanceof Graphic) {  // parse graphic tags inside fragments (e.g. symbols)
                parseGraphic((Graphic) innerNode);
            } else if(innerNode instanceof Objecttag){
                parseObjectTag((Objecttag) innerNode);
            } else if(innerNode instanceof  T){
                parseText((T)innerNode);
            }
        }
	}

	private void parseBond(B bond) {
		Line line = new Line();
		for(int i=0;i<SwingDemo.cdxmlPoints.size();i++){
			if(bond.getB().equals(SwingDemo.cdxmlPoints.get(i).getId())){
				line.setStartPoint(SwingDemo.cdxmlPoints.get(i));
			}else if(bond.getE().equals(SwingDemo.cdxmlPoints.get(i).getId())){
				line.setEndPoint(SwingDemo.cdxmlPoints.get(i));
			}
		}
		if(line.isValid()){
			SwingDemo.cdxmlLines.add(line);
		}
	}

	private void parseNode(N node) {
		Point point = null;
		String p = node.getP();
		String[] str = p.split(" ",2);
		if(str.length >= 2){
			point = new Point(node.getId(), Double.parseDouble(str[0]), Double.parseDouble(str[1]));
		}
		SwingDemo.cdxmlPoints.add(point);
	}

	private void parseBorder(Border border) {
		// TODO Auto-generated method stub
		
	}

}
