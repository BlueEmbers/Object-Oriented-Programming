package p2;

public class Circle {
	private int radius;
	public Circle() {
		
	}
	//random letters and numbers after default toString method of object = hashcode of object
	public Circle(int radius) {
		this.radius = radius;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public String toString() {
		return "Circle [radius =" + radius + "]";
	}
	
}
