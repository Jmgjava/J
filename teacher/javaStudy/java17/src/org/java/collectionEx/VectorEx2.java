package org.java.collectionEx;

import java.util.Vector;

class Member {
	
	private int age;
	private String name;

	public Member() {
	}

	public Member(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

public class VectorEx2 {

	public static void main(String[] args) {

		System.out.println("Vector");

//		Member m1 = new Member(10, "m1");
//		Member m2 = new Member(10, "m1");

		// Ŭ���� -> ����� ���� Ÿ��
		Vector<Member> member = new Vector<Member>();
		member.add(new Member(11, "m1"));
		member.add(new Member(12, "m2"));
		member.add(new Member(13, "m3"));
		member.add(new Member(14, "m4"));
		member.add(new Member(15, "m5"));

		// member�� foreach�� �̿��ؼ� ����Ҹ� �ֿܼ� ���
		// " ���̴� ~, �̸� ~ " -> 5��

		//	Member m1=	new Member(11, "m1");

		for (Member element : member) {
			// Member m=new Member(11, "m1");
			System.out.print("����: " + element.getAge());
			System.out.println(" �̸�: " + element.getName());
		}
		

	}
}
