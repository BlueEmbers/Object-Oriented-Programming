package p1;

public class Circle {
	private int radius;
	
	public Circle() {
		radius = 1;
	}
	
	public Circle(int radius) {
		this.radius = radius;
		// ^ receiver   ^ giver
		//this.radius = instance variable; radius = local variable(radius in the method, not outside);
	}
	
	//getters/accessors
	public double getArea() {
		return radius * Math.PI * radius;
	}
	
	public double getCircumference() {
		return 2 * Math.PI * radius;
	}
	
	// setters/mutators
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public String toString() {
		return "Radius: " + radius + "\tArea: " + getArea() + "\tCircumference: " + getCircumference();
	}
	
}
