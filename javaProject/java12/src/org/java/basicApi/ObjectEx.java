package org.java.basicApi;

class A {
	int a;

	private void m1() {
		System.out.println("m1");
	}
}

public class ObjectEx {

	public static void main(String[] args) {

//		1. Object Ŭ������ ��� Ŭ������ superŬ����
//		2. ���Ŭ������ Object Ŭ������ �޼ҵ带 ��ӹ޴´�.
//		3. toString() -> ��ü�� ������ ������ �ִ�.
//		4. .equals 	  -> ��ü ��
//		5. getClass   -> ��ü�� ����Ŭ������ ������ ��ȸ

		Object ob1 = new ObjectEx();
		System.out.println(ob1.hashCode());

		A a = new A();
		A b = new A();

		System.out.println("a��ü�� hashCode(): " + a.hashCode());
		System.out.println("a��ü�� getClass(): " + a.getClass().getName());
		System.out.println("a��ü�� toString(): " + a.toString()); // Ŭ�����̸�@�ؽ��ڵ�
		System.out.println(100);
		System.out.println(Integer.toHexString(100)); // Integer.toHexString(hashCode())
		System.out.println(a.equals(b));
		System.out.println("ss".equals("ss"));

	}

}
