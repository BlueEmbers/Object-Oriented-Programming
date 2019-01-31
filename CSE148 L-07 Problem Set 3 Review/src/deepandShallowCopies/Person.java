package deepandShallowCopies;

public class Person {
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", id=" + id + "]";
	}

	private String name;  // instance variables
	private int age; 
	private String id;
	
	// Static variables: They are shared by all objects of the class.
	private static int idNumber = 0;
	
	
	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
		id = String.valueOf(idNumber++);
	}
	
	public Person(Person person)
	{
		this.name = person.name;
		this.age = person.age;
		id = String.valueOf(idNumber++);
	}
	
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public static int getIdNumber() {
		return idNumber;
	}

	public static void setIdNumber(int idNumber) {
		Person.idNumber = idNumber;
	}

	// Instance methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public Person shallowCopy()
	{
		return this;
	}
	
	public Person deepCopy()
	{
		return new Person(this.name, this.age);
	}

}
