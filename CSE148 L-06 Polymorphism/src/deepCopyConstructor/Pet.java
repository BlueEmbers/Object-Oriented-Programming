package deepCopyConstructor;

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
	
	//public abstract void makeSound;

	public void setName(String name) 
	{
		this.name = name;
	}

	@Override
	public String toString()
	{
		return "Pet [name=" + name + "]";
	}
	

}
