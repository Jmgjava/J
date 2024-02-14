package org.java.guiEx;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ActionEventEx4 extends JFrame implements ActionListener {

	JButton btn1 = null;
	JButton btn2 = null;
	JButton btn3 = null;

	JLabel jLabel = null;

	public ActionEventEx4() {

		this.setTitle("ActionListener");
//		this.setLayout(new FlowLayout());

		Container container = this.getContentPane();
		container.setLayout(new FlowLayout(FlowLayout.CENTER));

		btn1 = new JButton("BUTTON1");
		btn1.setSize(100, 50);

		btn2 = new JButton("BUTTON2");
		btn2.setSize(100, 50);

		btn3 = new JButton("BUTTON3");
		btn3.setSize(100, 50);

		JPanel jPanel = new JPanel();
		jPanel.setSize(400, 50);
		jPanel.add(btn1);
		jPanel.add(btn2);
		jPanel.add(btn3);

		JPanel jPanel2 = new JPanel();
		jPanel2.setSize(400, 50);

		jLabel = new JLabel("");
		jLabel.setSize(400, 200);

		jPanel2.add(jLabel);

//		container.add(btn1);
//		container.add(btn2);
//		container.add(btn3);
		container.add(jPanel);
		container.add(jPanel2);

		this.setLocation(700, 300);
		this.setSize(400, 200);
		this.setVisible(true);

		// ActionListener 구현 받은 현재 객체 this-> addActionListener(this)
		// *** 다중 객체 이벤트에 사용 -> 2개 이상의 객체에 ActionEvent 설정
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println(e);
//		System.out.println(e.getSource());// 클릭한 객체를 Get
//		System.out.println(e.getID());		

		// 버튼의 텍스트 값 조회
		JButton jButton = (JButton) e.getSource();
		System.out.println(jButton.getText());

		if (e.getSource() == btn1) {
			System.out.println("btn1");
			// 매서드()
		} else if (e.getSource() == btn2) {
			System.out.println("btn2");
		} else if (e.getSource() == btn3) {
			System.out.println("btn3");
		} else {
			System.out.println("클릭한 객체가 존재 하지 않습니다.");
		}

	}

	public static void main(String[] args) {
		System.out.println("ActionListener");

		new ActionEventEx4();
	}
}
