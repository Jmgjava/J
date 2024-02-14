package org.java.oopEx;

import java.util.Scanner;

public class ClassBaicMain {

	public static void main(String[] args) {

		// Ŭ����(static)�ɹ� Ŭ������.Ŭ�����ɹ�
		ClassBasic.num3 = 25;
		// Ŭ�����ż���
		ClassBasic.staticMethod();

//		new Scanner(System.in);

		System.out.println("Ŭ����");
		// new-> ��ü ���� ������
		// ������(Construct) -> ��ü ������ ������ �ִ� �ż���
		// Ŭ����(��������� Ÿ��) -> ClassBasic
		// c1->��ü ���� ����-> ������ ��ü�� �ּҰ��� ����
		// c1-> �ν��Ͻ�, ��ü
		// �ν��Ͻ�ȭ-> ��üȭ
		ClassBasic c1 = new ClassBasic();
		// . ��ü���� ������
		c1.num1 = 100;
		c1.num2 = 200;
		// �ż��带 ȣ��(call)-> �ż����()
		// �ż����� �����ο� ������ ���ɾ�(����)�� �����ȴ�.
		c1.instanceMethod();

		System.out.println(c1.num3 + " << num3");

		System.out.println(c1.num1 + c1.num2);

		ClassBasic c2 = new ClassBasic();
		c2.num1 = 10;
		c2.num2 = 20;
		c2.instanceMethod();

		// Ŭ����(static) �ɹ� -> �����ϰ� ���� ������ ����
		System.out.println(ClassBasic.num3);
		ClassBasic.num3 = 90;
		System.out.println(ClassBasic.num3);

		System.out.println(c1.num3 + " << num3");

	}
}