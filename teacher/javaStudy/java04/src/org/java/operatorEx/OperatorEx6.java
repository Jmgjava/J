package org.java.operatorEx;

import java.util.Scanner;

public class OperatorEx6 {

	public static void main(String[] args) {
		System.out.println("������");
		
		System.out.println("=======Quiz======");
		
		//���̵� �� �����ȣ�� �Է� �޾Ƽ�  
		// �Է¹��� ���̵� dbId�� �Է¹��� �����ȣ�� dbPw�� ���ÿ� ��ġ �ϸ�  
		// �ֿܼ� "�α��� ����" ���� �ϸ� "�α��� ����"�� ��� �ǵ��� ���α׷��� �Ͻÿ�.
		//  Scanner, equals, &&, if~else�� �� Ȱ�� �Ͽ� �ۼ� �Ͻÿ�
		// �Է� ���� ���� �������� ���Ƿ� �ۼ�
		String dbId="green";
		String dbPw="1111";
		
		Scanner scn=new Scanner(System.in);
		
		System.out.print("���̵� �Է�: ");
		String userId=scn.next();// return(��ȯ) -> ���ڿ�
		
		System.out.print("�����ȣ �Է�: ");
		String userPw=scn.next();
		
		if(userId.equals(dbId) && userPw.equals(dbPw)) {
			System.out.println("�α��� ����");
		}else {
			System.out.println("�α��� ����");			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
