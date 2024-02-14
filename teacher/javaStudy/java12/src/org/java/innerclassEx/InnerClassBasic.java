package org.java.innerclassEx;

public class InnerClassBasic {
	
	int num1;
	static int num2;

	// �ν��Ͻ�Ŭ����
	class InstanceClass {
		int a;

		void m1() {
			System.out.println("m1");
		}
	}

	// static��Ŭ����
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
		local.m3();
		local.c = 10;
	}

	public static void main(String[] args) {
		
		Object ob=new InnerClassBasic();

		InnerClassBasic inner = new InnerClassBasic();

		// �ν��Ͻ� Ŭ����
//		InnerClassBasic.InstanceClass insClass=inner.new InstanceClass();		
		InnerClassBasic.InstanceClass insClass = new InnerClassBasic().new InstanceClass();
		insClass.a = 10;
		insClass.m1();

		// ����(local)Ŭ���� ���
		InnerClassBasic localclass = new InnerClassBasic();
		localclass.localClassMethod();

		// staticŬ����
		InnerClassBasic.StaticClass.b = 10;
		InnerClassBasic.StaticClass.m2();

	}

}
