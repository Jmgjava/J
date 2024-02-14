package org.java.guiEx;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ActionEventEx3 extends JFrame {

	public ActionEventEx3() {
		this.setTitle("ActionListener");
		this.setLayout(new FlowLayout());

		Container container = this.getContentPane();
		container.setLayout(new FlowLayout());

		JButton btn = new JButton("Button1");
		btn.setSize(100, 50);

		// ���ٽ����� ActionListener ����
//		btn.addActionListener();

		btn.addActionListener((ActionEvent e) -> {
			// actionPerformed()
			System.out.println(e); // �̺�Ʈ
			System.out.println(e.getSource()); // �̺�Ʈ ���ε� ��ü
			System.out.println(e.getID()); // ��
		});

		container.add(btn);

		this.setSize(200, 150);
		this.setVisible(true);

	}

	public static void main(String[] args) {
		System.out.println("Action");

		new ActionEventEx3();

	}

}
