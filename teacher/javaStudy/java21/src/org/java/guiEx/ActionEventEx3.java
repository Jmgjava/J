package org.java.guiEx;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ActionEventEx3 extends JFrame {

	public ActionEventEx3() {
		
		this.setTitle("ActionListener");
//		this.setLayout(new FlowLayout());
		
		Container container=this.getContentPane();
		container.setLayout(new FlowLayout());
		
		JButton btn=new JButton("BUTTON");
		btn.setSize(100, 50);	
		
		// 람다식 ->  ActionListener 인터페이스 actionPerformed 구현
		btn.addActionListener((ActionEvent e)->{
			System.out.println(e);// 이벤트 
			System.out.println(e.getSource());// 이벤트 바인딩 객체
			System.out.println(e.getID());    // ID	
		});
		
		container.add(btn);		
		
		this.setLocation(700, 300);
		this.setSize(400, 200);
		this.setVisible(true);
		
	}
	public static void main(String[] args) {
		System.out.println("ActionListener");
		
		new ActionEventEx3();
	}
}
