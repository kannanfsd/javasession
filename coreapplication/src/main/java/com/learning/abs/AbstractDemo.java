package com.learning.abs;


abstract class Shape {
	String color;	
	public void setColor(String color) {
		this.color = color;
		System.out.println("Color code:: "+color);
	}
	abstract double calculateArea();
}
class Circle extends Shape{
	double radius;	
	public Circle(double radius) {
		this.radius = radius;
	}
	@Override
	double calculateArea() {
		double aoc = Math.PI*radius*radius;
		return aoc;
	}	
}
class Square extends Shape {
	double side;	
	public Square(double side) {
		this.side = side;
	}
	@Override
	double calculateArea() {
		double area = side*side;
		return area;
	}
	
}
public class AbstractDemo {
	public static void main(String[] args) {
		Shape circleObj = new Circle(12.5);
		circleObj.setColor("Green");
		System.out.println(circleObj.calculateArea());
		
		Shape sqObj = new Square(10);
		sqObj.setColor("Yellow");
		System.out.println(sqObj.calculateArea());
	}
}
