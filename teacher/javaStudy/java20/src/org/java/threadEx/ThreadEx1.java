package org.java.threadEx;

//ThreadŬ������ ��� �޾Ƽ� run()�������̵� 
//1. Thread ����
class TheadSub extends Thread{	
	//TreadŬ���� ->run()���� 
	@Override
	public void run() {
		System.out.println("Thread run() ");
	}
}

public class ThreadEx1 {

	public static void main(String[] args) {
		System.out.println("Thread");
		TheadSub thread1= new TheadSub();
//		tread1.run();	
		thread1.start();// Thread���� 
		
	}
}
