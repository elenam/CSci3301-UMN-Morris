package headfirst.designpatterns.strategy;

/*
 * An implementation of a custom FlyBehavior.
 * This can be instantiated and used polymorphically as 
 * a FlyBehavior instance.
 */
public class ImaginedFlyBehavior implements FlyBehavior {
    public void fly() {
        // Some arbitrary text to show unique behavior :-)
        System.out.println("You lack the mental capacity to imagine ducks flying.");
    }
}
