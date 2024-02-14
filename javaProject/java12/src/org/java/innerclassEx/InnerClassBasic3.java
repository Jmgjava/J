package org.java.innerclassEx;

import java.lang.reflect.Method;

import org.java.innerclassEx.InnerClassBasic.StaticClass;

public class InnerClassBasic3 {

	int i;

	class instance {
		private void Method1() {
			System.out.println("메소드1");

		}
	}

	static class staticClass {
		static int I = 100;

		private void Method2() {
			System.out.println("메소드2");
		}
	}

	void local() {
		class localClass {
			private void method3() {
				System.out.println("메소드3");
			}
		}
	}

	public static void main(String[] args) {
		InnerClassBasic3.instance sta = new InnerClassBasic3().new instance();
		sta.Method1();

	}

}
