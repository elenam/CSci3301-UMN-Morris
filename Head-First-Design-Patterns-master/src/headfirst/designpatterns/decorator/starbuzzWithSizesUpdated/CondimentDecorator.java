package headfirst.designpatterns.decorator.starbuzzWithSizesUpdated;



public abstract class CondimentDecorator extends Beverage {
	protected Beverage beverage;
	public abstract String getDescription();
	
	public Size getSize() {
		return size;
	}
	
	public void setSize(Size size) {
		// you can't set size of a condiment, it gets it from its beverage
	}
}
