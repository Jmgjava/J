package org.web.dto;

public class MemberDto {

	private int no;
	private String userId;
	private String userPw;
	private String gender;
	private String hobby;
	private String phone;
	private String city;
	private String memo;

	public MemberDto() {
		// TODO Auto-generated constructor stub
	}

	public MemberDto(int no, String userId, String userPw, String gender, String hobby, String phone, String city,
			String memo) {
		super();
		this.no = no;
		this.userId = userId;
		this.userPw = userPw;
		this.gender = gender;
		this.hobby = hobby;
		this.phone = phone;
		this.city = city;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
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
				+ hobby + ", phone=" + phone + ", city=" + city + ", memo=" + memo + "]";
	}

}
