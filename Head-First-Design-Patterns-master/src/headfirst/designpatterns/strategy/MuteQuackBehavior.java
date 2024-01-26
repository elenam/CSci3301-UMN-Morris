package headfirst.designpatterns.strategy;

public class MuteQuackBehavior implements QuackBehavior {
	public void quack() {
		System.out.println("<< Silence >>");
	}
}
