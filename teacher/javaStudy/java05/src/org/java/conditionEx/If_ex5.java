package org.java.conditionEx;

import java.util.Scanner;

public class If_ex5 {

	public static void main(String[] args) {
		System.out.println("if��");
		// �����ͺ��̽��� ���� �Ǿ� �ִ� ���̵�,�����ȣ
		String dbId="root";
		String dbPw="1234";
		
		//���̵�, �����ȣ�� �Է� �޾Ƽ� �Ѵ� true��� "�α��� ����"
		//���̵�, �����ȣ�� �Է� �޾Ƽ� �ϳ��� falst��� "�α��� ����"
		// �ֿܼ� ���
		Scanner scn= new Scanner(System.in);
		
		System.out.print("���̵� �Է�: ");
		String userId=scn.next();
		
		System.out.print("�����ȣ �Է�: ");
		String userPw=scn.next();
		//1. �α��� ó��
		if(userId.equals(dbId) && userPw.equals(dbPw)) {
			System.out.println("�α��� ����");
		}else {
			System.out.println("�α��� ����");	
		}
		//2. �α��� ó��
		if(userId.equals(dbId)) {
			// ���̵� ��ġ
			if(userPw.equals(dbPw)) {
				System.out.println("�α��� ����");
			}else {
				System.out.println("�����ȣ�� ��ġ ���� �ʽ��ϴ�.");
				System.out.println("�α��� ����");
			}			
		}else {
			System.out.println("���̵� ��ġ ���� �ʽ��ϴ�.");
			System.out.println("�α��� ����");			
		}
		
		// -> ���� , �ΰ� -> �����ӿ�ũȭ ��Ŵ  -> Spring Security
		// �α��� ����, ����(ROLE), oAuth2.0
		
	}
}
