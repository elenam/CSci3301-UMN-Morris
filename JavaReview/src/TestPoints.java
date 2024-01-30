
public class TestPoints {

	public static void main(String[] args) {
		// Create a couple of points:
		Point p1 = new Point(2, 4);
		Point p2 = new Point(-2, 4);
		
		System.out.println("Distance from zero for p1 = " + 
				p1.distanceFromZero());
		System.out.println("Distance from zero for p2 = " + 
				p2.distanceFromZero());
		
		
		// How can we get p1's x and y?
		p1.getX(); // need to call a getX because x is private
		
		// Can we change x or y in points?
		// No - they are private and there is no set.
		
		System.out.println("count = " + Point.count);
		
		// Test a method for a distance between two points:
		System.out.println("Distance = " + p1.distance(p2));
		System.out.println("Distance = " + p1.distance(p1));
		
		// Create color points
		ColorPoint cp1 = new ColorPoint(2, 4, "blue");
		ColorPoint cp2 = new ColorPoint(-2, 4, "green");
		
		System.out.println(cp1);

		
		// Can I find their distance from zero? 
		System.out.println("Distance from zero for cp1 = " 
				+ cp1.distanceFromZero());
		
		// Can I find distance between two color points? A point and a color point?
		System.out.println("Distance = " + cp1.distance(cp2));
		System.out.println("Distance = " + cp1.distance(p1));
		
		/****Lab Task 1: answer the following questions ********/
		// Q1: Which of the following is a valid statement? Why?
		// Point p3 = new ColorPoint(3, 3, "maroon");
		// ColorPoint cp3 = new Point(3,3);
		
		// Q2: Uncomment a valid statement above. How can you call 
		// getColor() on the resulting variable? 
		// Print out the result of getColor()
		// Clearly explain what is required from the type safety standpoint
		// to call this method. 
		// Hint: use typecasting. 
		
		// Q3: see ColorPoint class. 
		
		// Q4: create an array list of points. Then add 10 points to it,
		// randomly choosing between regular points and color points. 
		// Generate the objects as follows:
		// Each object has a 50% chance to be a Point or a ColorPoint
		// Both x and y coordinates are random ints between -10 and 10 inclusive
		// The color for a ColorPoint is randomly chosen among at least two colors. 
		// Extra credit: Generate random colors that have an equal chance to 
		// take any value in the enum, regardless of how many there are 
		// in the enum.
		
		
		// Q5: write a loop to go through the array list that you generate 
		// in Q4 to do the following: 
		// 1. print out x and y coordinates of all points. 
		// 2. Additionally, print out the colors of the color points.
		// 3. count how many regular points and how many color points are there. 
		// Print out the counts after the loop.
		// Hint: use instanceof 
		
		System.out.println("count = " + Point.count);
		
	}

}
