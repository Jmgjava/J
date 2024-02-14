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

		// 클래스 -> 사용자 정의 타입
		Vector<Member> member = new Vector<Member>();
		member.add(new Member(11, "m1"));
		member.add(new Member(12, "m2"));
		member.add(new Member(13, "m3"));
		member.add(new Member(14, "m4"));
		member.add(new Member(15, "m5"));

		// member를 foreach를 이용해서 각요소를 콘솔에 출력
		// " 나이는 ~, 이름 ~ " -> 5명

		//	Member m1=	new Member(11, "m1");

		for (Member element : member) {
			// Member m=new Member(11, "m1");
			System.out.print("나이: " + element.getAge());
			System.out.println(" 이름: " + element.getName());
		}
		

	}
}
