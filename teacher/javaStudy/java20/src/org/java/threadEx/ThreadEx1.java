package org.java.threadEx;

//Thread클래스를 상속 받아서 run()오버라이딩 
//1. Thread 구현
class TheadSub extends Thread{	
	//Tread클래스 ->run()구현 
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
		thread1.start();// Thread실행 
		
	}
}
