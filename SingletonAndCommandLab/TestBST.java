import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class TestBST {

	public static void main(String[] args) throws FileNotFoundException {
		BSTCount wordCounts = new BSTCount();
		
		/*
		 * Reading data from a file word-by-word by specifying spaces as a delimiter
		 */
		Scanner sc = new Scanner(new File("data.txt")).useDelimiter("\\s");
		while (sc.hasNext()) {
			String s = sc.next();
			// removing all non-letter characters by replacing them with ""
			s = s.replaceAll("[^a-zA-Z]", "");
			// if the resulting string is non-empty, add it to the BST
			// You may start by trying out just printing it

		}
		
//		System.out.println("Winnie: " + wordCounts.getCount("Winnie"));
//		System.out.println("Winnie-the-Pooh: " + wordCounts.getCount("Winnie-the-Pooh"));
//		System.out.println("WinniethePooh: " + wordCounts.getCount("WinniethePooh"));
		
		//wordCounts.inOrder((s,n)-> true); // print all words and counts
		//wordCounts.inOrder((s,n)-> (n >= 5)); // print only nodes with counts >= 5
		// Add: print nodes with the words longer than 5 letters
		// Add another call to inOrder using "and", "or", or "negate"
		
		
		// Add a method "compute" to BSTCount. The method also performs an in-order traversal
		// recursively. 
		// It takes a lambda function that takes two parameters (a string and an integer)
		// and returns an int.
		// The function implements the following interface:
		// https://docs.oracle.com/en/java/javase/20/docs/api/java.base/java/util/function/ToIntBiFunction.html
		
		// After you implement the traversal function, use it to:
		// 1. Find the sum of all counts of words. 
		// 2. Find the sum of the lengths of all words.
		// 3. Find the longest word
		
	}

}
