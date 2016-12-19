package utils;

public class Point {
	private String id;
	private String x;
	private String y;
	
	public Point(String id, String x, String y) {
		super();
		this.id = id;
		this.x = x;
		this.y = y;
	}
	public Point(String x, String y) {
		this.x = x;
		this.y = y;
	}
	public Point() {
		
	}
	
	public String getX() {
		return x;
	}
	public void setX(String x) {
		this.x = x;
	}
	public String getY() {
		return y;
	}
	public void setY(String y) {
		this.y = y;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

}
