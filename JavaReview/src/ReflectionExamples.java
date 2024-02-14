/*
 * This example illustrates reflection in Java and shows
 * some possibilities of its uses
 */
import java.lang.reflect.*;

public class ReflectionExamples {
	public static void main(String args[]) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {
		// examine a class by its instance
		// Instead of calling the constructor like this:
		//Animal lion = new Animal("lion", 400);
		
		// Argument types for the constructor: 
		Class<?> [] argTypes = {String.class, double.class};
		// Getting the class:
		Class<?> class1 = Class.forName("Animal");
		// Calling the constructor with the given arguments:
		Animal lion = (Animal) class1.getDeclaredConstructor(argTypes).newInstance("lion",400);
		
		// get and print all its public fields 
		Field [] pubFields = class1.getFields();
		System.out.println("There are " + pubFields.length + " public fields\n");
		
		// get and print all fields (including private)
		Field [] fields = class1.getDeclaredFields();
		
		System.out.println("All fields:");
		for (Field f: fields) {
			System.out.println(f);
		}
		System.out.println();
		
		// get all methods in the class, not superclasses (including private)
		Method [] methods = class1.getDeclaredMethods();
		System.out.println("There are " + methods.length + " methods in the class itself:");	
		
		for (Method m: methods) {
			System.out.println(m);
		}
		System.out.println();
		
		Method [] allPubMethods = class1.getMethods();
		System.out.println("There are " + allPubMethods.length + " visible methods, including inherited:");	
		
		for (Method m: allPubMethods) {
			System.out.println(m);
		}
		
		 //calling a method via reflection
		System.out.println("Calling a method by number");
		try {
			String s = (String) methods[0].invoke(lion);
			System.out.println(s);
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
