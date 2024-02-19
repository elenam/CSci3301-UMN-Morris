package headfirst.designpatterns.decorator.starbuzzWithSizesUpdated;

public class Decaf extends Beverage {
	public Decaf() {
		description = "Decaf Coffee";
	}
	
	public Decaf(Size size) {
		description = "Decaf Coffee";
		this.size = size;
	}
 
	public double cost() {
		return 1.05 * this.costAdjustmentBySize();
	}
}

