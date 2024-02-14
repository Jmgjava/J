package org.java.innerclassEx;

//�ܺ�Ŭ���� ->Outer
public class InnerClassBasic2 {
	// �ʵ�
	int num1; // �ν��Ͻ� �ɹ�
	// �ν��Ͻ� Ŭ����

	class InstanceClass {
		void m1() {
			System.out.println("�ν��Ͻ�Ŭ����");
		}
	}

	// static Ŭ����
	static class StaticClass {
		static final int NUM = 100;

		static void m2() {
			System.out.println("staticŬ����");
		}
	}

	// ����Ŭ����
	void localMethod(int age) { // 2
		class LocalClass {
			// 4
			void m3(int age) {
				System.out.println("����Ŭ����");
				System.out.println("����: " + age);// 5
			}
		}
		LocalClass local = new LocalClass();
		local.m3(age);// 3
	}

	public static void main(String[] args) {

		InnerClassBasic2 inner = new InnerClassBasic2();
		inner.num1 = 10;
		// ����Ŭ����
		inner.localMethod(30); // 1
		// �ν��Ͻ� Ŭ����
		InnerClassBasic2.InstanceClass insClass = new InnerClassBasic2().new InstanceClass();
		insClass.m1();

		// static Ŭ����
		System.out.println(InnerClassBasic2.StaticClass.NUM);
		InnerClassBasic2.StaticClass.m2();

	}
}
