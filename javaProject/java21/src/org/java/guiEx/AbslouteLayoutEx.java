package org.java.guiEx;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AbslouteLayoutEx extends JFrame {

	public AbslouteLayoutEx() {
		this.setTitle("AbslouteLayout Sample"); // �������� Ÿ�̵� �ޱ�
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// ������ �����츦 ������ ���α׷� ����

		Container container = this.getContentPane();
		container.setLayout(null); // �⺻���� X -> �������� ���ġ

		JLabel jlabel = new JLabel("label");
		JTextField jtextfield = new JTextField("ID");
		JButton jbutton1 = new JButton("Button1");
		JButton jbutton2 = new JButton("Button2");
		
		jlabel.setOpaque(true); // ���� ���� �⺻ üũ
		jlabel.setBackground(Color.cyan);
		jlabel.setBounds(0, 0, 30, 30);
		
		jtextfield.setBounds(100, 0, 120, 80);
		
		jbutton1.setBounds(0, 0, 150, 60);
		
		jbutton2.setBounds(100, 100, 200, 40);
		
		container.add(jlabel);
		container.add(jtextfield);
		container.add(jbutton1);
		container.add(jbutton2);

//		IllegalArgumentException
//		this.add(container);

		this.setSize(400, 300);
		this.setVisible(true);

	}

	public static void main(String[] args) {
		System.out.println("Grid");

		new AbslouteLayoutEx();

	}

}
