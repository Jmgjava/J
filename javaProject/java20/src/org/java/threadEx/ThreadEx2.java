package org.java.threadEx;

class ThreadSub2 extends Thread {

	// �迭 int
	int[] arrInt = new int[10];
	// thread Ƚ�� üũ
	int count = 0;

	@Override
	public void run() {

		for (int i = 0; i < arrInt.length; i++) {
			count++; // 1234 10
			System.out.println("thread ����� " + count);
			System.out.println("�������� Thread:"+Thread.currentThread());
			
			arrInt[i] = count;
			
			try {
				Thread.sleep(1000); // 1�� ���� ���߾��ٰ� ����.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println(arrInt[i] + ", Ƚ��:" + count);
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
