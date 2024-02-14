package org.java.guiEx;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseListenerEx5 extends JFrame {
	
	JPanel contentPane = new JPanel();
	// 컨텐트팬으로 사용할 패널
	JLabel la; // "hello" 문자열을 출력하기 위한 레이블 컴포넌트

	MouseListenerEx5() {
		
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(contentPane); // 컨텐트팬 변경
		contentPane.setLayout(null); // 컨텐트팬의 배치관리자 삭제
		contentPane.addMouseListener(new MyMouseListener());
		
		// 컨텐트팬에 Mouse 리스너 달기
		la = new JLabel("hello"); // "hello" 레이블 컴포넌트 생성
		la.setSize(50, 20); // 레이블의 크기 50x20을 설정
		la.setLocation(30, 30);// 레이블의 위치 (30,30)으로 설정
		contentPane.add(la); // 레이블 컴포넌트를 컨텐트팬을 추가
		setSize(200, 200);
		setVisible(true);
	}

	// Mouse 리스너 구현
	class MyMouseListener implements MouseListener {
		
		public void mousePressed(MouseEvent e) {
			int x = e.getX(); // 마우스 클릭 좌표 x
			int y = e.getY(); // 마우스 클릭 좌표 y
			la.setLocation(x, y);
			// 레이블의 위치를 (x,y)로 이동
		}

		public void mouseReleased(MouseEvent e) {
		}

		public void mouseClicked(MouseEvent e) {
		}

		public void mouseEntered(MouseEvent e) {
		}

		public void mouseExited(MouseEvent e) {
		}
	}

	public static void main(String[] args) {
		new MouseListenerEx5();
	}
}
