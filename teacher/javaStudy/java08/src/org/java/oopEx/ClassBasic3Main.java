package org.java.oopEx;

public class ClassBasic3Main {

	public static void main(String[] args) {
		// Ŭ����(static)�ɹ�
		// Ŭ������.�ɹ�
		ClassBasic3.num3 = 1000;
		System.out.println(ClassBasic3.num3);
		// �ż��� -> ȣ��(call)-> return(��ȯ)���� ��ȯ�ϰ� ����
		// return���� ������ �ż��尡 ����
		// ȣ�� �Ҷ����� �������� ��ɹ� ����
		ClassBasic3.staticMethod();

		// �ν��Ͻ�ȭ(��üȭ)
		// new ->��ü ���� ������
		// c1 -> ��ü,�ν��Ͻ� -> ��ü�� �ּҰ� ����(��ü��������)
		ClassBasic3 c1 = new ClassBasic3();

		System.out.println(c1);
		System.out.println(c1.hashCode());
		// �ν��Ͻ� �ɹ� -> �ʵ�, �ż���
		System.out.println(c1.num1);// int 0
		System.out.println(c1.name);// String null
		System.out.println(c1.arrInt);// �迭 null

		c1.num1 = 100;
		c1.num2 = 200;
		System.out.println(c1.num1 + c1.num2);

		c1.name = "�̸�";
		System.out.println(c1.name);

		c1.arrInt = new int[] { 1, 2, 3, 4, 5 };
		for (int i : c1.arrInt) {
			System.out.print(i + " ");
		}
		System.out.println();

		// private �ʵ忡 ���� -> �ʱ�ȸ setters
		c1.setUserId("m111");
		// private �ʵ忡 ���� -> ��ȸ
		c1.getUserId();
		System.out.println(c1.getUserId());
		c1.setUserPw("1111");
		c1.getUserPw();
		System.out.println(c1.getUserPw());
		
		//�ν��Ͻ� �ż���
		c1.instancMethod();
		c1.instancMethod();
		c1.instancMethod();
		
		

	}
}
