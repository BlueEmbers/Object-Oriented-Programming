package gpa2;

public class GpaDemo {
	public static void main(String[] args) throws Exception{
		Student s1; String name = null; 
		double gpa = 20.0;
		try {
			s1 = new Student(name, gpa);
		} catch (Exception e) {
			if (gpa>4.0) {
				try {
					s1 = new Student(name, 4.0);
				}
				catch (Exception e1) {
					e1.printStackTrace();
				}
			}
			else
			{
				try {
					s1 = new Student(name, 0.0);
				}
				catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		}
//		try {
//			s1 = new Student (name,gpa);
//		} catch (IllegalArgumentException e) {
//			if(gpa > 4.0) {
//				s1 = new Student(name,4.0);
//			} else {
//				s1 = new Student(name,0.0);
//			}
//		}
		System.out.println(s1);
	}
}
