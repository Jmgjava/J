package org.java.operatorEx;

import java.util.Scanner;

public class operatorEx6 {

	public static void main(String[] args) {
		
		//���̵�� ��й�ȣ�� �Է¹޾Ƽ�
		// �Է¹��� ���̵� dbId�� �Է¹��� ��й�ȣ dbPw�� ���ÿ� ��ġ �ϸ�
		// �ֿܼ� "�α��� ����" ������ �ϸ� "�α��� ����"�� ��µǵ��� ���α׷��� �Ͻÿ�.
		// Scanner, equals, &&, if~else���� Ȱ���Ͽ� �ۼ��Ͻÿ�.
		
		
		String Id="ddd222";
		String Pw="ppp222";
		
		Scanner IdKey=new Scanner(System.in);
		System.out.println("���̵�: ");
		String userId=IdKey.next();
		
		Scanner PwKey=new Scanner(System.in);
		System.out.println("��й�ȣ: ");
		String userPw=PwKey.next();
		
		if((Id.equals(userId)&&(Pw.equals(userPw)))){
			System.out.println("�α��� ����");
		} else {
			System.out.println("�α��� ����");
		}
		
		IdKey.close();
		PwKey.close();
		
				
	}
}
