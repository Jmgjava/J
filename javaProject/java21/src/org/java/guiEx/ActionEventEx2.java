package org.java.guiEx;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ActionEventEx2 extends JFrame {

	public ActionEventEx2() {
		this.setTitle("ActionListener");
		this.setLayout(new FlowLayout());

		Container container = this.getContentPane();
		container.setLayout(new FlowLayout());

		JButton btn = new JButton("Button1");
		btn.setSize(100, 50);

		// �͸� Ŭ������ ActionListener ����
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(e); // �̺�Ʈ
				System.out.println(e.getSource()); // �̺�Ʈ ���ε� ��ü
				System.out.println(e.getID()); // ���̵�

			}
		});

		container.add(btn);

		this.setSize(200, 150);
		this.setVisible(true);

	}

	public static void main(String[] args) {
		System.out.println("Action");

		new ActionEventEx2();

	}

}
