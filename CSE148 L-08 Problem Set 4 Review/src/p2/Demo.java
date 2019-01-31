package p2;

public class Demo 
{

	public static void main(String[] args)
	{
		
		Address address = new Address("1", "Main Street", "Selden", "New York", "11784");
		Student s1 = new Student("Adam", 7, 3.5, address);
		System.out.println(s1);
		Address a =s1.getAddress();
		a.setStreetNumber("2");
		System.out.println(s1);
		
		double amount = Student.curveGpaStatic(.2);
		s1.setGpa(s1.curveGpa(amount));
		System.out.println(s1);

	}

}
