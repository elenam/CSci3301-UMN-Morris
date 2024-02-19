package headfirst.designpatterns.decorator.starbuzzWithSizesUpdated;

public class HouseBlend extends Beverage {
	public HouseBlend() {
		description = "House Blend Coffee";
	}
	
	public HouseBlend(Size size) {
		description = "House Blend Coffee";
		this.size = size;
	}
 
	public double cost() {
		return .89 * this.costAdjustmentBySize();
	}
}

