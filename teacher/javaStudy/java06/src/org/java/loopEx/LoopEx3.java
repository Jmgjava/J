package org.java.loopEx;

import java.util.Scanner;

public class LoopEx3 {

	public static void main(String[] args) {
		System.out.println("�ݺ���");		
		System.out.println("while");
		
		Scanner scn=new Scanner(System.in);		
		// ������ �Է��ϸ�  ADMIN�Է��ϸ� ->  "����� ������ ADMIN�Դϴ�" ���
		// exit�Է��ϸ� while�� ����
		// �� ���ѹ� exit �̿��� ���ڿ��� �Է��ϸ� -> "�ٽ� �Է��� �ּ���" ���
		// while�� �̿��ؼ� �ۼ�, ���ǹ� -> switch , if
		
		boolean bool=true;
		
		while(bool) {	// true�� ���� ���� -> false, ����
			
			System.out.println("������ �Է��ϼ���(ADMIN,MEMBER,SELLER)");		
			String user_ROLE=scn.next();
			
			switch(user_ROLE) {
			case "ADMIN":
				System.out.println("����� ������ ADMIN�Դϴ�" );
				break;
			case "MEMBER":
				System.out.println("����� ������ MEMBER�Դϴ�" );
				break;
			case "SELLER":
				System.out.println("����� ������ SELLER�Դϴ�" );				
				break;
			case "exit":
				System.out.println("�����մϴ�." );
				bool=false; // while�� ����
				break;
			default:
				System.out.println("�ٽ� �Է��� �ּ���" );		
			}//break
			
		}
		
//		System.out.println("main ����");
		
	}
}
