package headfirst.designpatterns.singleton.enumS;

public class SingletonClient {
	public static void main(String[] args) {
		Singleton singleton = Singleton.UNIQUE_INSTANCE;
		System.out.println(singleton.getDescription());
		
		singleton.setEmpty(true);
		
		System.out.println("empty = " + singleton.getEmpty());
	}
}
