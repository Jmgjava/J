package org.java.guiEx;

import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class SwingEx1 extends JFrame implements ActionListener {

	JMenuBar jMenuBar = null;
	JMenu jMenu1, jMenu2, jMenu3;
	JMenuItem item1, item2, item3;
	JButton jButton = null;

	public SwingEx1() {

		this.setTitle("Swing Menu");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		// 1.�޴���
		jMenuBar = new JMenuBar();
		// 2.�޴�
		jMenu1 = new JMenu("�޴�1");
		jMenu2 = new JMenu("�޴�2");
		jMenu3 = new JMenu("�޴�3");
		// 2.������
		item1 = new JMenuItem("ITEM1");
		item2 = new JMenuItem("ITEM2");
		item3 = new JMenuItem("��â����");
		// ��ư ����
		jButton = new JButton("BUTTON");

		// �޴��� �������� �߰�
		jMenu1.add(item1);
		jMenu1.add(item2);
		jMenu1.add(item3);

		// �޴��ٿ� �޴��� �߰�
		jMenuBar.add(jMenu1);
		jMenuBar.add(jMenu2);
		jMenuBar.add(jMenu3);

		// �޴��ٿ� ��ư�� �߰�
		jMenuBar.add(jButton);

		// JFrame(this)�� �޴��ٸ� �߰�
		this.add(jMenuBar);

		this.setLocation(600, 300);
		this.setSize(600, 500);
		this.setVisible(true);

		// �����̺�Ʈ ����
		item1.addActionListener(this);
		item2.addActionListener(this);
		item3.addActionListener(this);
		jButton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == item1) {
			System.out.println("item1�̺�Ʈ����");
		} else if (e.getSource() == item2) {
			System.out.println("item2�̺�Ʈ����");
		} else if (e.getSource() == item3) {
			System.out.println("��â����");
			// ��â���� �ż���ȣ��
			openPop();
		} else if (e.getSource() == jButton) {
			System.out.println("����X");
			this.setVisible(false);
		} else {
			System.out.println("���� ����!!");
		}
	}

	private void openPop() {

		System.out.println("���̾�α� ");

		JPanel jPanel = new JPanel();
		Dialog dialog = new Dialog(this, "���̾�α�����");

		dialog.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));

		JButton closeBtn = new JButton("CLOSE");
		closeBtn.setPreferredSize(new Dimension(100, 30));// ���� ����

		jPanel.add(closeBtn);
		dialog.add(jPanel);

		dialog.setLocation(600, 300);
		dialog.setSize(500, 300);
		dialog.setVisible(true);

		closeBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dialog.setVisible(false);
			}
		});

	}

	public static void main(String[] args) {
		System.out.println("Swing");
		new SwingEx1();
	}

}
