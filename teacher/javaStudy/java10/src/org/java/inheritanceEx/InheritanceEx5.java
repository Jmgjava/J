package org.java.inheritanceEx;

// �׽�Ʈ��
class Parent {

	int a;

	// ������
	// �����ε�-> ������ �����ε�
	public Parent() {
		super();
	}

	public Parent(int a) {
		this.a = a;
	}

	void m1() {
		System.out.println("�θ�Ŭ���� m1()");
	}
}

class Sub1 extends Parent {
	int b;

	public Sub1() {
		// super();
		System.out.println("�⺻������ ���");
	}

	void m2() {
		System.out.println("�ڽ�Ŭ���� m2()");
	}
	//������
	@Override
	void m1() {
		super.m1();// �θ� �ż���
		System.out.println("�������̵�,  m1()");
	}
}

public class InheritanceEx5 {

	public static void main(String[] args) {
		
		Parent p1 = new Parent();
		p1.a = 10;
		p1.m1();

		Sub1 s1 = new Sub1();
		s1.a = 10;
		s1.b = 20;
		s1.m1();
		s1.m2();

		System.out.println(s1.toString());
		
		Parent p2=new Parent();
		p2.a=10;
		p2.m1();
		
		p2=new Sub1();
		p2.a=10;
		p2.m1();
		
		Parent	p21=new Sub1();
		p21.a=20;
		p21.m1();
		
		
//		Sub1 s22=new Sub1();
//		s22=(Sub1) new Parent();
		

	}

}
