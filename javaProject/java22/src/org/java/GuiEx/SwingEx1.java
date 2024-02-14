package org.java.GuiEx;

import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Flow;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class SwingEx1 extends JFrame implements ActionListener {

	JMenuBar jMenuBar = null;
//	JMenuBar jMenu1 = null;
//	JMenuBar jMenu2 = null;
//	JMenuBar jMenu3 = null;
	JMenu jMenu1, jMenu2, jMenu3;
//	JMenuItem item1 = null;
//	JMenuItem item2 = null;
//	JMenuItem item3 = null;
	JMenuItem item1, item2, item3;
	JButton btn1 = null;

	public SwingEx1() {

		this.setTitle("Swing Title");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout(FlowLayout.CENTER));

		btn1 = new JButton("Button1");

		// 1. �޴���
		jMenuBar = new JMenuBar();
		// 2. �޴�
		jMenu1 = new JMenu("�޴�1");
		jMenu2 = new JMenu("�޴�2");
		jMenu3 = new JMenu("�޴�3");
		// 3. ������
		item1 = new JMenuItem("������1");
		item2 = new JMenuItem("������2");
		item3 = new JMenuItem("������3");

		// �޿� �������� �߰�
		jMenu1.add(item1);
		jMenu1.add(item2);
		jMenu1.add(item3);

		// �޴��ٿ� �޴� �߰�
		jMenuBar.add(jMenu1);
		jMenuBar.add(jMenu2);
		jMenuBar.add(jMenu3);
		jMenuBar.add(btn1);

		// JFrame(this)�� �޴��ٸ� �߰�
		this.add(jMenuBar);
		this.setLocation(600, 300);
		this.setSize(600, 500);
		this.setVisible(true);

		// ���� �̺�Ʈ����
		item1.addActionListener(this);
		item2.addActionListener(this);
		item3.addActionListener(this);
		btn1.addActionListener(this);

//		item1.addActionListener((ActionEvent e) -> {
//			System.out.println("item1 Ŭ��");
//		});

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == item1) {
			System.out.println("item1 �̺�Ʈ ����");
		} else if (e.getSource() == item2) {
			System.out.println("item3 �̺�Ʈ ����");
		} else if (e.getSource() == item3) {
			System.out.println("item3 �̺�Ʈ ����");
			// ��â ���� �޼ҵ� ȣ��
			openPop();
		} else if (e.getSource() == btn1) {
			System.out.println("����X");
			this.setVisible(false);
		} else {
			System.out.println("���� ����");
		}

	}

	private void openPop() {
		System.out.println("���̾�α�");

		JPanel jPanel = new JPanel();
		Dialog dial = new Dialog(this, "���̾�α�����");

		dial.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));

		JButton close = new JButton("Close");
		close.setPreferredSize(new Dimension(100, 50));
		; // ���� ����

		jPanel.add(close);
		dial.add(jPanel);

		dial.setLocation(600, 300);
		dial.setSize(500, 300);
		dial.setVisible(true);

		close.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dial.setVisible(false);
			}
		});

	}

	public static void main(String[] args) {
		System.out.println("Swing");

		new SwingEx1();
	}

}
