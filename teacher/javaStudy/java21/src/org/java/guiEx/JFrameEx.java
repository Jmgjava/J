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
		// 1. JFrame생성
		JFrame jframe = new JFrame();
		// title생성
		jframe.setTitle("JFrame test");
		// 기본적으로 x 클릭후 JFrame 제거
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 3

//		jframe.setLayout(new FlowLayout());

		// 2.Container생성 , 선택
		Container container = jframe.getContentPane(); // 생략 가능
		container.setLayout(new FlowLayout(FlowLayout.CENTER)); // 컴포넌트 기본 정려

		

		// 1. JMenuBar -> 메뉴 구성 바
		JMenuBar jMenuBar = new JMenuBar();
		jMenuBar.setSize(500, 50);
		
		// 2. JMenu  -> JMenuBar
		JMenu JMenu1= new JMenu("언어");
		
		// 3. JMenuItem -> JMenu	
		JMenuItem jMenuItem1=new JMenuItem();
		jMenuItem1.setText("java");	
		
		JMenuItem jMenuItem2=new JMenuItem("SQL");
		JMenuItem jMenuItem3=new JMenuItem("Servlet");
		
		// 4. JMenuItem -> JMenu 추가
		JMenu1.add(jMenuItem1);
		JMenu1.add(jMenuItem2);
		JMenu1.add(jMenuItem3);	
		
		JMenu JMenu2= new JMenu("MENU2");
		JMenu JMenu3= new JMenu("MENU3");
		
		// JMenuBar에 매뉴를 추가
		jMenuBar.add(JMenu1);
		jMenuBar.add(JMenu2);
		jMenuBar.add(JMenu3);
		
		
		// JMenuBar -> Container(JFrame)에 추가
//		jframe.add(jMenuBar);
		container.add(jMenuBar);
		
		
		// 3. JButton생성
		JButton jButton1 = new JButton();
		jButton1.setText("BUTTON1");
		jButton1.setSize(50, 50);
		// 컨테이너에 추가
		container.add(jButton1);

		JButton jButton2 = new JButton();
		jButton2.setText("BUTTON2");
		jButton2.setSize(50, 50);

		container.add(jButton2);

		JButton jButton3 = new JButton("BUTTON3");
		jButton3.setSize(50, 50);

		jframe.add(jButton3);

		JButton jButton4 = new JButton("BUTTON4");
		jButton4.setSize(50, 50);

		container.add(jButton4);

		// JLabel
		JLabel jLabel1 = new JLabel();
		jLabel1.setText("라벨");
		jLabel1.setSize(50, 50);

		container.add(jLabel1);

		
		
		
		// JFrame크기
		jframe.setSize(500, 300);
		// 보여라~
		jframe.setVisible(true);

	}
}
