package privateInnerClass;

public class Demo 
{

	public static void main(String[] args) 
	{
		Computer c1 = new Computer(); 
		

	}

	private class Computer
	{
		public double add(double n1, double n2)
		{
			return n1 + n2;
		}
	}
}
