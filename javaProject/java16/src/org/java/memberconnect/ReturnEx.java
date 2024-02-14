package org.java.memberconnect;

class Sub1 {
	void s1() {
		System.out.println("Sub1 메소드");
	}
}

class B {
	void m1() {
		return;
	}

	int m2() {
		return 1;
	}

	String m3() {
		return "문자열";
	}

	// Object 리턴
	Sub1 m4() {
		Sub1 sub1 = null; // 기본값
//		Sub1 sub1 = new Sub1();
		return sub1;
	}

}

public class ReturnEx {

	public static void main(String[] args) {
		B b1 = new B();
		b1.m1(); // return ;
		int in1 = b1.m2(); // int
		String str1 = b1.m3(); // String
		Sub1 s1 = b1.m4(); // Sub1
		s1.s1();
	}

}
