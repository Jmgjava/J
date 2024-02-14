package org.java.guiEx;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MouseEventEx3 extends JFrame {

	public MouseEventEx3() {

		this.setTitle("MouseEvent");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());

//		this.getContentPane();		
//		JPanel jPanel=new JPanel();

		JButton btn = new JButton("MouseEvent");
		btn.setSize(100, 50);
		// MouseEventListenerSub mouseevent=new MouseEventListenerSub();
		// �̺�Ʈ ���ε�
		// ���� Ŭ����
		btn.addMouseListener(new MouseEventListenerSub());

		this.add(btn);
		this.setLocation(800, 300);
		this.setSize(300, 200);
		this.setVisible(true);
	}

	class MouseEventListenerSub implements MouseListener {

		@Override
		public void mouseReleased(MouseEvent e) {
			System.out.println("mouseClicked -> click : \"���콺�� ������ ���� �� \" *****");
		}

		@Override
		public void mousePressed(MouseEvent e) {
			System.out.println("mousePressed ->  mousedown : \"���콺�� ������ ���� ��\"");
		}

		@Override
		public void mouseExited(MouseEvent e) {
			System.out.println("mouseReleased ->  mouseup :       \"���콺�� ���� ��\"");
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			System.out.println("mouseEntered ->  mouseover : \"��ġ�� ���� ���� ��\"");
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			System.out.println("mouseExited ->  mouseout   : \"��ġ�� ���� ���� ��\"");
		}

	}

	public static void main(String[] args) {
		System.out.println("MouseEvent");

		new MouseEventEx3();
	}
}
