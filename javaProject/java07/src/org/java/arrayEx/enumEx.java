package org.java.arrayEx;

import org.java.constraint.Role;

public class enumEx {

	
	// static -> Ŭ����(static) ��� -> Ŭ������.�̸�
	
	public static final String ADMIN="ROLE_ADMIN";
	public static final String MEMBER="ROLE_MEMBER";
	public static final String SELLER="ROLE_SELLER";
	
	enum USER_ROLE{
		ROLE_ADMIN, ROLE_MEMBER, ROLE_SELLER
	}
	
	public static void main(String[] args) {
		System.out.println("enum");
		System.out.println("������ ����: "+enumEx.ADMIN);// Ŭ������.Ŭ�������
		System.out.println("�Ϲ�ȸ�� ����: "+enumEx.MEMBER);// Ŭ������.Ŭ�������
		System.out.println("�Ǹ��� ����: "+enumEx.SELLER);// Ŭ������.Ŭ�������
		
		
		System.out.println("enum-> ��ȸ");
		System.out.println("���� ����: "+USER_ROLE.ROLE_ADMIN);// Ŭ������.Ŭ�������
		System.out.println("�Ϲ� ����: "+USER_ROLE.ROLE_MEMBER);// Ŭ������.Ŭ�������
		System.out.println("�Ǹ� ����: "+USER_ROLE.ROLE_SELLER);// Ŭ������.Ŭ�������
		
		System.out.println("enum-> ����");
		System.out.println("���� : "+Role.ROLE_ADMIN);
		System.out.println("�Ϲ� : "+Role.ROLE_MEMBER);
		System.out.println("�Ǹ� : "+Role.ROLE_SELLER);
		
	}
}
