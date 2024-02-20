package headfirst.designpatterns.singleton.enumS;

public enum Singleton {
	UNIQUE_INSTANCE;
	// other useful fields here
	
	// I added an example of a field and checked setting it -Elena
	private boolean empty;

	// other useful methods here
	public String getDescription() {
		return "I'm a thread safe Singleton!";
	}
	
	public void setEmpty(boolean b) {
		empty = b;
	}
	
	public boolean getEmpty() {
		return empty;
	}
}
