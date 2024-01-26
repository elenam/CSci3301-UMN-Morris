package headfirst.designpatterns.strategy;

public class ModelDuck extends Duck {
	public ModelDuck() {
		flyBehavior = new FlyNoWayBehavior();
		quackBehavior = new CommonQuackBehavior();
	}

	public void display() {
		System.out.println("I'm a model duck");
	}
}
