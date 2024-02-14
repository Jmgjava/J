package org.java.guiEx;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Menu;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class JFrameEx {

	public static void main(String[] args) {
		System.out.println("JFrame");

		// 1.JFrame 생성
		JFrame jframes = new JFrame(); // container 대체 가능
		// title생성
		jframes.setTitle("JFrame Title");
		// 기본적으로 x 클릭 후 JFrame 제거
		jframes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 기본 3
		// 2. Container 생성, 선택
		Container container = jframes.getContentPane(); // 생략 가능, jframe에 넣어도 문제 없음
//		container.setLayout(new FlowLayout()); // 컴포넌트 기본정리
		container.setLayout(new FlowLayout(FlowLayout.CENTER));

		// 3. JButton 생성
		JButton jbutton = new JButton();
		jbutton.setText("Button1");
		jbutton.setSize(200, 150);
		// 컨테이너에 추가
		container.add(jbutton);

		JButton jbutton2 = new JButton();
		jbutton2.setText("Button2");
		jbutton2.setSize(300, 250);
		container.add(jbutton2);

		JButton jbutton3 = new JButton("Button3");
		jbutton3.setSize(400, 350);
		container.add(jbutton3);

		JButton jbutton4 = new JButton("Button4");
		jbutton4.setSize(100, 50);
		container.add(jbutton4);

		// JLabel
		JLabel jlabel = new JLabel();
		jlabel.setText("label");
		jlabel.setSize(150, 100);
		container.add(jlabel);

		// 3-1.JMenubar -> 메뉴 구성 바
		JMenuBar jmenubar = new JMenuBar();
		jmenubar.setSize(200, 200);
		// 3-2. JMenu -> JMenuBar
		JMenu jmenu1 = new JMenu("program");
		// 3-3. JMenuItem -> JMenu
		JMenuItem jmenuitem1 = new JMenuItem("java");
		JMenuItem jmenuitem2 = new JMenuItem("SQL");

		// 3-4. JMenuItem -> JMenu 추가
		jmenu1.add(jmenuitem1);
		jmenu1.add(jmenuitem2);

		JMenu jmenu2 = new JMenu("Menu2");
		JMenu jmenu3 = new JMenu("Menu3");

		// JMenuBar에 메뉴를 추가
		jmenubar.add(jmenu1);
		jmenubar.add(jmenu2);
		jmenubar.add(jmenu3);

		// JMenuBar -> Container(JFrame)에 추가
//		jframes.add(jmenubar);
		container.add(jmenubar);

		// JFrame 크기
		jframes.setSize(500, 500);
		// visible 설정
		jframes.setVisible(true);
	}

}
