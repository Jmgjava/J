package org.java.innerclassEx;

import java.lang.reflect.Member;

interface MemberImpl {
	int Insert();

	void select();

	int update();

	int delete();

	void login();

	int idchecked();

}

interface T1 {
	void m1();
}

// ���� �޼ҵ尡 �������� ��� ������ü �̿� ����
class MemberImplClass implements MemberImpl {

	@Override
	public int Insert() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void select() {
		// TODO Auto-generated method stub

	}

	@Override
	public int update() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void login() {
		// TODO Auto-generated method stub

	}

	@Override
	public int idchecked() {
		// TODO Auto-generated method stub
		return 0;
	}

}

public class AnonymousEx3 {

	public static void main(String[] args) {
		MemberImplClass m1 = new MemberImplClass();
		m1.Insert();
	
		new T1() {
			
			@Override
			public void m1() {
				System.out.println("�͸�(����)Ŭ���� ����");
			}
		}.m1();
		
	}
	
}
