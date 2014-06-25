package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PointApplication {
	
	public static void main(String args[]){
		Point[] points = getTestData();
		printBounds(points);
		
	}
	
	private static void printBounds(Point[] points){
		
		List<Integer> xCoordinates = getXCoordinates(points);
		List<Integer> yCoordinates = getYCoordinates(points);
		System.out.println("Lower bounds are ("+Collections.min(xCoordinates)+","+Collections.min(yCoordinates)+")");
		System.out.println("Upper bounds are ("+Collections.max(xCoordinates)+","+Collections.max(yCoordinates)+")");
		
		
	}
	
	private static List<Integer> getXCoordinates(Point[] points){
		List<Integer> xList = new ArrayList<Integer>();
		for(Point p: points){
			xList.add(p.getX());
		}
		return xList;
	}
	
	private static List<Integer> getYCoordinates(Point[] points){
		List<Integer> yList = new ArrayList<Integer>();
		for(Point p: points){
			yList.add(p.getY());
		}
		return yList;
	}
	

	
	
	private static Point[] getTestData(){
		Point[] points = new Point[3];
		Point p = new Point(-1,0);
		points[0] = p;
		p = new Point(2,2);
		points[1] = p;
		p = new Point(2,3);
		points[2] = p;
		
		return points;
		
	}

}
