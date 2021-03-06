package com.learning.exception;

public class FirstDemo {
	
	static void noHandle() {
		System.out.println("Begin the Program.");
		int a = 10;
		int b = 0;
		int c = a/b;
		System.out.println("After Division, "+c);
		System.out.println("End the Program.");
	}
	
	static void handle() {
		System.out.println("Begin the Program.");
		int a = 10;
		int b = 0;
		int c = 0;
		try {
			c = a/b;
		} catch(Exception ex) {
			System.err.println("Error Occured."+ex.getMessage());
		} finally {
			System.out.println("Finlly Block, After Division, "+c);
		}		
		System.out.println("End the Program.");
	}

	public static void main(String[] args) {
		//noHandle();
		handle();
	}

}
