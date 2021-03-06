package com.learning.multitasking;

class Box extends Thread {
	Box(String name) {
		this.setName(name);
	}
	@Override
	public void run() {
		System.out.println(this.getName()+" Thread Run Method is begin.");
		for(int i=1;i<=5;i++) {
			System.out.println(this.getName()+" Thread execute "+i+" time/sec");
			try {
				Thread.sleep(1000);
			} catch(InterruptedException ie) {
				ie.printStackTrace();
			}			
		}
		System.out.println(this.getName()+" Thread is End.");
	}
}


public class SecondProgram {
	public static void main(String[] args) {
		Thread t1 = Thread.currentThread();
		System.out.println(t1.getName()+" Thread is active state.");
		Box obj1 = new Box("Trinity");
		obj1.start();		
		Box obj2 = new Box("Capstone");
		obj2.start();
		Box obj3 = new Box("Ohio");
		obj3.start();
		try {
			obj1.join();
			obj2.join();
			obj3.join();
		}catch(InterruptedException ie) {
			ie.printStackTrace();
		}		
		System.out.println(t1.getName()+" Thread is Inactive state.");
	}
}
