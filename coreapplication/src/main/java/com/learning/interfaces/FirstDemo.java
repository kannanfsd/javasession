package com.learning.interfaces;

class Circle implements Shape{
	double radius;	
	public Circle(double radius) {
		this.radius = radius;
	}
	@Override
	public void display() {
		double aoc = pi*radius*radius;
		System.out.println("Area of Circle:: "+aoc);		
	}	
}
class Square implements Shape {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
	
}
public class FirstDemo {
	public static void main(String[] args) {
		Shape obj = new Circle(13.5);
		obj.display();
		obj = new Square();
		obj.method1();
		Shape.method2();
	}
}
