package common.utils;

public class Line {
	private Point startPoint;
	private Point endPoint;
	
	public Line(Point startpoint, Point endpoint){
		this.startPoint = startpoint;
		this.endPoint = endpoint;
	}
	
	public Line(){
		
	}
	
	public boolean isValid(){
		if(this.startPoint != null & this.endPoint != null){
			return true;
		}
		return false;
	}
	
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
	

}
