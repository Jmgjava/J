package org.java.guiEx;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SwingEx3 extends JFrame {

	public SwingEx3() {

		this.setTitle("Swing Menu");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout(FlowLayout.LEFT));

		JMenuBar jMenuBar = new JMenuBar();

		JMenu jMenu1 = new JMenu("파일(F)");
		JMenu jMenu2 = new JMenu("도움말(H)");

		JMenuItem newItem = new JMenuItem("새파일(N)");
		JMenuItem saveItem = new JMenuItem("저장(S)");
		JMenuItem openItem = new JMenuItem("열기(O)");
		JMenuItem closeItem = new JMenuItem("닫기(C)");

		JMenuItem searchItem = new JMenuItem("찾기(H)");

		jMenu1.add(newItem);
		jMenu1.add(saveItem);
		jMenu1.add(openItem);
		jMenu1.add(closeItem);

		jMenu2.add(searchItem);

		jMenuBar.add(jMenu1);
		jMenuBar.add(jMenu2);
		jMenuBar.add(jMenu2);

		this.add(jMenuBar);
		this.setLocation(600, 300);
		this.setSize(400, 200);// 프레임 사이즈 설정
		this.setVisible(true);// 보이기

		closeItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("종료");
				System.out.println(this);
				closeFn();
			}
		});
	}

	public void closeFn() {
		System.out.println("종료X");
		this.setVisible(false);		
	}

	public static void main(String[] args) {
		System.out.println("Swing");
		new SwingEx3();
	}
}
