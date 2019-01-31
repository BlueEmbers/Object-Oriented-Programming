package p2;

public class CircleDemo {

	public static void main(String[] args) {
		Circle c1 = new Circle(2);
		Circle c2;       //declare new variable c2 of type Circle
		c2 = c1;         //c2 == c1 two reference variables for one address. Known as SHALLOW COPY -- Copy the address.
		c2.setRadius(1); //Since both c1 and c2 are pointing to one address of one object, radius 
						 //for c1 is changed if c2 is changed
		System.out.println(c2);
		
		c2 = new Circle(c1.getRadius()); // c2 != c1 after creation of new Circle object of reference c2 to new address
										 // DEEP COPY
	}

}
