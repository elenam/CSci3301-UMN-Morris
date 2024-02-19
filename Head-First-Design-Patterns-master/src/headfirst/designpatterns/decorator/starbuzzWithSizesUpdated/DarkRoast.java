package headfirst.designpatterns.decorator.starbuzzWithSizesUpdated;

public class DarkRoast extends Beverage {
	public DarkRoast() {
		description = "Dark Roast Coffee";
	}
	
	public DarkRoast(Size size) {
		description = "Dark Roast Coffee";
		this.size = size;
	}
 
	public double cost() {
		return .99 * this.costAdjustmentBySize();
	}
}

