package com.learning.inheritance;


class Demo {
	int x;
	static int y;
	static int z;
	void printData() {
		x = x + 3;
		y += 5;
		System.out.println("X value is "+x+" Y value is "+y);
	}
	static void displayData() {
		z++;
		System.out.println("Z value is "+z);		
	}
	
}

abstract class AbsDemo {
	int x = 100;
	void printData() {
		System.out.println("Concrete method.");
	}
	abstract void display1();
	abstract void display2();
}

abstract class MyDerived extends AbsDemo {
	abstract void display3();
	abstract void display4();
	abstract void display5();
}
class MyDerived2 extends MyDerived {

	@Override
	void display3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void display4() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void display5() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void display1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void display2() {
		// TODO Auto-generated method stub
		
	}

	
}

public class StaticDemo {
	public static void main(String[] args) {
		
		AbsDemo aobj = new MyDerived2();

		
		Demo obj1 = new Demo();
		System.out.println("obj1 memory address ---> "+obj1.hashCode());
		obj1.printData();		
		obj1.printData();
		
		Demo obj2 = new Demo();
		System.out.println("obj2 memory address ---> "+obj2.hashCode());
		obj2.printData();
		
		Demo obj3 = new Demo();
		System.out.println("obj2 memory address ---> "+obj3.hashCode());
		obj3.printData();
		
		Demo.displayData();
	}
}
