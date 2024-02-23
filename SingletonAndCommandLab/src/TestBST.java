import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class TestBST {

	public static void main(String[] args) throws FileNotFoundException {
		BSTCount letterCounts = new BSTCount();
		
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
		
		System.out.println("Winnie: " + letterCounts.getCount("Winnie"));
		System.out.println("Winnie-the-Pooh: " + letterCounts.getCount("Winnie-the-Pooh"));
		System.out.println("WinniethePooh: " + letterCounts.getCount("WinniethePooh"));
		
		//letterCounts.inOrder((s,n)-> true); // print all words and counts
		//letterCounts.inOrder((s,n)-> (n >= 5)); // print only nodes with counts >= 5
		// Add: print nodes with the words longer than 5 letters
		// Add another call to inOrder using "and", "or", or "negate"
		
		
		// Add 
		
	}

}
