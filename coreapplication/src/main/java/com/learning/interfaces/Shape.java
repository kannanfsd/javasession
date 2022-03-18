package com.learning.interfaces;

public interface Shape {
	double pi=3.14;		// by default the variable as final scope
	void display();		// by default the method as abstract scope
	default void method1() {
		System.out.println("This is Default Method-1");
	}
	static void method2() {
		System.out.println("This is Static Method-2");
	}
}
