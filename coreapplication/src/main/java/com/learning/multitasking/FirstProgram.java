package com.learning.multitasking;

public class FirstProgram {

	public static void main(String[] args) {
		
		Thread t1 = Thread.currentThread();
		
		t1.setName("Trinity");
		
		t1.setPriority(7);
		
		System.out.println(t1);

	}

}
