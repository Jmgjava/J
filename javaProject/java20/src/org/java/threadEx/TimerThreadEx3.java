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
		System.out.println("Thread �ǽ�");

		// 1.JFrame ����
		JFrame jFrame = new JFrame("Thread Test");
//		jFrame.setTitle("Thread Test");
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 2.Container ���� -> ������Ʈ�� ��Ƶ�~
		Container container = jFrame.getContentPane();
		container.setLayout(new FlowLayout());

		// 3.Label ����
		JLabel jLabel = new JLabel();
		jLabel.setFont(new Font("arial", Font.BOLD, 100));
		// 4.label -> �г� �����̳ʿ� �߰�
		container.add(jLabel);

		// 5.JFrame ũ�� ����
		jFrame.setSize(500, 500);

		// 6.JFrame visible ����
		jFrame.setVisible(true);

		// 7.Thread ����
		TimerThread3 thread = new TimerThread3(jLabel);
		thread.start();
	}
}
