package demo.interfaces;

public class Motorola implements Phone,AdvPhone {

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
