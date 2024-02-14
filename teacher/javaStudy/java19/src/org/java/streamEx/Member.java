package org.java.streamEx;

public class Member {
	
	private int age;
	private String name;

	public Member() {
		super();
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
	
	public static Member toMemberEntity(Member member) {
		
		Member member2=new Member();
		member2.setAge(member.getAge());
		member2.setName(member.getName());		
		
		System.out.print("변환객체-> 나이: "+member2.getAge());
		System.out.println("변환객체-> 이름: "+member2.getName());
		
		return member2;		
	}

	
	
	
	
	
	
	
	
	
	
}
