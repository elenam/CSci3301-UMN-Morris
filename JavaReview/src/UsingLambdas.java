import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class UsingLambdas {

	public static void main(String[] args) {
		ArrayList<Point> points = new ArrayList<>();
		Random r = new Random();
		
		// creating 10 points at random
		for (int i = 0; i < 10; ++i) {
			points.add(new Point(r.nextInt(21)-10,r.nextInt(21)-10));
		}
		
		
		System.out.println("Unordered points:");
		for (int i = 0; i < points.size(); ++i) {
			System.out.println(points.get(i));
		}
		
		// using a comparator to sort points by x coordinate.
		// The sort method takes a comparator. A comparator is
		// a functional interface: it has a single method "compare"
		// that returns an integer. 
		// See https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Comparator.html
		// for interpretation of the integer.
		// In the code below we create a comparator, implement the compare 
		// method using a lambda, and then pass the array list and the comparator
		// to Collections.sort to sort the points. 
		Collections.sort(points,
				(Comparator<Point>) (p1, p2) -> p1.getX() - p2.getX());
		
		System.out.println("Sorted points:");
		for (int i = 0; i < points.size(); ++i) {
			System.out.println(points.get(i));
		}
		
		// Q1: sort the points by their distance from zero,
		// using a comparator and a lambda
		// Note: distanceFromZero returns a double, and casting it to an int
		// loses precision. Multiply it by something large, like 1000, 
		// before casting to int.
		
		// Q2: Create an array list of 5 strings, use a Comparator
		// with lambda to sort them by their length.
		// If two strings have the same length, they are considered 
		// equal and their order is arbitrary.
		// Note that there is a shortcut for this that is mentioned in 
		// some tutorials, but I am asking you to follow a slightly longer
		// syntax above. 
	}

}
