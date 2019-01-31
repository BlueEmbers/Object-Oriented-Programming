package p1;

public class CircleDemo {

	public static void main(String[] args) {
		Circle c1 = new Circle(2);
		c1.setRadius(1);
		System.out.printf("%5.2f\n", c1);
		//                 % = place holder
		//                  5 = number of spaces allowed (including decimal spaces + decimal itself)
		//                   .2 = number of decimal places behind
		//                     f = data type
		
		Circle c2 = new Circle(6);
		c2.setRadius(3);
		System.out.printf("%.2f", c2);
	}

}
