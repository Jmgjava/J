package org.java.collectionEx;

import java.util.Vector;

class Member {
	private int age;
	private String name;

	public Member() {
		System.out.println();
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

		// Ŭ���� -> ����� ���� Ÿ��
		Vector<Member> member = new Vector<Member>();

		member.add(new Member(11, "m1"));
		member.add(new Member(12, "m2"));
		member.add(new Member(13, "m3"));
		member.add(new Member(14, "m4"));
		member.add(new Member(15, "m5"));

		// member�� for-each�� �̿��ؼ� �� ��ҷ� �ֿܼ� ���
		// ���̴� ~, �̸�~

		for (Member i : member) {

			System.out.println("���̴�" + i.getAge() + "�̸���" + i.getName());
		}

	}
}
