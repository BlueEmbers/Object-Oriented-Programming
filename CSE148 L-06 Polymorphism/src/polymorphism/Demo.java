package polymorphism;

public class Demo
{

	public static void main(String[] args) 
	{
		Pet p1 = new Pet("Buddy");
//		Cat c1 = new Cat("Ada,", 5);
//		Cat c2 = new Cat("Bill");
		Dog d1 = new Dog("Julie", "Golden");
		Dog d2 = new Dog("Mack");
		
		// polymorphism
		Pet d3 = new Dog("BO");
		
		System.out.println(d2);
		
		show(d3);
	}
	
	private static void show(Object x)
	{
		System.out.println("My animal is: " + x);
	}

}
