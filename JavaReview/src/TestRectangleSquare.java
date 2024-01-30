
public class TestRectangleSquare {

	public static void main(String[] args) {
		// Liskov substitution principle
		// (Barbara Liskov, MIT computer scientist):
		// If a property of objects of type T holds in all possible tests
		// and S is a subtype of T then the same property must also hold 
		// for all objects of type S	
		
		System.out.println("Rectangle:");
		
		// create a rectangle
		Rectangle r1 = new Rectangle(2, 5);
				
		// get its area and perimeter
		System.out.println("area = " + r1.area());
		System.out.println("perimeter = " + r1.perimeter());
		
		r1.setSide1(3);
		
		System.out.println("Rectangle after the change:");
		
		// get its area and perimeter
		System.out.println("area = " + r1.area());
		System.out.println("perimeter = " + r1.perimeter());
		
		// Are two sides equal? 
		System.out.println("Are two sides equal? " + r1.sidesEqual());		
		
		System.out.println("Square:");
		
		// create a square
		Square s1 = new Square(2);
				
		// get its area and perimeter
		System.out.println("area = " + s1.area());
		System.out.println("perimeter = " + s1.perimeter());
		
		s1.setSide(3);
		
		System.out.println("Square after the change:");
		
		// get its area and perimeter
		System.out.println("area = " + s1.area());
		System.out.println("perimeter = " + s1.perimeter());
		
		// Are two sides equal? 
		System.out.println("Are two sides equal? " + s1.sidesEqual());	
		
		// Lab task 2: see questions on Canvas. 
		
	}

}
