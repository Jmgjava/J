package org.java.guiEx;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ContentPannelEx extends JFrame {
	
	public ContentPannelEx() {
		
		this.setTitle("Container");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	    Container container=this.getContentPane();
	    container.setLayout(new FlowLayout());
	    container.setBackground(Color.green);
	    
	    JButton jBtn1= new JButton();
	    jBtn1.setText("BUTTON1");
	    
	    container.add(jBtn1);
	    container.add(new JButton("BUTTON2"));
	    
		this.setSize(300, 200);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		System.out.println("패널-> 컨테이너 ");
		
		new ContentPannelEx();
		
	}
}
