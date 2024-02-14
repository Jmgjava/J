package org.project.dto;

public class MemberDto {

	private String Id;
	private String Pw;
	private int age;
	
	public MemberDto() {
		System.out.println("±âº»");
	}

	public MemberDto(String id, String pw, int age) {
		super();
		Id = id;
		Pw = pw;
		this.age = age;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getPw() {
		return Pw;
	}

	public void setPw(String pw) {
		Pw = pw;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "MemberDto [Id=" + Id + ", Pw=" + Pw + ", age=" + age + "]";
	}

}
