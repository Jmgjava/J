package org.java.collectionEx;

public class MemberDto {

	private int age;
	private String name;

	public MemberDto() {
		// TODO Auto-generated constructor stub
	}

	public MemberDto(int age, String name) {
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

	@Override
	public String toString() {
		return "MemberDto [age=" + age + ", name=" + name + "]";
	}

}
