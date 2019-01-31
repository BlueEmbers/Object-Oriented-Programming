package p1;

public class Demo
{

	public static void main(String[] args)
	{
		StudentBag theBag = new StudentBag(500);
		theBag.insert(new Student ("AAA", "111", 2.5));
		theBag.insert(new Student ("BBB", "222", 3.5));
		theBag.insert(new Student ("CCC", "333", 1.5));
		theBag.insert(new Student ("DDD", "444", 4.5));
		theBag.insert(new Student ("EEE", "555", 3.0));
		theBag.display();
		System.out.println("---------remove 222 ---------");
		theBag.removeById("222");
		System.out.println();
		theBag.display();
		

	}

}
