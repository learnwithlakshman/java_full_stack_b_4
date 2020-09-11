package com.careerit.cj.day20;

class MyThread implements Runnable {

	@Override
	public void run() {
		System.out.println("Hello");

	}

}

public class LamdbaExample {

	public static void main(String[] args) {

		Thread t1 = new Thread(() -> {
			System.out.println("Hello");

		});
		Thread t2 = new Thread(() -> System.out.println("Hello"));
		t1.start();
		t2.start();

	}
}
