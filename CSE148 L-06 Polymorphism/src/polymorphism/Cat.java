package polymorphism;

public class Cat extends Pet 
{
	private int age;

	// overloaded constructors
	public Cat(String name, int age) 
	{
		super();
		this.age = age;
	}
	public Cat(String name) 
	{
		this.name = name;
	}
	

	
}
