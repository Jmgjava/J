package org.java.guiEx;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ActionEventEx4 extends JFrame implements ActionListener {

	JButton btn = null;
	JButton btn2 = null;
	JButton btn3 = null;

	public ActionEventEx4() {
		this.setTitle("ActionListener");
		this.setLayout(new FlowLayout());

		Container container = this.getContentPane();
		container.setLayout(new FlowLayout());

		btn = new JButton("Button1");
		btn.setSize(100, 50);

		btn2 = new JButton("Button2");
		btn.setSize(100, 50);

		btn3 = new JButton("Button3");
		btn.setSize(100, 50);

		container.add(btn);
		container.add(btn2);
		container.add(btn3);

		this.setLocation(700, 500);
		this.setSize(200, 150);
		this.setVisible(true);

		// ActionListener ���� ���� ���� ��ü this -> addActionListener(this)
		// ���� ��ü �̺�Ʈ�� ��� -> �ΰ� �̻��� ��ü�� ACtionEvent�� ��
		btn.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println(e); // �̺�Ʈ
		System.out.println(e.getSource()); // �̺�Ʈ ���ε� ��ü
//		System.out.println(e.getID()); // ���̵�

		if (e.getSource() == btn) {
			System.out.println("btn");
		} else if (e.getSource() == btn2) {
			System.out.println("btn2");
		} else if (e.getSource() == btn3) {
			System.out.println("btn3");
		} else {
			System.out.println("Ŭ���� ��ü�� �������� �ʽ��ϴ�.");
		}
	}

	public static void main(String[] args) {
		System.out.println("Action");

		new ActionEventEx4();

	}

}
