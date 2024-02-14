package org.java.guiEx;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseListenerEx5 extends JFrame {
	
	JPanel contentPane = new JPanel();
	// ����Ʈ������ ����� �г�
	JLabel la; // "hello" ���ڿ��� ����ϱ� ���� ���̺� ������Ʈ

	MouseListenerEx5() {
		
		setTitle("Mouse �̺�Ʈ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(contentPane); // ����Ʈ�� ����
		contentPane.setLayout(null); // ����Ʈ���� ��ġ������ ����
		contentPane.addMouseListener(new MyMouseListener());
		
		// ����Ʈ�ҿ� Mouse ������ �ޱ�
		la = new JLabel("hello"); // "hello" ���̺� ������Ʈ ����
		la.setSize(50, 20); // ���̺��� ũ�� 50x20�� ����
		la.setLocation(30, 30);// ���̺��� ��ġ (30,30)���� ����
		contentPane.add(la); // ���̺� ������Ʈ�� ����Ʈ���� �߰�
		setSize(200, 200);
		setVisible(true);
	}

	// Mouse ������ ����
	class MyMouseListener implements MouseListener {
		
		public void mousePressed(MouseEvent e) {
			int x = e.getX(); // ���콺 Ŭ�� ��ǥ x
			int y = e.getY(); // ���콺 Ŭ�� ��ǥ y
			la.setLocation(x, y);
			// ���̺��� ��ġ�� (x,y)�� �̵�
		}

		public void mouseReleased(MouseEvent e) {
		}

		public void mouseClicked(MouseEvent e) {
		}

		public void mouseEntered(MouseEvent e) {
		}

		public void mouseExited(MouseEvent e) {
		}
	}

	public static void main(String[] args) {
		new MouseListenerEx5();
	}
}
