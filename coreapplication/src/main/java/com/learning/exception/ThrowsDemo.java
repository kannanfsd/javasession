package com.learning.exception;

public class ThrowsDemo {

	void m1() throws Exception {
		int sum = 10/0;
	}
	
	void m2()throws Exception {
		try {
			m1();
		}catch(Exception e) {
			System.err.println("Error Redirect to Parent Control.");
			throw e;
		}		
	}
	
	public static void main(String[] args) {
		ThrowsDemo obj = new ThrowsDemo();
		try {
			obj.m2();
		}catch(Exception e) {
			System.err.println("Error Occured: "+e.getMessage());
			e.printStackTrace();
		}
	}

}
