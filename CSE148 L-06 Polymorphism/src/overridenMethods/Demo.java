package overridenMethods;

public class Demo
{

	public static void main(String[] args) 
	{
		Cat c1 = new Cat("Adam", 10);
		c1.setName(" Bill");
		System.out.println(c1.getName());
	}
	
	private static void show(Pet x)
	{
		System.out.println("My animal is: " + x);
	}

}
