package org.java.oopEx;

public class ConstructExmain {

	public static void main(String[] args) {
		// �ν��Ͻ�ȭ
		// new -> ��ü ����
		ConstructEx c1 = new ConstructEx();
		c1.setUserId("m1");
		System.out.println(c1.getUserId());

		// �Ű����� 1
		ConstructEx c2 = new ConstructEx("m111");
		// ��ü ���� �� ���� ����
		c2.setUserId("m222"); // �̹� ������ ���� ����
		System.out.println(c2.getUserId());

		// �Ű����� 2
		ConstructEx c3 = new ConstructEx("22", "m22");

		System.out.println(c3.getUserId());
		System.out.println(c3.getUserPw());

		// �Ű����� 3
		ConstructEx c4 = new ConstructEx("333", "m333", 24);

		System.out.println(c4.getUserPw());
		System.out.println(c4.getUserId());
		System.out.println(c4.getAge());

	}
}
