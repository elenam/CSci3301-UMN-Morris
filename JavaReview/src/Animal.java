// A class for reflection example
public class Animal {
	private String name;
	private double weight;
	
	public Animal(String name, double weight) {
		this.name = name;
		if (validWeight(weight)) {
			this.weight = weight;
		}
	}
	
	private boolean validWeight(double weight) {
		return (weight > 0);
	}
	
	public String getName() {
		return name;
	}
	
	public double getWeight() {
		return weight;
	}
}
