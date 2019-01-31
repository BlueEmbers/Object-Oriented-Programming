package deepandShallowCopies;

public class Demo 
{

	public static void main(String[] args) 
	{
		Person p1 = new Person("John", 20);
		Person p2 = new Person(p1);
		p1.setIdNumber(1);
		System.out.println(p1.toString()); 
		
		//System.out.println(p2.getId());
		
		/*System.out.println(p1.getIdNumber());
		System.out.println(p2.getIdNumber());*/
		
		//--------
		Person p3 = p1.shallowCopy();
		//p3.setName("Bob");
		System.out.println(p1 == p3);
		System.out.println(p1.getName());
		
		//--------
		
		Person p4 = p1.deepCopy();
		p4.setName("Bob");
		System.out.println(p1 == p4);
		System.out.println(p4.getName());

	}

}
