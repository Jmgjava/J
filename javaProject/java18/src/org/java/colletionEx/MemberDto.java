package org.java.colletionEx;

public class MemberDto {

	private int a;
	private String name;

	public MemberDto(int no, String id, String pw, String name, int age) {
		// TODO Auto-generated constructor stub
	}

	public MemberDto(int a, String name) {
		super();
		this.a = a;
		this.name = name;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "MemberDto [a=" + a + ", name=" + name + "]";
	}

}
