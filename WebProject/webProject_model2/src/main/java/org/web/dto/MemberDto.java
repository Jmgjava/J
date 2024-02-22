package org.web.dto;

public class MemberDto {

	private int no;
	private String userId;
	private String userPw;
	private String gender;
	private String hobby;
	private String memo;

	public MemberDto() {
		// TODO Auto-generated constructor stub
	}

	public MemberDto(int no, String userId, String userPw, String gender, String hobby, String memo) {
		super();
		this.no = no;
		this.userId = userId;
		this.userPw = userPw;
		this.gender = gender;
		this.hobby = hobby;
		this.memo = memo;
	}

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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	@Override
	public String toString() {
		return "MemberDto [no=" + no + ", userId=" + userId + ", userPw=" + userPw + ", gender=" + gender + ", hobby="
				+ hobby + ", memo=" + memo + "]";
	}

}
