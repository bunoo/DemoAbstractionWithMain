package demo.abstraction;

public class Motorola extends Phone {

	public boolean call() {
		return false;
	}
	
	public boolean camera() {
		return true;
	}
	
	/* The Motorola phone comes with a new feature. */
	public boolean flashLight() {
		return false;
	}
}
