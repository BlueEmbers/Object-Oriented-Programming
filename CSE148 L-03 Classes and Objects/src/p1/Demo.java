package p1;

public class Demo 
{

	public static void main(String[] args) // Create an object of the Student Class
	{
		Student student1 = new Student("John Doe", "(631)123-4567", 4.0);
		//student1.setName("John Doe");
		//student1.setPhoneNumber("(631)123-4567");
		//student1.setGpa("4.0");
		//String name = student1.getName();
		// phoneNumber = student1.getPhoneNumber();
		//double gpa = student1.getGpa();
		System.out.println("The name is: " + student1.getName());
		System.out.println("The phone number is: " + student1.getPhoneNumber());
		System.out.println("The G.P.A is: " + student1.getGpa());
		
		Student student2 = new Student();
		student2.setName("Jane Doe");
		student2.setPhoneNumber("(631)765-4321");
		student2.setGpa(3.0);
		//String name = student2.getName();
		//String phoneNumber = student2.getPhoneNumber();
		//double gpa = student2.getGpa();
		System.out.println("The name is: " + student2.getName());
		System.out.println("The phone number is: " + student2.getPhoneNumber());
		System.out.println("The G.P.A is: " + student2.getGpa());
		System.out.println("--------------------");
		System.out.println("Students1's name is: " + student1.getName());
		System.out.println("Students2's name is: " + student2.getName());
		
	}

}
