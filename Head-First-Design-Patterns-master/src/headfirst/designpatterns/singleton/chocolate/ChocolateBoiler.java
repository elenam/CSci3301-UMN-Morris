package headfirst.designpatterns.singleton.chocolate;

/*
 Question 1: add 'else' to the 'if' statements in fill(), boil(),
 and drain(). Add print statements for the successful tasks 
 ("Draining the boiler...") and for the failed attempts 
 ("Can't drain an empty boiler")
 
 Question 2: in ChocolateController try a sequence of steps that isn't possible,
 such as draining an empty boiler. Make sure all the prints are correct.
 
 Question 3: change to enum implementation of singleton (see the example in enumS
 package) and retry the steps in question 2.
*/

public class ChocolateBoiler {
	private boolean empty;
	private boolean boiled;
	private static ChocolateBoiler uniqueInstance;
  
	private ChocolateBoiler() {
		empty = true;
		boiled = false;
	}
  
	public static ChocolateBoiler getInstance() {
		if (uniqueInstance == null) {
			System.out.println("Creating unique instance of Chocolate Boiler");
			uniqueInstance = new ChocolateBoiler();
		}
		System.out.println("Returning instance of Chocolate Boiler");
		return uniqueInstance;
	}

	public void fill() {
		// could use just the variable empty, but the use of isEmpty() method
		// models some criterion that's more complex
		if (isEmpty()) {
			empty = false;
			boiled = false;
			// fill the boiler with a milk/chocolate mixture
		}
	}
 
	public void drain() {
		if (!isEmpty() && isBoiled()) {
			// drain the boiled milk and chocolate
			empty = true;
		}
	}
 
	public void boil() {
		if (!isEmpty() && !isBoiled()) {
			// bring the contents to a boil
			boiled = true;
		}
	}
  
	public boolean isEmpty() {
		return empty;
	}
 
	public boolean isBoiled() {
		return boiled;
	}
}
