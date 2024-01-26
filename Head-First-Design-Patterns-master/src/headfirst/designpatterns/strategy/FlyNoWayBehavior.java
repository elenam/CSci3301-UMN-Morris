package headfirst.designpatterns.strategy;

public class FlyNoWayBehavior implements FlyBehavior {
	public void fly() {
		System.out.println("I can't fly");
	}
}
