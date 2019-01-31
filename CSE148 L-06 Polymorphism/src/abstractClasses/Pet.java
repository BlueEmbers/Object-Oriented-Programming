package abstractClasses;

public class Pet
{
	private String name;

	public Pet(String name) 
	{
		super();
		this.name = name;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	@Override
	public String toString()
	{
		return "Pet [name=" + name + "]";
	}
	
	//public void makeSound;

}
