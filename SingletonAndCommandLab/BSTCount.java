import java.util.function.BiPredicate;

public class BSTCount {
	private BSTNode root;
	
	/* 
	 * Creates an empty tree that consists just of a single empty node
	 * 
	 */
	public BSTCount() {
		// Fill in the code according to the description 
	}
	
	/*
	 * The method takes a word and updates the tree accordingly:
	 * If the word already occurs in the tree, its count gets incremented.
	 * If it doesn't occur in the tree, it is added according to the 
	 * binary search order.
	 */
	public void add(String word) {
		// If the tree is still empty:
		if (root == EmptyBSTNode.UNIQUE_INSTANCE) {
			// Fill in the code according to the description
		} else {
			BSTNode current = root;
			// The loop finds the position for the word.
			// It stops when current points to the node containing the 
			// word. 
			// If the word is not found, it is added to the tree and 
			// the method returns
			while (!word.equals(current.getWord())){
				// Fill in the code according to the description above
			}
			// Fill in the code according to the description
		}
	}
	
	/*
	 * The method starts recursion on the root of the tree to 
	 * get the count for a word. 
	 * If the word doesn't occur in the tree, 0 is returned.
	 */
	public int getCount(String word) {
		return root.getCount(word);
	}
	
	/*
	 * The method prints nodes whose word and count satisfy the 
	 * condition in the selector, i.e. for which selector.test(word, count)
	 * returns true. 
	 * The method starts the recursive process by calling the inOrderRec 
	 * and passing the root to it. 
	 */
	public void inOrder(BiPredicate<String,Integer> selector) {
		inOrderRec(root, selector);
	}
	
	/*
	 * A recursive in-order tree traversal that prints elements that satisfy
	 * the predicate in selector
	 */
	private void inOrderRec(BSTNode node, BiPredicate<String,Integer> selector) {
		// Fill in the code according to the description
		// Hint: use selector.test(...) to call the selector function. 
		// It returns a boolean (according to the BiPredicate interface) 
		// which determines whether the data in the node should be printed or not. 
	}
	

}
