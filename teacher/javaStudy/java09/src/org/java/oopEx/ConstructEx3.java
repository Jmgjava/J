package org.java.oopEx;

public class ConstructEx3 extends Object {

	private int no;
	private int age;

	// Contsruct(������)
	// 1. �ż���,
	public ConstructEx3() {
//		this(10, 33);
		System.out.println("�⺻������");
	}

	public ConstructEx3(int no, int age) {
		super();
		this.no = no;
		this.age = age;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "ConstructEx3 [no=" + no + ", age=" + age + "]";
	}

}
