package org.java.threadEx;

class ThreadSub2 extends Thread {

	// 배열 int
	int[] arrInt = new int[10];
	// thread 횟수 체크
	int count = 0;

	@Override
	public void run() {

		for (int i = 0; i < arrInt.length; i++) {
			count++; // 1234 10
			System.out.println("thread 실행수 " + count);
			System.out.println("실행중인 Thread:"+Thread.currentThread());
			
			arrInt[i] = count;
			
			try {
				Thread.sleep(1000); // 1초 동안 멈추었다가 실행.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println(arrInt[i] + ", 횟수:" + count);
		}
	}
}

public class ThreadEx2 {

	public static void main(String[] args) {
		System.out.println("Thread");
		ThreadSub2 t1 = new ThreadSub2();
		t1.start();

	}

}
