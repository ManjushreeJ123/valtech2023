package com.valtech.training.day1;

import java.io.Serializable;
import CoreJavaDay2.*;

public class Point  implements Comparable<Point>,Serializable {
	// 1. Constants
	//2. Static Block
	//3. variables
	//4. Constructor
	//5. Methods
	
	
	//Constants
	public static final Point ORIGIN = new Point();
	static {
		//ORIGIN.x = 1000;
		//ORIGIN.y = 2000;
		System.out.println(ORIGIN);
	}
//variables
	public int x=10;
	public int y=20;
	//constructor
	public Point() {
		System.out.println("Point Method");
	}
	//constructor
	public Point(int x, int y) {
		System.out.println("IN ctor of point");
	//	super();
		this.x=x;
		this.y=y;
		
	}
	
	public int compareTo(Point o) {
		return (x - o.x) == 0 ? (y - o.y): (x - o.x);
	}
	
	//object methods
	@Override
	public boolean equals(Object obj) {
		
	Point p =(Point)obj;
		return p.x == x && p.y == y;
	}
	
@Override
public int hashCode() {
	
	return toString().hashCode();
}


@Override
public String toString() {
	// TODO Auto-generated method stub
	return "X = " + x + " y = " + y + " Distance = " + distance();
}

	public double distance(Point other) {
		System.out.println("Distance with another point");
		return distance(other.x, other.y);
	}
	
	
	public double distance(int x, int y) {
		int diffx = this.x - x;
		int diffy = this.y - y ;
		return Math.sqrt(diffx*diffx + diffy*diffy); 
		
		
	}
	
	
	public double distance() {
		System.out.println("Distance in POint");
		int diffx  = x - ORIGIN.x;
		int diffy  = y - ORIGIN.y;
		
		return Math.sqrt(diffx*diffx + diffy*diffy); 
	
	}
	public static void main(String[] args) {
//		Point p = new Point();
//		p.x = 10;
//		p.y = 20;
		//System.out.println(p.distance());
		//ORIGIN.x = 10;
		//System.out.println(p.distance());
//		Point p1 = new Point();
//		System.out.println(p1.distance());
//		System.out.println(p);
		
		
	}
	public Point addPoint(Point p2, Point p3, Point p1) {
		p1.x = p2.x + p3.x;
		p1.y = p2.y + p3.y;
		return p1;
	}
	public Point subPoint(Point p2, Point p3, Point p1) {
		p1.x = p2.x - p3.x;
		p1.y = p2.y - p3.y;
		return p1;
	}
	public double distance(Point p2, Point p3) {
		double x =  p2.x - p3.x;
		double y  = p2.y - p3.y;

		return Math.sqrt(x*x + y*y);
	}
	
	
}
