package org.java.threadEx;

class ThreadSub4 extends Thread {

	int count = 0; // thread 횟수
	String javaStr = "java Project2024";

	// 1초마다 javaStr문자열 한글자씩 콘솔에 출력
	@Override
	public void run() {
		count++;
			System.out.println("Thread: " + count);

		for (int i = 0; i < javaStr.length(); i++) {
			// 문자열에서 인덱스에 해당하는 char(인덱스)
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
