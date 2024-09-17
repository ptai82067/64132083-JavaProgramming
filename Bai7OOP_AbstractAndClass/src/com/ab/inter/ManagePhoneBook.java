package com.ab.inter;

public class ManagePhoneBook {

	public static void main(String[] args) {
		PhoneBook pb = new PhoneBook();
		pb.insertPhone("Tài", "0923767510");		
		pb.insertPhone("Lộc", "0933317123");
		pb.insertPhone("Phú111111asđư", "0799451872");
		pb.insertPhone("Quý123", "0935517113");
		pb.displayListPhone();
		pb.removePhone("Tài");
		pb.displayListPhone();
		pb.updatePhone("Quý","0912345678");
		pb.displayListPhone();
		pb.searchPhone("Lộc");
		pb.sort();
		pb.displayListPhone();
	}

}
