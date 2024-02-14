package org.java.guiEx;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SwingEx2 extends JFrame {

	JLabel idLabel,pwLabel,titleLabel,logoLabel;
	JTextField id; // 입력 -> 입력값이 보인다.
	JPasswordField password;// 입력 -> *****
	JButton loginBtn,joinBtn;// 버튼 생성 
	JTextArea memo;// textarea  -> 글내용이 많을 때(자기소개)
	JPanel idPanel,pwPanel,memberPanel; // Panel 
	
	
	public SwingEx2() {
//		super("Swing Commponents");
		this.setTitle("Swing Commponents");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		 Container container= this.getContentPane();
		 container.setLayout(new FlowLayout());
		 //Label
		 titleLabel=new JLabel("ID&PW를 입력하세요");
		 idLabel=new JLabel("ID:");
		 pwLabel=new JLabel("PW:");
		 //input
		 id=new JTextField(10);
		 password=new JPasswordField(10);
		 //Button
		 loginBtn=new JButton("LOGIN");
		 joinBtn=new JButton("JOIN");
		// textarea
		 memo=new JTextArea(5, 10);//5행 30열
		 //스크롤 -> 스윙의 컴포넌트는 스크롤바가 없다.
		 JScrollPane scrollPane=new JScrollPane(memo);		 		 
		 //panel추기화
		 idPanel=new JPanel();
		 pwPanel=new JPanel();
		 memberPanel=new JPanel();		 
		 // 각각 panel에 추가		 
		 idPanel.add(idLabel);
		 idPanel.add(id);
		 
		 pwPanel.add(pwLabel);
		 pwPanel.add(password);
		 
		 memberPanel.add(loginBtn);
		 memberPanel.add(joinBtn);
		 
		 //titleLabel
		 container.add(titleLabel);
		 container.add(idPanel);
		 container.add(pwPanel);
		 container.add(memberPanel);
		 container.add(scrollPane);
		
		this.setLocation(600, 300);
		this.setSize(200, 300);
		this.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		System.out.println("Swing");
		new SwingEx2();
	}
}
