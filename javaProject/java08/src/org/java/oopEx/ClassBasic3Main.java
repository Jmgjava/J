package org.java.oopEx;

public class ClassBasic3Main {

	public static void main(String[] args) {

		// Ŭ����(static)���
		// Ŭ������.���
		ClassBasic3.num3 = 100;
		System.out.println(ClassBasic3.num3);

		// �޼ҵ� -> ȣ��(call) -> return(��ȯ)���� ��ȣ���ϰ� ����
		// return���� ������ �޼ҵ尡 ����ȴ�.
		// ȣ���� ������ �������� ��ɹ��� ����ȴ�.
		ClassBasic3.staticMethod();

		// �ν��Ͻ�ȭ(��üȭ)
		// new -> ��ü ���� ������
		// c1 -> ��ü,�ν��Ͻ� -> ��ü�� �ּҰ� ����(��ü���� ����)
		ClassBasic3 c1 = new ClassBasic3();
		System.out.println(c1);
		System.out.println(c1.hashCode());
		// �ν��Ͻ� ��� -> �ʵ�, �޼ҵ�
		System.out.println(c1.num1); // int 0
		System.out.println(c1.name); // String null
		System.out.println(c1.arrInt); // �迭 null

		c1.num1 = 100;
		c1.num2 = 200;
		System.out.println(c1.num1 + c1.num2);

		c1.name = "�̸�";
		System.out.println(c1.name);

		c1.arrInt = new int[] { 1, 2, 3, 4, 5 };
		for (int i : c1.arrInt) {
			System.out.println(i + " ");
		}

		// private �ʵ忡 ���� -> �ʱ�ȭ setters
		c1.setUserId("m111");
		// private �ʵ忡 ���� -> ��ȸ
		c1.getUserId();
		System.out.println(c1.getUserId());

		c1.setUserPw("1111");
		c1.getUserPw();
		System.out.println(c1.getUserPw());
		
		//�ν��Ͻ� �޼ҵ�
		c1.instanceMethod();
		c1.instanceMethod();
		c1.instanceMethod();

	}

}
