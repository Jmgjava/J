package org.java.threadEx;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

class TimerThread2 extends Thread {

	JLabel timerlabel;

	public TimerThread2(JLabel timerlabel) {
		super();
		this.timerlabel = timerlabel;
	}

	int count=0;
	
	@Override
	public void run() {
		
		System.out.println("timer Thread -> ");

		while(true) {
			count++;
							//int -> String 
			timerlabel.setText(Integer.toString(count));
			
			try {
				Thread.sleep(1000); // 1초마다 실행
			} catch (InterruptedException e) {
				e.printStackTrace();
				return;// run()종료 
			}
			
		}
	}
}

public class ThreadTimerEx2 extends JFrame {
	
	public ThreadTimerEx2() {

		System.out.println("기본생성자 -> ThreadTimerEx2");

		// JFrame 기본 설정
		this.setTitle("ThreadTimer2"); // JFrame -> 타이틀
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // X누르면 JFrame 제거

		Container container = this.getContentPane();// 컴포넌트의 컨테이너
		container.setLayout(new FlowLayout());// 컨테이너안에서 컴포넌트들의 기본 배치

		// 라벨 생성
		JLabel timerLabel = new JLabel();
		// 글꼴(font-family), 굵기(font-weight),크기(font-size)
		timerLabel.setFont(new Font("Gothic", Font.BOLD, 200));
		timerLabel.setText("Start!!");
//		timerLabel.setBackground(Color.CYAN);

		// 라벨 컨테이너에 추가
		container.add(timerLabel);

		this.setSize(500, 300);// width,height
		this.setVisible(true);// 보여라~
		
		// Thread
		TimerThread2 thread = new TimerThread2(timerLabel);
		thread.start();

	}

	public static void main(String[] args) {
		System.out.println("Thread실습");

		new ThreadTimerEx2();

	}
}
