package headfirst.designpatterns.decorator.starbuzzWithSizesUpdated;

import headfirst.designpatterns.decorator.starbuzzWithSizesUpdated.Beverage.Size;

public abstract class Beverage {
	public enum Size { TALL, GRANDE, VENTI };
	protected Size size = Size.TALL;
	protected String description = "Unknown Beverage";
  
	public String getDescription() {
		return description;
	}
	
	public void setSize(Size size) {
		this.size = size;
	}
	
	public Size getSize() {		
		return this.size;
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
		if (this.getSize() == Size.TALL) {
			return 1.0;
		} else if (this.getSize() == Size.GRANDE) {
			return 1.5;
		} else { // Size.VENTI
			return 2.0;
		}
	}
 
	public abstract double cost();
	
}
