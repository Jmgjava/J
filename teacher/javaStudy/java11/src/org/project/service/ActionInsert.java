package org.project.service;

import java.util.Scanner;

public class ActionInsert extends ExcuteCommend {

	@Override
	public void excuteQueryService() {
		
		System.out.println("ȸ������");		
		Scanner input=new Scanner(System.in);
		
		System.out.print("ȸ����ȣ: ");
		int no=input.nextInt();//ȸ����ȣ
		
		System.out.print("ȸ�����̵�: ");
		String userId=input.next();//ȸ�����̵�

		System.out.print("ȸ�������ȣ: ");
		String userPw=input.next();//ȸ�������ȣ
		
		System.out.print("ȸ���̸�: ");
		String name=input.next();//ȸ���̸�
		
		System.out.print("ȸ������: ");
		int age=input.nextInt();//ȸ������
		
		System.out.print("ȸ����ȭ��ȣ: ");
		String phone=input.next();//ȸ����ȭ��ȣ
		
		// ȸ������ ȸ�� ������ ���
		System.out.print("ȸ����ȣ: "+no+", ");
		System.out.print("ȸ�����̵�: "+userId+", ");
		System.out.print("ȸ�������ȣ: "+userPw+", ");
		System.out.print("ȸ���̸�: "+name+", ");
		System.out.print("ȸ������: "+age+", ");
		System.out.println("ȸ����ȭ��ȣ: "+phone);
				
		
	}
}
