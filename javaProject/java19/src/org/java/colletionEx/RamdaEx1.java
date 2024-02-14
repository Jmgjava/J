package org.java.colletionEx;

interface In1 {
	abstract void m1();
}

interface In2 {
	abstract void m2(int num1, int num2);
}

interface In3 {
	abstract void m3(int num1);
}

//class In1Sub implements In1 {
//	@Override
//	public void m1() {
//		// TODO Auto-generated method stub
//	}
//}

public class RamdaEx1 {

	public static void main(String[] args) {

//		In3 in3 = (int num1) -> {
//			System.out.println(num1);
//		};
//		In3 in3 = (int num1) -> System.out.println(num1);
		In3 in3 = num1 -> System.out.println(num1);

		System.out.println("���ٽ�");

		// �͸� Ŭ���� -> �ϳ��� ���� -> �������̽� ������ü
		In1 in1 = new In1() {
			@Override
			public void m1() {
				System.out.println("�͸� Ŭ���� In1 �������̵�");
			}
		};
		in1.m1();

		// �͸� Ŭ���� -> �ϳ��� ���� -> �������̽� ������ü In2 ����

		In2 i2 = new In2() {

			@Override
			public void m2(int num1, int num2) {
				System.out.println("�͸� Ŭ����In2 �������̵� " + (num1 + num2));
			}
		};
		i2.m2(1, 2);

		// ���ٽ�
		// 1. ���� ��ɹ��� �ϳ��� {}���� ����
		In1 in11 = () -> System.out.println("���ٽ� ����(�͸� �޼ҵ�)");

		in11.m1();

		In2 in22 = (int num1, int num2) -> {
			System.out.println("���ٽ� ����(�͸� �޼ҵ�)");
			System.out.println(num1 + num2);
		};
		in22.m2(10, 20);

	}
}
