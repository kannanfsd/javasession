package com.learning.inheritance;

class Base {
	private int a;
	static void printData() {
		System.out.println("This is Base Method.");
	}
	void printData(String name) {
		System.out.println("Name: "+name);
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	
}
class Derived1 extends Base{	
//	void printData() {
//		setA(25);
//		super.printData();
//		System.out.println("This is Derived1 Method."+getA());
//	}
	static void printData() {
		
	}
}
public class FirstDemo {
	public static void main(String[] args) {
		Derived1 obj = new Derived1();
		obj.printData();
	}
}
