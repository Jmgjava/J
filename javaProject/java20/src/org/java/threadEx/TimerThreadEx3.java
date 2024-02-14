package org.java.threadEx;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

class TimerThread3 extends Thread {
	JLabel timerlabel;

	public TimerThread3(JLabel jLabel) {
		// TODO Auto-generated constructor stub
	}

	int count = 0;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
	}

}

public class TimerThreadEx3 {

	public static void main(String[] args) {
		System.out.println("Thread 실습");

		// 1.JFrame 생성
		JFrame jFrame = new JFrame("Thread Test");
//		jFrame.setTitle("Thread Test");
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 2.Container 생성 -> 컴포넌트에 모아둔~
		Container container = jFrame.getContentPane();
		container.setLayout(new FlowLayout());

		// 3.Label 생성
		JLabel jLabel = new JLabel();
		jLabel.setFont(new Font("arial", Font.BOLD, 100));
		// 4.label -> 패널 컨테이너에 추가
		container.add(jLabel);

		// 5.JFrame 크기 설정
		jFrame.setSize(500, 500);

		// 6.JFrame visible 설정
		jFrame.setVisible(true);

		// 7.Thread 연결
		TimerThread3 thread = new TimerThread3(jLabel);
		thread.start();
	}
}
