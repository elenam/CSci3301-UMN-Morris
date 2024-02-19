package headfirst.designpatterns.decorator.starbuzzWithSizesUpdated;

public class Mocha extends CondimentDecorator {
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
		this.size = beverage.size; 
	}
 
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}
 
	public double cost() {
		return beverage.cost() + .20 * this.costAdjustmentBySize();
	}
}
