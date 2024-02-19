package headfirst.designpatterns.decorator.starbuzzWithSizesUpdated;
 
public class Whip extends CondimentDecorator {
	public Whip(Beverage beverage) {
		this.beverage = beverage;
		this.size = beverage.size; 
	}
 
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}
 
	// The cost of whipped cream is the same regardless of the size
	public double cost() {
		return beverage.cost() + .10;
	}
}
