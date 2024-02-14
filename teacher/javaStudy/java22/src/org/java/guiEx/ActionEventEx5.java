package org.java.guiEx;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class ActionEventListenerSub implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("������ü -> ActionEvent -> �������̵�");
	}
}

public class ActionEventEx5 extends JFrame {

	public ActionEventEx5() {
		
		this.setTitle("ActionEvent");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout(FlowLayout.CENTER));

		JButton jButton1 = new JButton("BUTTON1");
//		jButton.setSize(100, 50);
//		jButton.setBounds(0, 0, 100, 100);
		jButton1.setPreferredSize(new Dimension(100, 30));// ���� ����

		JButton jButton2 = new JButton("BUTTON2");
		jButton2.setPreferredSize(new Dimension(100, 30));// ���� ����

		JButton jButton3 = new JButton("BUTTON3");
		jButton3.setPreferredSize(new Dimension(100, 30));// ���� ����

		// 1. ������ü �̿��ؼ� ActionEventListener����
		ActionListener action = new ActionEventListenerSub();
		jButton1.addActionListener(action);

		// 2. �͸�(����Ŭ����) �̿��ؼ�
		jButton2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("�͸�Ŭ���� -> ActionEvent -> �������̵�");
			}
		});
		// 3. ���ٽ� �̿��ؼ�
		jButton3.addActionListener((ActionEvent e) -> {
			System.out.println("���ٽ� -> ActionEvent -> �������̵�");
		});

		this.add(jButton1);
		this.add(jButton2);
		this.add(jButton3);
		this.setLocation(600, 300);
		this.setSize(300, 200);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		System.out.println("ActionEvent");

		new ActionEventEx5();
	}
}
