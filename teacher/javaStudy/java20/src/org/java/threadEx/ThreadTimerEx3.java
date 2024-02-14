package org.java.threadEx;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

class TimerThread3 extends Thread {
	JLabel timerlabel;

	public TimerThread3(JLabel timerlabel) {
		super();
		this.timerlabel = timerlabel;
	}

	int count = 0;

	@Override
	public void run() {

		System.out.println("timer Thread -> ");

		while (true) {
			// int -> String
			timerlabel.setText(Integer.toString(count));
			try {
				Thread.sleep(1000); // 1�ʸ��� ����
			} catch (InterruptedException e) {
				e.printStackTrace();
				return;// run()����
			}
			count++;

		}
	}
}

public class ThreadTimerEx3 {

	public static void main(String[] args) {

		System.out.println("Thread�ǽ�");

		// 1. JFrame ����
		JFrame jFrame = new JFrame("Thread Test");
//		jFrame.setTitle("Thread Test");
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 3

		// 2. Container ���� -> ������Ʈ�� ��Ƶ�~
		Container container = jFrame.getContentPane();
		container.setLayout(new FlowLayout());

		// 3.Label ����
		JLabel jLabel = new JLabel();
		jLabel.setFont(new Font("Arial", Font.ITALIC, 100));
		// 4.Label -> �г�(�����̳�)�� �߰�
		container.add(jLabel);

		// 5.JFrame ũ�� ����
		jFrame.setSize(300, 200);

		// 6.JFrame ������~
		jFrame.setVisible(true);

		// 7. Thread ����
		TimerThread3 timer = new TimerThread3(jLabel);
		timer.start(); // Thread ����

	}
}
