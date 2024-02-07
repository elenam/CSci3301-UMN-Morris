package headfirst.designpatterns.decorator.starbuzzWithSizesUpdated;


public class Soy extends CondimentDecorator {
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	// Rewrite this method using the adjustment.
	// Be careful, make sure that you are only adjusting Soy
	// contribution, not the entire cost. 
	public double cost() {
		double cost = beverage.cost();
		if (beverage.getSize() == Size.TALL) {
			cost += .10;
		} else if (beverage.getSize() == Size.GRANDE) {
			cost += .15;
		} else if (beverage.getSize() == Size.VENTI) {
			cost += .20;
		}
		
		return cost;
	}
}
