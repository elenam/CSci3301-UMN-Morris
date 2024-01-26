package headfirst.designpatterns.strategy;

public class MallardDuck extends Duck {

	public MallardDuck() {

		quackBehavior = new CommonQuackBehavior();
		flyBehavior = new FlyWithWingsBehavior();

	}

	public void display() {
		System.out.println("I'm a real Mallard duck");
	}
}
