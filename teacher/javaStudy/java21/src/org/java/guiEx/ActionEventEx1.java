package org.java.guiEx;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class ActionListenerSub1 implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e);// 이벤트 
		System.out.println(e.getSource());// 이벤트 바인딩 객체
		System.out.println(e.getID());    // ID
	}
}

public class ActionEventEx1 extends JFrame {

	public ActionEventEx1() {
		this.setTitle("ActionListener");
//		this.setLayout(new FlowLayout());
		
		Container container=this.getContentPane();
		container.setLayout(new FlowLayout());
		
		JButton btn=new JButton("BUTTON");
		btn.setSize(100, 50);	
		
		ActionListenerSub1 action1= new ActionListenerSub1();
		
		btn.addActionListener(action1);
		
		container.add(btn);		
		
		this.setLocation(700, 300);
		this.setSize(400, 200);
		this.setVisible(true);
		
	}
	public static void main(String[] args) {
		System.out.println("ActionListener");
		
		new ActionEventEx1();
	}
}
