
public enum EmptyBSTNode implements BSTNode {
	UNIQUE_INSTANCE;
	/*
	 * You can specify any form of handling errors: logging,
	 * throwing a specific exception (rather than just a null pointer), etc. 
	 */

	@Override
	/*
	 * Returns 0 since there is no string associated with an empty node
	 */
	public int getCount() {
		return 0;
	}

	@Override
	public String getWord() {
		System.out.println("ERROR: accessing empty node");
		return null; // no word to return
	}

	// Add other missing methods 

}
