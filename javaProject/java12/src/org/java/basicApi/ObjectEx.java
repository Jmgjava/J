package org.java.basicApi;

class A {
	int a;

	private void m1() {
		System.out.println("m1");
	}
}

public class ObjectEx {

	public static void main(String[] args) {

//		1. Object 클래스는 모든 클래스의 super클래스
//		2. 모든클래스는 Object 클래스의 메소드를 상속받는다.
//		3. toString() -> 객체의 정보를 가지고 있다.
//		4. .equals 	  -> 객체 비교
//		5. getClass   -> 객체의 원본클래스의 정보를 조회

		Object ob1 = new ObjectEx();
		System.out.println(ob1.hashCode());

		A a = new A();
		A b = new A();

		System.out.println("a객체의 hashCode(): " + a.hashCode());
		System.out.println("a객체의 getClass(): " + a.getClass().getName());
		System.out.println("a객체의 toString(): " + a.toString()); // 클래스이름@해쉬코드
		System.out.println(100);
		System.out.println(Integer.toHexString(100)); // Integer.toHexString(hashCode())
		System.out.println(a.equals(b));
		System.out.println("ss".equals("ss"));

	}

}
