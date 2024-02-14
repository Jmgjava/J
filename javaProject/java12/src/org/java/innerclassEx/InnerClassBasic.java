package org.java.innerclassEx;

public class InnerClassBasic {

	// �ν��Ͻ� Ŭ����
	class InstanceClass {
		int a;

		void m1() {
			System.out.println("m1");
		}
	}

	// static Ŭ����
	static class StaticClass {
		static int b;

		static void m2() {
			System.out.println("m2");
		}
	}

	void localClassMethod() {
		// ����Ŭ����
		class LocalClass {
			int c;

			void m3() {
				System.out.println("m3");
			}
		}
		LocalClass local = new LocalClass();
		local.c = 10;
		local.m3();
	}

	public static void main(String[] args) {

		InnerClassBasic inner = new InnerClassBasic();

		// �ν��Ͻ� Ŭ����
//		InnerClassBasic.InstanceClass insClass = inner.new InstanceClass(); // ���� Ŭ����
		InnerClassBasic.InstanceClass insClass = new InnerClassBasic().new InstanceClass();
		insClass.a = 10;
		insClass.m1();

		// static Ŭ����
		InnerClassBasic.StaticClass.m2();
		InnerClassBasic.StaticClass.b = 10;

		// ����(local)Ŭ���� ���
		InnerClassBasic localClass = new InnerClassBasic();
		localClass.localClassMethod();

	}

}
