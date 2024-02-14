package org.java.threadEx;

// 2. Runnable인터페이스 구현
class ThreadSub3 implements Runnable {

	@Override
	public void run() {
		System.out.println("Runnable인터페이스 -> run() ");
	}
}

public class ThreadEx3 {

	public static void main(String[] args) {

		System.out.println("Thread");

		Runnable t1 = new ThreadSub3();
		Thread t2 = new Thread(t1);
		t2.start(); // Thread 시작

		////////////////////////////////////

		Thread t3 = new Thread(new ThreadSub3());
		t3.start(); // Thread 시작

		////////////////////////////////////
		Thread t4 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Runnable인터페이스 -> run() 익명클래스");
			}
		});
		t4.start();
		//////////////// 매서드 하나인 인터페이스 -> 람다식 /////////////
//		Thread t5=new Thread(()->System.out.println("Runnable인터페이스 -> run() 람다식")	);
		Thread t5 = new Thread(() -> {
			System.out.println("Runnable인터페이스 -> run() 람다식");
		});

		t5.start();// Thread 시작 start()

	}
}
