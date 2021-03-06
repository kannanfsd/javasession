package com.learning.multitasking;

class Table {
//	synchronized void printTable(int n) {
//		for(int i=1;i<=5;i++) {
//			System.out.println(n+" * "+i+" = "+(n*i));
//			try {
//				Thread.sleep(1000);
//			}catch(InterruptedException ie) {
//				ie.printStackTrace();
//			}
//		}
//	}
	void printTable(int n) {
		synchronized (this) {
			for(int i=1;i<=5;i++) {
				System.out.println(n+" * "+i+" = "+(n*i));
				try {
					Thread.sleep(1000);
				}catch(InterruptedException ie) {
					ie.printStackTrace();
				}
			}
		}		
	}
}
class Acer extends Thread {
	Table t;
	public Acer(Table t) {
		this.t = t;
	}
	@Override
	public void run() {
		t.printTable(6);
	}
}
class Lenovo extends Thread {
	Table t;
	public Lenovo(Table t) {
		this.t = t;
	}
	@Override
	public void run() {
		t.printTable(8);
	}
}
public class ThirdProgram {
	public static void main(String[] args) {
		final Table t = new Table();
		Acer acer = new Acer(t);
		Lenovo lenovo = new Lenovo(t);
		acer.start();
		lenovo.start();
	}
}
