package org.java.operatorEx;

import java.util.Scanner;

public class operatorEx5 {

	public static void main(String[] args) {
		
		System.out.println("�� ������");
		
		System.out.println("&&"); // ��� ������ true�϶��� true
		System.out.println(true&&true);
		System.out.println(true&&false);
		System.out.println(false&&true);
		System.out.println(false&&false);
		
		
		System.out.println("||"); // �ϳ� �̻��� ������ true�� true
		System.out.println(true||true);
		System.out.println(true||false);
		System.out.println(false||true);
		System.out.println(false||false);
		
		System.out.println("^"); // ���� �ٸ��� true
		System.out.println(true^true);
		System.out.println(true^false);
		System.out.println(false^true);
		System.out.println(false^false);
		
		System.out.println("!"); // �ݴ� toggle-> ����ġ
		System.out.println(!true);
		System.out.println(!false);
		
		//���̵�� ��й�ȣ�� ��ġ�ϸ� �α��� ���� ��ġ ���� ������ �α��� ����
		
		String Id="Id2222";
		String Pw="Pw2222";
		
		System.out.println(Id.equals("Id2222"));
		System.out.println(Pw.equals("Pw2222"));
		
		System.out.println(Id.equals("Id2222") && Pw.equals("Pw2222"));
		
		Scanner scn=new Scanner(System.in);
		System.out.println("���̵�: ");
		String userId=scn.next();
		
		Scanner key=new Scanner(System.in);
		System.out.println("��й�ȣ: ");
		String userPw=key.next();
		
		if((Id.equals(userId))&&(Pw.equals(userPw))) {
			System.out.println("�α��� ����");
		} else {
			System.out.println("�α��� ����");
		}
		
		scn.close();
		key.close();
		
		//���̵�� ��й�ȣ�� �Է¹޾Ƽ�
		// �Է¹��� ���̵� dbId�� �Է¹��� ��й�ȣ dbPw�� ���ÿ� ��ġ �ϸ�
		// �ֿܼ� "�α��� ����" ������ �ϸ� "�α��� ����"�� ��µǵ��� ���α׷��� �Ͻÿ�.
		// Scanner, equals, &&, if~else���� Ȱ���Ͽ� �ۼ��Ͻÿ�.
		
	}
}
