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

		// 1. 메뉴바
		jMenuBar = new JMenuBar();
		// 2. 메뉴
		jMenu1 = new JMenu("메뉴1");
		jMenu2 = new JMenu("메뉴2");
		jMenu3 = new JMenu("메뉴3");
		// 3. 아이템
		item1 = new JMenuItem("아이템1");
		item2 = new JMenuItem("아이템2");
		item3 = new JMenuItem("아이템3");

		// 메에 아이템을 추가
		jMenu1.add(item1);
		jMenu1.add(item2);
		jMenu1.add(item3);

		// 메뉴바에 메뉴 추가
		jMenuBar.add(jMenu1);
		jMenuBar.add(jMenu2);
		jMenuBar.add(jMenu3);
		jMenuBar.add(btn1);

		// JFrame(this)의 메뉴바를 추가
		this.add(jMenuBar);
		this.setLocation(600, 300);
		this.setSize(600, 500);
		this.setVisible(true);

		// 다중 이벤트구현
		item1.addActionListener(this);
		item2.addActionListener(this);
		item3.addActionListener(this);
		btn1.addActionListener(this);

//		item1.addActionListener((ActionEvent e) -> {
//			System.out.println("item1 클릭");
//		});

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == item1) {
			System.out.println("item1 이벤트 구성");
		} else if (e.getSource() == item2) {
			System.out.println("item3 이벤트 구성");
		} else if (e.getSource() == item3) {
			System.out.println("item3 이벤트 구성");
			// 새창 띄우기 메소드 호출
			openPop();
		} else if (e.getSource() == btn1) {
			System.out.println("종료X");
			this.setVisible(false);
		} else {
			System.out.println("실행 오류");
		}

	}

	private void openPop() {
		System.out.println("다이얼로그");

		JPanel jPanel = new JPanel();
		Dialog dial = new Dialog(this, "다이얼로그제목");

		dial.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));

		JButton close = new JButton("Close");
		close.setPreferredSize(new Dimension(100, 50));
		; // 수동 변경

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
