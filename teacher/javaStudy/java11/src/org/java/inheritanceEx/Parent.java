package org.java.inheritanceEx;

// Sub1,Sub2,Sub3Ŭ������ �θ�(����) Ŭ����
public class Parent {

	public String name;
	public String phone;
	public int age;

	// ������(polymorphism)
	// �����ε� -> ������ �����ε�
//	public Parent() {
//		System.out.println("Parent�⺻������");
//	}
	
//	public Parent(String name, String phone, int age) {
//		super();
//		this.name = name;
//		this.phone = phone;
//		this.age = age;
//	}
	
	public void memberShip() {
		System.out.println("ȸ������ �ż���");
	}

}
