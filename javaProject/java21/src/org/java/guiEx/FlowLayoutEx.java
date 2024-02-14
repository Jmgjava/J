package org.java.guiEx;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.nio.ByteOrder;
import java.util.concurrent.Flow;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx extends JFrame {

	public FlowLayoutEx() {

		this.setTitle("FlowLayout");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

//		Container container = this.getContentPane();
//		container.setLayout(new FlowLayout());
		
//		this.setLayout(new FlowLayout(FlowLayout.CENTER,100,50));
		this.setLayout(new BorderLayout());
		
		this.add(new JButton("add"),BorderLayout.EAST);
		this.add(new JButton("sub"),BorderLayout.WEST);
		this.add(new JButton("mul"),BorderLayout.SOUTH);
		this.add(new JButton("div"),BorderLayout.NORTH);
		this.add(new JButton("Calulate"),BorderLayout.CENTER);

		this.setSize(500, 500);
		this.setVisible(true);

	}

	public static void main(String[] args) {
		System.out.println("FlowLayout");

		new FlowLayoutEx();
	}

}
