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

		Container container = this.getContentPane();
		container.setLayout(new FlowLayout());
		container.setBackground(Color.gray);

		JButton jbutton1 = new JButton("Button1");
		container.add(jbutton1);

		container.add(new JButton("Button2"));

		this.setSize(500, 500);
		this.setVisible(true);

	}

	public static void main(String[] args) {
		System.out.println("Pannel -> Container");

		new ContentPannelEx();
	}

}
