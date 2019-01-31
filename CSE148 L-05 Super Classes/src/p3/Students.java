package p3;

public class Students  extends Person{
	private String name;
	private String id;
	private double gpa;
	
	public Students(String name, String id, double gpa) {
		super(name, id);
		this.gpa = gpa;
	}
	
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	@Override
	public String toString() {
		return "Students [name=" + getName() + ", id=" + getId() + ", gpa=" + gpa + "]";
	}

	

}
