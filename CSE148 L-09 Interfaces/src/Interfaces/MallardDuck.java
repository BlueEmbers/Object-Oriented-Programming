package interfaces;

public class MallardDuck implements Duck // implements all abstract methods
// extends duck not necessary as its not super class
{

	@Override
	public void fly() 
	{
		System.out.println("Mallad duck flies...");
		
	}

	@Override
	public void quack() 
	{
		System.out.println("Mallad duck quacks...");
		
	}

	@Override
	public void swim()
	{
		System.out.println("Mallad duck swims...");
		
	}

	@Override
	public void move() 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

}
