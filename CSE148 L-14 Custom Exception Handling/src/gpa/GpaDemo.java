package gpa;

public class GpaDemo {

	public static void main(String[] args) {
		Student s2 = new Student("Adam", 5.0);
		System.out.println(s2);
		s2.setGpa(-30);
		System.out.println(s2);
	}

}
