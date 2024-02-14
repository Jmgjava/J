package org.java.GuiEx;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Flow;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SwingEx3 extends JFrame implements ActionListener {

	JLabel idLabel, pwLabel, titleLabel, logoLabel;
	JTextField id; // id 입력 -> 입력값이 보임
	JPasswordField pw; // pw 입력 -> 입력값이 안보임
	JButton loginBtn, joinBtn; // 버튼 생성
	JTextArea memo; // textArea -> 글내용이 많을 때 (자기소개)
	JPanel idPanel, pwPanel, memberPanel; // Panel

	JMenuBar bar = null;
	JMenu menu1, menu2;
	JMenuItem item1, item2, item3, item4;

	public SwingEx3() {

		this.setTitle("Swing3 title");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout(FlowLayout.CENTER));
		this.setLayout(new BorderLayout());

		bar = new JMenuBar();

		menu1 = new JMenu("파일(F)");
		menu2 = new JMenu("도움말(D)");

		item1 = new JMenuItem("새 파일(N)");
		item2 = new JMenuItem("열기(O)");
		item3 = new JMenuItem("저장(S)");
		item4 = new JMenuItem("닫기(C)");

		menu1.add(item1);
		menu1.add(item2);
		menu1.add(item3);
		menu1.add(item4);

		bar.add(menu1);
		bar.add(menu2);

		this.add(bar, BorderLayout.NORTH);

		this.setLocation(600, 300);
		this.setSize(300, 250);
		this.setVisible(true);

		item1.addActionListener(this);
		item2.addActionListener(this);
		item3.addActionListener(this);
		item4.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == item1) {
			System.out.println("새 파일");
		} else if (e.getSource() == item2) {
			System.out.println("열기");
		} else if (e.getSource() == item3) {
			System.out.println("저장");
		} else if (e.getSource() == item4) {
			System.out.println("닫기");
			this.setVisible(false);
		} else {
			System.out.println("잘못된 입력값");
		}

	}

	public static void main(String[] args) {
		System.out.println("Swing");

		new SwingEx3();
	}

}
