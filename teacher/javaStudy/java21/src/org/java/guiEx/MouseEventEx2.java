package org.java.guiEx;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MouseEventEx2 extends JFrame {

	public MouseEventEx2() {

		this.setTitle("MouseEvent");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());

//		this.getContentPane();		
//		JPanel jPanel=new JPanel();

		JButton btn = new JButton("MouseEvent");
		btn.setSize(100, 50);

		// 이벤트 바인딩
		// 익명 클래스 -> MouseListener 구현
		btn.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("mouseClicked -> click : \"마우스를 눌렀다 뗐을 때 \" *****");
			}

			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("mousePressed ->  mousedown : \"마우스를 누르고 있을 때\"");
			}

			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("mouseReleased ->  mouseup :       \"마우스를 뗐을 때\"");
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("mouseEntered ->  mouseover : \"위치에 포함 됬을 때\"");
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("mouseExited ->  mouseout   : \"위치를 벗을 났을 때\"");
			}
		});

		this.add(btn);
		this.setLocation(800, 300);
		this.setSize(300, 200);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		System.out.println("MouseEvent");

		new MouseEventEx2();
	}
}
