package no.abstraction;

public class RepairPhone {

	
	public void repairPhone(IPhone ip) {

		boolean b = ip.call();
		if (b == false) {
			System.out.println("Calling feature of IPhone is not working....need to be fixed");
		}
		
		boolean c = ip.camera();
		if (c==false) {
			System.out.println("Camera feature of IPhone is not working....need to be fixed");
		}
	}

	public void repairPhone(Samsung smng) {

		boolean b = smng.call();
		if (b == false) {
			System.out.println("Calling feature of Samsung is not working....need to be fixed");
		}
		
		boolean c = smng.camera();
		if (c==false) {
			System.out.println("Camera feature of Samsung is not working....need to be fixed");
		}
	}
	
	public void repairPhone(Motorola mtr) {

		boolean b = mtr.call();
		if (b == false) {
			System.out.println("Calling feature of Motorola is not working....need to be fixed");
		}
		
		boolean c = mtr.camera();
		if (c==false) {
			System.out.println("Camera feature of Motorola is not working....need to be fixed");
		}
	}
	
public static void main (String[] args) {
	
	RepairPhone rp = new RepairPhone();
	rp.repairPhone(new IPhone());
	rp.repairPhone(new Samsung());
	rp.repairPhone(new Motorola());
}	
	
}
