package headfirst.designpatterns.strategy;

public class FakeQuackBehavior implements QuackBehavior {
	public void quack() {
		System.out.println("Qwak");
	}
}
