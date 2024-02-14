package org.java.guiEx;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GridLayoutEx extends JFrame {

	public GridLayoutEx() {
		this.setTitle("GridLayout Sample"); // �������� Ÿ�̵� �ޱ�
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// ������ �����츦 ������ ���α׷� ����

		GridLayout grid = new GridLayout(4, 2);
		// 4x2 ������ GridLayout ��ġ ������ ����
		grid.setVgap(5); // ���� ������ ���� ������ 5px�� ����
		grid.setHgap(10); // ���� ������ ���� ������ 5px�� ����

//		this.setLayout(grid); // grid�� ���������� ��ġ�����ڷ� ����
		this.setLayout(new GridLayout(4, 2, 5, 10));	 // row, col, hgap, vgap

		add(new JLabel("�̸�")); // �ؽ�Ʈ ǥ��
		add(new JTextField("")); // �ؽ�Ʈ �Է�
		add(new JLabel("�й�"));
		add(new JTextField(""));
		add(new JLabel("�а�"));
		add(new JTextField(""));
		add(new JLabel("����"));
		add(new JTextField(""));

		this.setSize(400, 300);
		this.setVisible(true);

	}

	public static void main(String[] args) {
		System.out.println("Grid");

		new GridLayoutEx();

	}

}
