package headfirst.designpatterns.strategy;

public class DecoyDuck extends Duck {
	public DecoyDuck() {
		setFlyBehavior(new FlyNoWayBehavior());
		setQuackBehavior(new MuteQuackBehavior());
	}
	public void display() {
		System.out.println("I'm a duck Decoy");
	}
}
