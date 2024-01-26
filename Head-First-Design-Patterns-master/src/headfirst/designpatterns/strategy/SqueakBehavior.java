package headfirst.designpatterns.strategy;

public class SqueakBehavior implements QuackBehavior {
	public void quack() {
		System.out.println("Squeak");
	}
}
