package headfirst.designpatterns.decorator.starbuzzWithSizesUpdated;

public class Espresso extends Beverage {
  
	public Espresso() {
		description = "Espresso";
	}
	
	public Espresso(Size size) {
		description = "Espresso";
		this.size = size;
	}
  
	public double cost() {
		return 1.99 * this.costAdjustmentBySize();
	}
}

