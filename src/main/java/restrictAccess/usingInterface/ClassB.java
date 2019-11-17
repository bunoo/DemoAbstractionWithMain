package restrictAccess.usingInterface;

public class ClassB implements InterfaceA {
	
	public void show() {
		System.out.println("Hello");
	}

	public void display() {
		System.out.println("Hi");
	}
	
	public static void main(String[] args) {
		
		/* The target is to allow user to access both the methods <<show() and display()>> */
		ClassB objB = new ClassB();
		objB.show();
		objB.display();
	
		/* The target is to restrict user form accessing <<display()>> method */
		InterfaceA objA = new ClassB();
		objA.show();
	  //objA.display(); Error encountered saying, "The method display() is undefined for the type InterfaceA"
	}

}
