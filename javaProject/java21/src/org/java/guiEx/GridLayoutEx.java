package org.java.guiEx;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GridLayoutEx extends JFrame {

	public GridLayoutEx() {
		this.setTitle("GridLayout Sample"); // 프레임의 타이들 달기
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// 프레임 윈도우를 닫으면 프로그램 종료

		GridLayout grid = new GridLayout(4, 2);
		// 4x2 격자의 GridLayout 배치 관리자 생성
		grid.setVgap(5); // 격자 사이의 수직 간격을 5px로 설정
		grid.setHgap(10); // 격자 사이의 수평 간격을 5px로 설정

//		this.setLayout(grid); // grid를 컨텐츠팬의 배치관리자로 지정
		this.setLayout(new GridLayout(4, 2, 5, 10));	 // row, col, hgap, vgap

		add(new JLabel("이름")); // 텍스트 표시
		add(new JTextField("")); // 텍스트 입력
		add(new JLabel("학번"));
		add(new JTextField(""));
		add(new JLabel("학과"));
		add(new JTextField(""));
		add(new JLabel("과목"));
		add(new JTextField(""));

		this.setSize(400, 300);
		this.setVisible(true);

	}

	public static void main(String[] args) {
		System.out.println("Grid");

		new GridLayoutEx();

	}

}
