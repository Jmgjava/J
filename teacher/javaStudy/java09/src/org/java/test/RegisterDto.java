package org.java.test;

public class RegisterDto {
	
	private String id;
	private String password;
	private int age;

	public RegisterDto() {
		// TODO Auto-generated constructor stub
	}

	public RegisterDto(String id, String password, int age) {
		super();
		this.id = id;
		this.password = password;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		if(id==null) return "등록된 정보가 없습니다.";
		return "[id=" + id + ", pasword=" + password 
				+ ", age=" + age + "]";
	}
	
	
	
	
}
