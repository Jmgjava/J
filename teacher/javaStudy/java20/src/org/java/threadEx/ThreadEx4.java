package org.java.threadEx;

class ThreadSub4 extends Thread{

	int count=0; //thread횟수
	String javaStr="java Project2024";
	// 1초 마다 javaStr문자열 한글자씩 콘솔에 출력
	@Override
	public void run() {
		count++;
		System.out.println("Thread : "+count);
	
		for(int i=0;i<javaStr.length();i++) {
			//문자열에서 인덱스에 해당하는 char(한글자)
			System.out.print(javaStr.charAt(i));
			
			try {
				Thread.sleep(1000); // 1초 정지
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}

public class ThreadEx4 {

	public static void main(String[] args) {
		ThreadSub4 t4= new ThreadSub4();
		t4.start();
		
		String javaStr="java Project2024";
		//문자열에서 인덱스에 해당하는 char(한글자)
//		System.out.println(javaStr.charAt(2));
		
	}
}
