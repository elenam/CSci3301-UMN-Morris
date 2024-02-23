
public interface BSTNode {
	/*
	 * The interface represents a binary tree node with a string key and an int count
	 */
	// Get methods:
	public int getCount(); // return the count in the node itself
	public int getCount(String s); // look for the node with this word and get its count
	public BSTNode getLeft();
	public BSTNode getRight();
	public String getWord();
	
	// Create a new node on the left or on the right and add the word to that node
	public void addWordLeft(String word);
	public void addWordRight(String word);
	
	// increment the count in the node (only for a non-empty node)
	public void incrementCount();

}
