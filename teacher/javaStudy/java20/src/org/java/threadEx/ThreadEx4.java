package org.java.threadEx;

class ThreadSub4 extends Thread{

	int count=0; //threadȽ��
	String javaStr="java Project2024";
	// 1�� ���� javaStr���ڿ� �ѱ��ھ� �ֿܼ� ���
	@Override
	public void run() {
		count++;
		System.out.println("Thread : "+count);
	
		for(int i=0;i<javaStr.length();i++) {
			//���ڿ����� �ε����� �ش��ϴ� char(�ѱ���)
			System.out.print(javaStr.charAt(i));
			
			try {
				Thread.sleep(1000); // 1�� ����
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
		//���ڿ����� �ε����� �ش��ϴ� char(�ѱ���)
//		System.out.println(javaStr.charAt(2));
		
	}
}
