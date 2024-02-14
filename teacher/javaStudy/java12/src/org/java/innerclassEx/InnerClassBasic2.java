package org.java.innerclassEx;

//외부클래스 ->Outer
public class InnerClassBasic2 {
	// 필드
	int num1; // 인스턴스 맴버
	// 인스턴스 클래스

	class InstanceClass {
		void m1() {
			System.out.println("인스턴스클래스");
		}
	}

	// static 클래스
	static class StaticClass {
		static final int NUM = 100;

		static void m2() {
			System.out.println("static클래스");
		}
	}

	// 로컬클래스
	void localMethod(int age) { // 2
		class LocalClass {
			// 4
			void m3(int age) {
				System.out.println("로컬클래스");
				System.out.println("나이: " + age);// 5
			}
		}
		LocalClass local = new LocalClass();
		local.m3(age);// 3
	}

	public static void main(String[] args) {

		InnerClassBasic2 inner = new InnerClassBasic2();
		inner.num1 = 10;
		// 로컬클래스
		inner.localMethod(30); // 1
		// 인스턴스 클래스
		InnerClassBasic2.InstanceClass insClass = new InnerClassBasic2().new InstanceClass();
		insClass.m1();

		// static 클래스
		System.out.println(InnerClassBasic2.StaticClass.NUM);
		InnerClassBasic2.StaticClass.m2();

	}
}
