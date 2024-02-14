package org.java.threadEx;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

class TimerThread extends Thread {	
	//Swing 컴포넌트 
	JLabel timerLabel;// 타이머의 표시글

	//TimerThread 생성자
	public TimerThread(JLabel timerLabel) {
		super();
		this.timerLabel = timerLabel;
	}

	@Override // 스레드코드, run매서드가 종료하면 스레드도 종료
	public void run() {
		int num = 0;// 타이머카운트
		
		while (true) {
								//정수 -> 문자열 변환
			timerLabel.setText(Integer.toString(num));//0 1 2,,,
			num++;
			try {
				Thread.sleep(1000); // 1초동안..
			} catch (InterruptedException e) {
				e.printStackTrace();
				//InterruptedException 강제 스레드 종료 
				return;// 스레드 종료해라. -> run()  종료
			}
		}
	}

}

public class ThreadTimerEx extends JFrame {	
	
	//생성자
	public ThreadTimerEx() {
		// JFrame -> 설정
		// JFrame 시작
		setTitle("Thread Timer 예제");		
		//X눌렀을 때 종료		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();// 패널하나
		c.setLayout(new FlowLayout());

		// timerLaber
		JLabel timerLaber = new JLabel();// 타이머 값
						     //(글꼴, 굵기, 크기)
		timerLaber.setFont(new Font("Gothic", Font.BOLD, 120));
		c.add(timerLaber);
		// timerLaber
		
			// width,height
		setSize(500, 300);
		setVisible(true);// 보여라
		// JFrame 종료

		// Thread
		TimerThread thread = new TimerThread(timerLaber);
		thread.start();
	}

	public static void main(String[] args) {
		new ThreadTimerEx();
	}
}