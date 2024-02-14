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
		
		// ���ٽ� ->  ActionListener �������̽� actionPerformed ����
		btn.addActionListener((ActionEvent e)->{
			System.out.println(e);// �̺�Ʈ 
			System.out.println(e.getSource());// �̺�Ʈ ���ε� ��ü
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
