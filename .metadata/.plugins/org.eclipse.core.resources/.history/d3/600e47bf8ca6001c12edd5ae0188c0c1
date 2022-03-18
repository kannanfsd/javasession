package com.learning.abs;


abstract class LivingThing{
	public abstract void walk();
}
class Human extends LivingThing {
	public void walk() {
		System.out.println("Human walk with 2 Legs.");		
	}
}
class Horse extends LivingThing {
	public void walk() {
		System.out.println("Horse walk with 4 Legs.");
	};
}

public class FirstDemo {
	public static void main(String[] args) {
		LivingThing obj = new Human();
		obj.walk();
		obj = new Horse();
		obj.walk();
	}
}
