package org.java.arrayEx;

import org.java.contraint.Role;

public class EnumEx {

	// static(����) ->Ŭ����(static) �ɹ� -> Ŭ������.�̸�
	public static final String ADMIN = "ROLE_ADMIN";
	public static final String MEMBER = "ROLE_MEMBER";
	public static final String SELLER = "ROLE_SELLER";

	enum USER_ROLE {
		ROLE_ADMIN, ROLE_MEMBER, ROLE_SELLER
	}

	public static void main(String[] args) {

		System.out.println("enum");
		System.out.println("������ ����: " + EnumEx.ADMIN);// Ŭ������.Ŭ�����ɹ�
		System.out.println("�Ǹ��� ����: " + EnumEx.SELLER);// Ŭ������.Ŭ�����ɹ�
		System.out.println("�Ϲ�ȸ�� ����: " + EnumEx.MEMBER);// Ŭ������.Ŭ�����ɹ�

		System.out.println("enum-> ��ȸ");
		System.out.println("������ ����: " + USER_ROLE.ROLE_ADMIN);//
		System.out.println("�Ǹ��� ����: " + USER_ROLE.ROLE_SELLER);//
		System.out.println("�Ϲ�ȸ�� ����: " + USER_ROLE.ROLE_MEMBER);//
		
		System.out.println("enum-> ����");
		System.out.println("������ ����: "+Role.ROLE_ADMIN);
		System.out.println("�Ǹ��� ����: " + Role.ROLE_SELLE);//
		System.out.println("�Ϲ�ȸ�� ����: " + Role.ROLE_MEMBER);//
		
		

	}
}
