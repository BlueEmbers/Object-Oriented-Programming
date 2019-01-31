package overridenMethods;

public class Cat extends Pet 
{
	private int age;

	// overloaded constructors
	public Cat(String name, int age) 
	{
		super(name);
		this.age = age;
	}
	public Cat(String name) 
	{
		super(name);
		age = 0;
	}
	
	public void makeSound()
	{
		System.out.println("agrrrr");
	}
	public void setName(String name)
	{
		super.setName(name);
	}
	
	public String getName()
	{
		return "Cat" + super.getName();
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	

	
}
