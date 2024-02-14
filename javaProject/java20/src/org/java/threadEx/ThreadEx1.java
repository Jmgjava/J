package org.java.threadEx;


// Thread클래스를 상속 받아서 run() 오버라이딩
// 1.Thread 구현
class ThreadSub extends Thread {
	// Thread 클래스 -> run() 구현
	@Override
	public void run() {
		System.out.println("Thread run() 메소드");
	}
}

public class ThreadEx1 {

	public static void main(String[] args) {
		System.out.println("Thread");
		ThreadSub thread1 = new ThreadSub();
		thread1.run();
		thread1.start(); // Thread 실행
	}

}
