package interfaces;

public class RedheadDuck extends Bird implements Duck, Chicken
{

	@Override
	public void fly() 
	{
		System.out.println("Readhead duck flies...");
		
	}

	@Override
	public void quack() 
	{
		System.out.println("Readhead duck quacks...");
		
	}

	@Override
	public void swim() 
	{
		System.out.println("Readhead duck swims...");
		
	}

	@Override
	public void layEggs() 
	{
		System.out.println("Readhead duck lays eggs...");
		
	}

	@Override
	public void move() 
	{
		System.out.println("Readhead duck moves...");
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
	

}
