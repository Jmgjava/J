package org.java.oopEx;

public class ConstructEx3 {

	private int no;
	private int age;

	public ConstructEx3() {
		this(13, 33);
		System.out.println("기본 생성자");
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
		return "no=" + no + ", age=" + age;
	}

}
