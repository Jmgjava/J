package org.java.conditionEx;

import java.util.Scanner;

public class If_ex1 {	
	
	public static void main(String[] args) {
		
		System.out.println("if");
		//1. ������ �ϳ��� ���
		// ����� ����  ������(ADMIN), �Ϲ�ȸ��(MEMBER), �Ǹ���(SELLER)
		System.out.println("������ ����: "+ Role.ROLE1);
		System.out.println("�Ϲ�ȸ�� ����: "+Role.ROLE2);
		System.out.println("�Ǹ��� ����: "+ Role.ROLE3);
		
		// �ֿܼ� ����� ������ �Է� �޾Ƽ�
		// ������ ADMIN ->  "�������������� �̵�"  �ֿܼ� ���
		// ������ MEMBER -> "�Ϲ�ȸ���������� �̵�"  �ֿܼ� ���
		// ������ SELLER -> "�Ǹ����������� �̵�"  �ֿܼ� ���
		// ��� �Ǿ� �ִ� ����		
		String user_ROLE="ADMIN";
		System.out.println("�������� ����: " +user_ROLE);
		
		Scanner scn=new Scanner(System.in);
		
		System.out.print("���� �Է�: ");
		String input_ROLE=scn.next();
		
		if(input_ROLE.equals("ADMIN")) {
			System.out.println("�������������� �̵��մϴ�.");
		}
		
		if(input_ROLE.equals("MEMER")) {
			System.out.println("�Ϲ�ȸ���������� �̵��մϴ�.");
			
		}
		
		if(input_ROLE.equals("SELLER")) {
			System.out.println("�Ǹ����������η� �̵��մϴ�.");			
		}
		
		
	}
}
