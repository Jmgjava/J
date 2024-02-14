package org.java.oopExTest;

public class RegisterDto {

	private String id;
	private String passwarw;
	private int age;
	
	public RegisterDto() {
		// TODO Auto-generated constructor stub
	}

	public RegisterDto(String id, String passwarw, int age) {
		super();
		this.id = id;
		this.passwarw = passwarw;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPasswarw() {
		return passwarw;
	}

	public void setPasswarw(String passwarw) {
		this.passwarw = passwarw;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		if (id == null)
			return "등록된 정보가 없습니다.";

		return "id=" + id + ", passwarw=" + passwarw + ", age=" + age;
	}

}
