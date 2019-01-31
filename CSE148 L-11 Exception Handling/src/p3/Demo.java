package p3;

public class Demo {

	public static void main(String[] args) {
		Student s1 = new Student("Adam", 3.5);
		Student s2 = null;
		System.out.println(s1.getGpa());
		try{
			Student s2 = new Student("Bill", 4.5);
		}
		catch (IllegalArgumentsException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println(s2.getGpa());

	}

}
