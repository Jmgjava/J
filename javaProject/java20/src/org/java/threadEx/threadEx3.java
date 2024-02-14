package org.java.threadEx;

// 2.Runnable �������̽� ����
class ThreadSub3 implements Runnable {

	@Override
	public void run() {
		System.out.println("Runnable �������̽� -> run()");
	}
}

public class threadEx3 {

	public static void main(String[] args) {
		System.out.println("Thread");

		Runnable t1 = new ThreadSub3();
		Thread t2 = new Thread(t1);

		t2.start(); // Thread ����

		///////////////////////////////////////////

		Thread t3 = new Thread(new ThreadSub3());
		t3.start();

		///////////////////////////////////////////

		Thread t4 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Runnable �������̽� -> �͸�Ŭ����");

			}
		});
		t4.run();

		////////////////////////////////////////////////////////////

		Runnable t5 = () -> {
			System.out.println("Runnable �������̽� -> ���ٽ�");
		};
		t5.run();

		Thread t6 = new Thread(() -> {
			System.out.println("Runnable �������̽� -> ���ٽ� 2");
		});
		t6.start();
	}
}
