package org.java.innerclassEx;

public class InnerClassBasic {
	
	int num1;
	static int num2;

	// 인스턴스클래스
	class InstanceClass {
		int a;

		void m1() {
			System.out.println("m1");
		}
	}

	// static스클래스
	static class StaticClass {
		static int b;

		static void m2() {
			System.out.println("m2");
		}
	}

	void localClassMethod() {
		// 지역클래스
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

		// 인스턴스 클래스
//		InnerClassBasic.InstanceClass insClass=inner.new InstanceClass();		
		InnerClassBasic.InstanceClass insClass = new InnerClassBasic().new InstanceClass();
		insClass.a = 10;
		insClass.m1();

		// 지역(local)클래스 사용
		InnerClassBasic localclass = new InnerClassBasic();
		localclass.localClassMethod();

		// static클래스
		InnerClassBasic.StaticClass.b = 10;
		InnerClassBasic.StaticClass.m2();

	}

}
