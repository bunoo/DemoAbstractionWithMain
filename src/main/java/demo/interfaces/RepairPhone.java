package demo.interfaces;

public class RepairPhone {

/* Method overloading */
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

public void repairPhone(AdvPhone advPh) {

	boolean b = advPh.call();
	if (b == false) {
		System.out.println("Calling feature of the corresponding phone type is not working....need to be fixed");
	}
	
	boolean c = advPh.camera();
	if (c == false) {
		System.out.println("Camera feature of the corresponding phone type is not working....need to be fixed");
	}
	
	boolean d = advPh.flashLight();
	if (d == false) {
		System.out.println("flashLight feature of the Adv phone type is not working....need to be fixed");
	}
	
}

public static void main (String[] args) {
	
	RepairPhone rp = new RepairPhone();
	rp.repairPhone(new IPhone());
	rp.repairPhone(new Samsung());
	rp.repairPhone(new Motorola());
}	
	
}
