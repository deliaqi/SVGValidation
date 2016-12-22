package common.utils;

import java.util.ArrayList;
import java.util.List;

public class Point {
	private String id;
	private double x;
	private double y;
	private List<Line> lineList = new ArrayList<Line>();
	
	public Point(String id, double x, double y) {
		super();
		this.id = id;
		this.x = x;
		this.y = y;
	}
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public Point() {
		
	}
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<Line> getLineList() {
		return lineList;
	}
	public void setLineList(List<Line> lineList) {
		this.lineList = lineList;
	}

}
