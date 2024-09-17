package com.interf;

public class Apps {

	public static void main(String[] args) {
		Cat c = new Cat("Meo tam the",false);
		Dog d = new Dog("Bull",true);
		System.out.println(c.toString());
		System.out.println(d.toString());
		
		IAnimal c1 = new Cat("Meo tam the",false);
		IAnimal d1 = new Dog("Bull",true);
		System.out.println(c1.toString());
		System.out.println(d1.toString());

	}

}
