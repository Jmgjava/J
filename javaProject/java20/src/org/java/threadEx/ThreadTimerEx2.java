package org.java.threadEx;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

class TimerThread2 extends Thread {

	JLabel timerlabel;

	public TimerThread2(JLabel timerlabel) {
		super();
		this.timerlabel = timerlabel;
	}

	int count = 0;

	@Override
	public void run() {
		System.out.println("timer Thread -> ");
		while (true) {
			count++;
//					int -> String
			timerlabel.setText(Integer.toString(count));

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				return; // 스레드 종료
			}
		}
	}

}

public class ThreadTimerEx2 extends JFrame {

	public ThreadTimerEx2() {
		System.out.println("기본 생성자 -> ThreadTimerEx2");
		this.setTitle("ThreadTimer2");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // X 누르면 JFrame 제거, 의무적으로 사용
		Container container = this.getContentPane(); // 컴포넌트의 컨테이너
		container.setLayout(new FlowLayout()); // 컨테이너내에서 컴포넌트들의 기본 배치

		// 라벨 생성
		JLabel timerLabel = new JLabel();
//							    	(글꼴, 굵기(font-weight), 크기(font-size))
		timerLabel.setFont(new Font("Gothic", Font.BOLD, 100));
		timerLabel.setText("기본값");

		// 라벨 컨테이너에 추가
		container.add(timerLabel);

		this.setSize(500, 300); // 너비, 높이 width, height
		this.setVisible(true); // 보이는지 여부 visible

		// Thread
		TimerThread2 thread = new TimerThread2(timerLabel);
		thread.start();
	}

	public static void main(String[] args) {
		System.out.println("Thread실습");

		new ThreadTimerEx2();
	}

}
