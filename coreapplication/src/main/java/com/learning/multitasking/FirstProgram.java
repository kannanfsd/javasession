package com.learning.multitasking;

public class FirstProgram {
	
	public static void customThread() {
		
		Thread t2 = Thread.currentThread();		
		t2.setName("Capstone");		
		t2.setPriority(Thread.MIN_PRIORITY);		
		System.out.println(t2);
	}

	public static void main(String[] args) {
		
		Thread t1 = Thread.currentThread();		
		t1.setName("Trinity");		
		t1.setPriority(7);		
		System.out.println(t1);		
		customThread();

	}

}
