package org.java.constraint;

public class ClassBasicMain {

	public static void main(String[] args) {

		// Ŭ����(static)��� Ŭ������.Ŭ�������
		ClassBasic.num3 = 25;

		// Ŭ�����޼ҵ�
		ClassBasic.staticMethod();

//		new Scanner(System.in);

		System.out.println("Ŭ����");
		// new -> ��ü ���� ������
		// ������(construct)-> ��ü ������ ������ �ִ� �޼ҵ�
		// Ŭ����(��������� Ÿ��) -> ClassBasic
		// c1-> ��ü ���� ���� -> ������ ��ü�� �ּҰ��� ����
		// c1-> �ν��Ͻ�, ��ü
		// �ν��Ͻ�ȭ-> ��üȭ
		ClassBasic c1 = new ClassBasic();
		// . ��ü���� ������
		c1.num1 = 100;
		c1.num2 = 200;

		// �޼ҵ带 ȣ��(call)-> �޼ҵ��()
		// �޼ҵ��� �����ο� ������ ��ɾ�(����)�� �����ȴ�.
		c1.instanceMethod();

		System.out.println(c1.num3 + "<< num3");

		System.out.println(c1.num1 + c1.num2);

		ClassBasic c2 = new ClassBasic();
		c2.num1 = 100;
		c2.num2 = 200;

		// Ŭ����(static) ��� -> �����ϰ� ���� ������ ����
		System.out.println(ClassBasic.num3);
		ClassBasic.num3 = 90;
		System.out.println(ClassBasic.num3);
		System.out.println(c1.num3 + "<< num3");
	}

}
