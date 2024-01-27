package headfirst.designpatterns.strategy;

/*
 * A student example of an implementation of the Duck class,
 * using custom behavior.
*/ 
public class ImaginaryDuck extends Duck {
    
    /*
     * The constructor of ImaginaryDuck must specify values 
     * for the fields it inherits from the Duck class 
     * (requiring QuackBehavior and FlyBehavior types.)
     */
    public ImaginaryDuck() {
        quackBehavior = new MuteQuackBehavior();
        // See the FlyImaginedBehavior class.
        flyBehavior = new ImaginedFlyBehavior();
    }

    public void display() {
        System.out.println("I am in your head");
    }
}


