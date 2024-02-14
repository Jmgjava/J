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

		// ActionListener 구현 받은 현재 객체 this -> addActionListener(this)
		// 다중 객체 이벤트에 사용 -> 두개 이상의 객체에 ACtionEvent실 행
		btn.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println(e); // 이벤트
		System.out.println(e.getSource()); // 이벤트 바인딩 객체
//		System.out.println(e.getID()); // 아이디

		if (e.getSource() == btn) {
			System.out.println("btn");
		} else if (e.getSource() == btn2) {
			System.out.println("btn2");
		} else if (e.getSource() == btn3) {
			System.out.println("btn3");
		} else {
			System.out.println("클릭한 객체가 존재하지 않습니다.");
		}
	}

	public static void main(String[] args) {
		System.out.println("Action");

		new ActionEventEx4();

	}

}
