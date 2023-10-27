package assign;

import com.valtech.training.day1.Point;

public interface PointArithmetic {
	
	
	int x = 0;
	int y = 0;
	Point addPoints1 (Point obj1,Point obj2,Point Obj3);
	Point subPoints1 (Point obj1,Point obj2,Point Obj3);
	double distPoints (Point obj1,Point obj2);

public default double distance(int x, int y) {
	
	System.out.println("3. Invoking distance(x,y) in Point"); 		
	int diffx =this.x-x; 		
	int diffy =this.y-y; 		
	return Math.sqrt(diffx*diffx +diffy*diffy); 	
	} 	 	//Distance between 2 points 
public default double diffPoint (Point a,Point b) { 		
	double x=a.x-b.x; 	
	double y=a.y-b.y; 		
	return Math.sqrt(x*x+y*y); 
	} 	 
public default Point addPoints(Point a,Point b,Point c) { 
	c.x=a.x+b.x; 
	c.y=a.y+b.y; 	
	return c; 	
	} 	 
public default Point subPoints(Point a, Point b, Point c) { 	
	c.x=a.x-b.x; 	
	c.y=a.y-b.y; 	
	return c; 
	}



Point p2 = new Point(20,30); 		
Point p3 = new Point(10,20); 		
Point p4 = new Point(); 		 	
Point p5=new Point(); 
}

//p5.addPoints(p2, p3, p4); 		
//System.out.println("("+p4.x+","+p4.y+")"); 	

////p5.subPoints(p2, p3, p4); 		
////System.out.println("("+p4.x+","+p4.y+")"); 		
////double answer=((PointArithmetic) p5).distPoints(p2, p3); 		
////System.out.println(answer);
//
//	

