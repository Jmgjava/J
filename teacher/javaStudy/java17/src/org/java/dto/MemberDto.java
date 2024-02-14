package org.java.dto;

// DB의 데이터(테이블)과  연관(매팽)있는 자바 클래스
public class MemberDto {

	private int no; // Long ->객체형 등록번호(JPA)
	private String userId;
	private String userPw;
	private String name;
	private int age;
	// -> Spring boot Project
	// NoArgsContstruct
	public MemberDto() {
		// TODO Auto-generated constructor stub
	}

	// AllArgsContstruct
	public MemberDto(int no, String userId, String userPw, String name, int age) {
		super();
		this.no = no;
		this.userId = userId;
		this.userPw = userPw;
		this.name = name;
		this.age = age;
	}
	
	//setters, getters
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// toString()
	@Override
	public String toString() {
		return "MemberDto [no=" + no + ", userId=" + userId + ", userPw=" + userPw + ", name=" + name + ", age=" + age
				+ "]";
	}

}
