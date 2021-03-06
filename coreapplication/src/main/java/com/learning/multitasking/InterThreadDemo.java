package com.learning.multitasking;


class Customer {
	int amount = 10000;
	synchronized void withdraw(int withdrawAmount) {
		System.out.println("going to withdraw..");
		if(this.amount<withdrawAmount) {
			System.err.println("Less balance; Request to Deposit..");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.amount = this.amount - withdrawAmount;
		System.out.println("Withdraw Completed.");
	}
	synchronized void deposit(int depositAmount) {
		System.out.println("going to deposit..");
		this.amount += depositAmount;
		System.out.println("deposit completed.");
		notify();
	}
}

public class InterThreadDemo {
	public static void main(String[] args) {
		final Customer customer = new Customer();
		new Thread() {
			public void run() {
				customer.withdraw(15000);
			}
		}.start();
		new Thread() {
			public void run() {
				customer.deposit(10000);
			}
		}.start();
	}
}
