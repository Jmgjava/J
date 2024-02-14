package org.java.guiEx;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.concurrent.Flow;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MouseEventEx2 extends JFrame {

	public MouseEventEx2() {
		this.setTitle("MouseEvent");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());

//		this.getContentPane();
//		JPanel jPanel = new JPanel();

		JButton btn1 = new JButton("MouseEvent1");
		btn1.setSize(100, 50);

//		MouseEventListenerSub mouseevent = new MouseEventListenerSub();
		// 이벤트 바인딩
		btn1.addMouseListener(new MouseEventListenerSub());

		this.add(btn1);
		this.setLocation(500, 200);
		this.setSize(300, 200);
		this.setVisible(true);

	}

	class MouseEventListenerSub implements MouseListener {
		@Override
		public void mouseClicked(MouseEvent e) {
			System.out.println("mouseClicked -> 마우스를 눌렀다 뗐을 경우 발생");

		}

		@Override
		public void mousePressed(MouseEvent e) {
			System.out.println("mousePressed -> 마우스를 누르고 있을 때");

		}

		@Override
		public void mouseReleased(MouseEvent e) {
			System.out.println("mouseReleased -> 마우스를 뗐을 때");

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			System.out.println("mouseEntered -> 위치에 포함됐을 때");
		}

		@Override
		public void mouseExited(MouseEvent e) {
			System.out.println("mouseExited -> 위치를 벗어낫을 때");

		}
	}

	public static void main(String[] args) {

		System.out.println("MouseEvent");

		new MouseEventEx2();
	}

}
