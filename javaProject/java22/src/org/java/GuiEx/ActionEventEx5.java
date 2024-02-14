package org.java.GuiEx;

import java.awt.ActiveEvent;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class ActionEventListenerSub implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("ActionEvent -> 오버라이딩");

	}
}

public class ActionEventEx5 extends JFrame {

	public ActionEventEx5() {

		this.setTitle("ActionEvent");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout(FlowLayout.CENTER));

//		Container container = this.getContentPane();

		JButton jbutton1 = new JButton("Button1");
//		jbutton1.setSize(100, 200);
//		jbutton1.setBounds(0, 0, 100, 100);
		jbutton1.setPreferredSize(new Dimension(100, 50));

		JButton jbutton2 = new JButton("Button2");
//		jbutton2.setSize(100, 200);
//		jbutton2.setBounds(0, 0, 100, 100);
		jbutton2.setPreferredSize(new Dimension(100, 50));

		JButton jbutton3 = new JButton("Button3");
		jbutton3.setPreferredSize(new Dimension(100, 50));

		// 1. 구현객체 이용해서 ActionEvent Listener 구현
		ActionListener action = new ActionEventListenerSub();
		jbutton1.addActionListener(action);

		// 2. 익명(무명)클래스 이용해서
		jbutton2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("익명클래스 -> ActionEvent -> 오버라이딩");
			}
		});

		// 3. 람다식 구현
		jbutton3.addActionListener((ActionEvent e) -> {
			System.out.println("람다식 -> ActionEvent -> 오버라이딩");
		});

		this.add(jbutton3);
		this.add(jbutton2);
		this.add(jbutton1);
		this.setLocation(600, 300);
		this.setSize(300, 200);
		this.setVisible(true);
	}

	public static void main(String[] args) {

		new ActionEventEx5();

	}

}
