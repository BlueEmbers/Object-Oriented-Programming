package p3;

public class Demo 
{

	public static void main(String[] args) 
	{
//		Students s1 = new Students("Adam", "111", 3.5);
//		System.out.println(s1.getGpa());
//		Faculty f1 = new Faculty("Bill", "222", 100000);
//		System.out.println(f1.getSalary());
		
		Students s1 = new Students("Adam", "111", 3.5);
		// variable type: Students;
		// Object type: Student by looking at the constructor
		
		Person s2 = new Students("Adam", "111", 3.5);
		// variable type: Persob (Super class);
		// Object type: Student by looking at the constructor
		
		Person s3 = new Person("Zack", "333");

		
	}
	/*
	 * Inheritance describes a relationsjip called "Is A"
	 */

}
