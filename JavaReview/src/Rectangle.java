
public class Rectangle {
	protected int side1;
	protected int side2;
	
	public Rectangle(int side1, int side2) {
		this.side1 = side1;
		this.side2 = side2;
	}
	
	public void setSide1(int side1) {
		this.side1 = side1;
	}
	
	public void setSide2(int side2) {
		this.side2 = side2;
	}
	
	public int area() {
		return side1 * side2;
	}
	
	public int perimeter() {
		return 2 * side1 + 2 * side2;
	}
	
	public boolean sidesEqual() {
		return side1 == side2;
	}
	
}
