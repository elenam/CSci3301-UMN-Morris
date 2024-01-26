package headfirst.designpatterns.strategy;

public class CommonQuackBehavior implements QuackBehavior {
	public void quack() {
		System.out.println("Quack");
	}
}
