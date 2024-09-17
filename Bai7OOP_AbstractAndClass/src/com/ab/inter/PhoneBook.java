package com.ab.inter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PhoneBook extends Phone{

	ArrayList<UserPhone> PhoneList = new ArrayList<UserPhone>();
	@Override
	void insertPhone(String name, String phone) {
		UserPhone up = new UserPhone(name, phone);
		boolean flag = false;
		for (UserPhone userPhone : PhoneList) {
			if(userPhone.getName() == name ) {
				flag = true;
				if(userPhone.getPhone() != phone) {
					userPhone.setPhone(userPhone.getPhone() + " : " + phone);
					System.out.println("Thêm phone mới và phone cũ thành công!");

				}
				break;
			}
		}
		if(!flag) {
			PhoneList.add(up);
			System.out.println("Thêm phone thành công!");
		} 
		
	}

	@Override
	void removePhone(String name) {
		boolean flag = false;
		for (UserPhone userPhone : PhoneList) {
			if(userPhone.getName() == name ) {
				PhoneList.remove(userPhone);
				System.out.println("Xóa phone thành công!");
				flag = true;
				break;
			}
		}
		if(!flag) {
			System.out.println("Không tìm thấy tên!");
		} 
		
	}

	@Override
	void updatePhone(String name, String newPhone) {
		boolean flag = false;
		for (UserPhone userPhone : PhoneList) {
			if(userPhone.getName() == name ) {	
				flag = true;
				userPhone.setPhone(newPhone);
				System.out.println("Update phone thành công!");
				break;
			}
		}
		if(!flag) {
			System.out.println("Không tìm thấy tên người dùng!");
		}
		
	}

	@Override
	void searchPhone(String name) {
		boolean flag = false;
		for (UserPhone userPhone : PhoneList) {
			if(userPhone.getName() == name ) {	
				flag = true;
				System.out.println("\n Số điện thoại của "+ name +": "+ userPhone.getPhone());
				break;
			}
		}
		if(!flag) {
			System.out.println("\nKhông tìm thấy tên người dùng");
		}
	}

	@Override
	void sort() {
		
		Comparator<UserPhone> comp = new Comparator<UserPhone>() {
		@Override
		public int compare(UserPhone o1, UserPhone o2) {
		return o2.getName().compareTo(o1.getName());
		}
		};
		Collections.sort(PhoneList, comp);
		System.out.println("Sắp xếp thành công !");
	}
	void displayListPhone() {
		for(UserPhone userPhone : PhoneList) {
			System.out.println("Tên người dùng: "+userPhone.getName()+"\n "
					+ "Số điện thoại: "+ userPhone.getPhone());
		}
		System.out.println("----------------------------------------------");
	}

}
