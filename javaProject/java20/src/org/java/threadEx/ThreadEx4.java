package org.java.threadEx;

class ThreadSub4 extends Thread {

	int count = 0; // thread Ƚ��
	String javaStr = "java Project2024";

	// 1�ʸ��� javaStr���ڿ� �ѱ��ھ� �ֿܼ� ���
	@Override
	public void run() {
		count++;
			System.out.println("Thread: " + count);

		for (int i = 0; i < javaStr.length(); i++) {
			// ���ڿ����� �ε����� �ش��ϴ� char(�ε���)
			System.out.print(javaStr.charAt(i));
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadEx4 {
	public static void main(String[] args) {
		ThreadSub4 t1 = new ThreadSub4();
		t1.start();

//		String javaStr="java Project2024";
//		System.out.println(javaStr.charAt(2));

	}
}
