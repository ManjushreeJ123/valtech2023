package com.valtech.training.day1;

public class Point3D extends Point {
	public static final Point3D ORIGIN = new Point3D();
transient int y;
   private int z;
   public Point3D() {
	   
   }
   public Point3D(int x,int y, int z) {
	   super(x,y);
	   System.out.println("IN ctor of point");
	   this.z = z;
   }
   
   @Override
public boolean equals(Object obj) {
	// TODO Auto-generated method stub
	   Point3D p =  (Point3D)obj;
	return p.x == x && p.y == y && p.z == z;
}
   
   @Override
public String toString() {
	// TODO Auto-generated method stub
	   
	return "X =" + x + " y = "+ y +" Z = "+ z;
}
   
   public double distance(Point3D p) {
	   return distance(p.x,p.y,p.z);
   }
   public double distance (int x,int y,int z) {
	   int diffx =this.x - x;
	   int diffy =this.y - y;
	   int diffz =this.z - z;
	   return Math.sqrt(diffx * diffx + diffy * diffy + diffz * diffz);
	   
   }
 @Override
	public double distance() {
		// TODO Auto-generated method stub
	  System.out.println("Point 3D distance");
		   return Math.sqrt(x*x + y*y + z*z);
	   }
	

	
	public static void main(String[] args) {
	//	ORIGIN.x = 10;
		//System.out.println(Point.ORIGIN.distance());
	//	System.out.println(ORIGIN.distance());
		//Point p = new Point3D();
		//p.distance();
		//p = new Point();
	//	p.distance();
		Point p = new Point3D(10,20,30);
		//double dis = p.distance(new Point3D(20,30,40));
		System.out.println(p);
		
		
		
	}
	
}
