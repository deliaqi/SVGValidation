package svg.utils;

import java.util.ArrayList;
import java.util.List;

import common.utils.Point;

public class Path {
	public final static int POINT_COUNT = 6;
	private List<Point> pointList = new ArrayList<Point>();
	
	public Path(){
		
	}
	
	public Path(String pathstring){
		String[] pArray = pathstring.split(" ");
		if(pArray.length >= POINT_COUNT*2){
			for(int i=1;i<POINT_COUNT+1;i++){
				Point p = new Point(Double.parseDouble(pArray[2*i].substring(1)), Double.parseDouble(pArray[2*i+1]));
				pointList.add(p);
			}
		}
	}

	public List<Point> getPointList() {
		return pointList;
	}

	public void setPointList(List<Point> pointList) {
		this.pointList = pointList;
	}

}
