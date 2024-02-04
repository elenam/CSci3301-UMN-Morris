package headfirst.designpatterns.decorator.starbuzzWithSizes;

import headfirst.designpatterns.decorator.starbuzzWithSizes.Beverage.Size;

public abstract class CondimentDecorator extends Beverage {
	public Beverage beverage;
	public abstract String getDescription();
	
	public Size getSize() {
		return beverage.getSize();
	}
	
	/*
	 * The method returns adjustment of cost depending 
	 * on the size. The adjustments of each beverage contributions 
	 * are as follows: 
	 * Size.TALL adjustment is 1.0 (it's the standard size)
	 * Size.GRANDE adjustment is 1.5 
	 * Size.VENTE adjustment is 2.0 
	 */
	protected double costAdjustmentBySize() {
		if (beverage.getSize() == Size.TALL) {
			return 1.0;
		} else if (beverage.getSize() == Size.GRANDE) {
			return 1.5;
		} else { // Size.VENTI
			return 2.0;
		}
	}
}
