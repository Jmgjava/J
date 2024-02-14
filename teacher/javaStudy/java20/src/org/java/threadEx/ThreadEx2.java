package org.java.threadEx;

class ThreadSub2 extends Thread {
	// 배열int
	int[] arrInt = new int[10];
	// thread 횟수 체크
	int count = 0;

	@Override
	public void run() {
		
		for (int i = 0; i < arrInt.length; i++) {
			count++;// 1234 10
			System.out.println("Thread 실행 -> 횟수: " + count);
			System.out.println("실행 중인 Thread: " + Thread.currentThread());
			arrInt[i] = count;

			try {
				Thread.sleep(1000); // 1초동안 멈추었다가 실행
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println(arrInt[i]);
		}
	}
}

public class ThreadEx2 {

	public static void main(String[] args) {
		System.out.println("Thread");
		ThreadSub2 t1 = new ThreadSub2();
		t1.start();// Thread시작

		System.out.println("실행 중인 main()- Thread: " + Thread.currentThread());
	}

}
