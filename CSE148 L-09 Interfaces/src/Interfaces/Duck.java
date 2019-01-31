package interfaces;

public interface Duck extends Animal
{
	// In an interface, all variables are public, static and final
	// final String name = "Bill"; is the same as note below
	// public static final String name = "Bill";
	// In an interface, all methods are public and abstract
	// public abstract void fly(); not necessary
	
	 void fly();
	 void quack();
	 void swim();
	 void display();

}
