package org.java.GuiEx;

import java.awt.Container;
import java.awt.FlowLayout;
import java.util.concurrent.Flow;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SwingEx2 extends JFrame {

	JLabel idLabel, pwLabel, titleLabel, logoLabel;
	JTextField id; // id 입력 -> 입력값이 보임
	JPasswordField pw; // pw 입력 -> 입력값이 안보임
	JButton loginBtn, joinBtn; // 버튼 생성
	JTextArea memo; // textArea -> 글내용이 많을 때 (자기소개)
	JPanel idPanel, pwPanel, memberPanel; // Panel

	public SwingEx2() {
		this.setTitle("Swing2 Title");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container container = this.getContentPane();
		container.setLayout(new FlowLayout(FlowLayout.CENTER));
		// label
		titleLabel = new JLabel("ID&PW 를 입력하세요.");

		idLabel = new JLabel("ID:");
		pwLabel = new JLabel("PW:");
		// input
		id = new JTextField(10);
		pw = new JPasswordField(10);
		// Button
		loginBtn = new JButton("LOGIN");
		joinBtn = new JButton("JOIN");
		// textArea
		memo = new JTextArea(5, 20); // 5행 30열
		// 스크롤 -> 스윙의 컴포넌트는 스크롤바가 없다.
		JScrollPane scrollPane = new JScrollPane(memo);

		idPanel = new JPanel();
		pwPanel = new JPanel();
		memberPanel = new JPanel();

		// titleLabel 제목
		container.add(titleLabel);

		// 각각 Panel에 추가
		idPanel.add(idLabel);
		idPanel.add(id);

		pwPanel.add(pwLabel);
		pwPanel.add(pw);

		memberPanel.add(loginBtn);
		memberPanel.add(joinBtn);

		container.add(idPanel);
		container.add(pwPanel);
		container.add(memberPanel);

		container.add(scrollPane);

		this.setLocation(600, 300);
		this.setSize(250, 400);
		this.setVisible(true);

	}

	public static void main(String[] args) {
		System.out.println("Swing");

		new SwingEx2();
	}

}
