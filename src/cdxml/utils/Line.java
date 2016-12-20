package cdxml.utils;

import common.utils.Point;

public class Line {
	private Point startPoint;
	private Point endPoint;
	private String xyDescription;
	public Point getStartPoint() {
		return startPoint;
	}
	public void setStartPoint(Point startPoint) {
		this.startPoint = startPoint;
	}
	public Point getEndPoint() {
		return endPoint;
	}
	public void setEndPoint(Point endPoint) {
		this.endPoint = endPoint;
	}
	public String getXyDescription() {
		return xyDescription;
	}
	public void setXyDescription(String xyDescription) {
		this.xyDescription = xyDescription;
	}
	
	public Line(Point startPoint, Point endPoint) {
		super();
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}
	public Line() {
		super();
	}
	
	public boolean isValid(){
		if(this.startPoint != null & this.endPoint != null){
			return true;
		}
		return false;
	}
	
	

}
