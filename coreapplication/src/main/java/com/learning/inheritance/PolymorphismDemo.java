package com.learning.inheritance;

class Animal {
	void whoAmI() {
		System.out.println("I am a Generic Animal.");
	}
}
class Cow extends Animal {
	@Override
	void whoAmI() {
		System.out.println("I am a Cow.");
	}
}
class Snake extends Animal {
	@Override
	void whoAmI() {
		System.out.println("I am a Snake.");
	}
}
class Dog extends Animal {
	@Override
	void whoAmI() {
		System.out.println("I am a Dog.");
	}
}
public class PolymorphismDemo {
	public static void main(String[] args) {
		Animal obj = new Animal();
		obj.whoAmI();
		obj = new Cow();
		obj.whoAmI();
		obj = new Snake();
		obj.whoAmI();
		obj = new Dog();
		obj.whoAmI();
	}
}
