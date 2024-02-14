package org.java.guiEx;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.concurrent.Flow;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MouseEventEx1Sub implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("mouseClicked -> ���콺�� ������ ���� ��� �߻�");

	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("mousePressed -> ���콺�� ������ ���� ��");

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("mouseReleased -> ���콺�� ���� ��");

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("mouseEntered -> ��ġ�� ���Ե��� ��");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("mouseExited -> ��ġ�� ����� ��");

	}

}

public class MouseEventEx1 extends JFrame {

	public MouseEventEx1() {
		this.setTitle("MouseEvent");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());

//		this.getContentPane();
//		JPanel jPanel = new JPanel();

		JButton btn1 = new JButton("MouseEvent1");
		btn1.setSize(100, 50);

		// ������ �θ� ��ü������
		MouseListener mouseEvent = new MouseEventEx1Sub();

		// �̺�Ʈ ���ε�
		btn1.addMouseListener(mouseEvent);

		this.add(btn1);
		this.setLocation(500, 200);
		this.setSize(300, 200);
		this.setVisible(true);

	}

	public static void main(String[] args) {

		System.out.println("MouseEvent");

		new MouseEventEx1();
	}

}
