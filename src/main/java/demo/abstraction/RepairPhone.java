package demo.abstraction;

public class RepairPhone {

	
	public void repairPhone(Phone ph) {

		boolean b = ph.call();
		if (b == false) {
			System.out.println("Calling feature of the corresponding phone type is not working....need to be fixed");
		}
		
		boolean c = ph.camera();
		if (c == false) {
			System.out.println("Camera feature of the corresponding phone type is not working....need to be fixed");
		}
	}

public static void main (String[] args) {
	
	RepairPhone rp = new RepairPhone();
	rp.repairPhone(new IPhone());
}	
	
}
