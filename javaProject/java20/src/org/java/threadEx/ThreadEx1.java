package org.java.threadEx;


// ThreadŬ������ ��� �޾Ƽ� run() �������̵�
// 1.Thread ����
class ThreadSub extends Thread {
	// Thread Ŭ���� -> run() ����
	@Override
	public void run() {
		System.out.println("Thread run() �޼ҵ�");
	}
}

public class ThreadEx1 {

	public static void main(String[] args) {
		System.out.println("Thread");
		ThreadSub thread1 = new ThreadSub();
		thread1.run();
		thread1.start(); // Thread ����
	}

}
