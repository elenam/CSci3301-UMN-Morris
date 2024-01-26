package headfirst.designpatterns.strategy;

public class RedHeadDuck extends Duck {
 
	public RedHeadDuck() {
		flyBehavior = new FlyWithWingsBehavior();
		quackBehavior = new CommonQuackBehavior();
	}
 
	public void display() {
		System.out.println("I'm a real Red Headed duck");
	}
}
