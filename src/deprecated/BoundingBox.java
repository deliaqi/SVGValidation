package deprecated;

public class BoundingBox {
	private Point startPoint;
	private Point endPoint;
	private double myWidth;
	private double myHeight;
	private String myDescription;
	
	public String getMyDescription() {
		return myDescription;
	}
	public void setMyDescription(String myDescription) {
		this.myDescription = myDescription;
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
	public double getMyWidth() {
		return myWidth;
	}
	public void setMyWidth(double myWidth) {
		this.myWidth = myWidth;
	}
	public double getMyHeight() {
		return myHeight;
	}
	public void setMyHeight(double myHeight) {
		this.myHeight = myHeight;
	}
	
	public BoundingBox(Point startPoint, Point endPoint, double myWidth, double myHeight) {
		super();
		this.startPoint = startPoint;
		this.endPoint = endPoint;
		this.myWidth = myWidth;
		this.myHeight = myHeight;
		this.myDescription = startPoint.getX() + " " + startPoint.getY() + " " + myWidth + " " + myHeight;
	}
	
	public BoundingBox(Point startPoint, Point endPoint) {
		super();
		this.startPoint = startPoint;
		this.endPoint = endPoint;
		this.myWidth = Double.parseDouble(endPoint.getX()) - Double.parseDouble(startPoint.getX());
		this.myHeight = Double.parseDouble(endPoint.getY()) - Double.parseDouble(startPoint.getY());
		this.myDescription = startPoint.getX() + " " + startPoint.getY() + " " + myWidth + " " + myHeight;
	}
	
	public BoundingBox() {
		super();
	}
	
}
