package org.project.dto;

public class MemberDTO {

	private String userId;
	private String userPw;
	private int userAge;

	// 다형성
	// 오버로딩 -> 생성자 오버로딩
	public MemberDTO() {
		// TODO Auto-generated constructor stub
	}

	public MemberDTO(String userId, String userPw, int userAge) {
		super();
		this.userId = userId;
		this.userPw = userPw;
		this.userAge = userAge;
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

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	@Override
	public String toString() {
		return "MemberDTO [userId=" + userId + ", userPw=" + userPw + ", userAge=" + userAge + "]";
	}
	

}
