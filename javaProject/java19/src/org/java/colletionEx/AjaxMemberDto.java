package org.java.colletionEx;

public class AjaxMemberDto {

	private Long id; // 회원 고유번호 -> 1L, 2L, 3L
	private String userName;
	private String userPw;

	public AjaxMemberDto() {
		// TODO Auto-generated constructor stub
	}

	public AjaxMemberDto(Long id, String userName, String userPw) {
		super();
		this.id = id;
		this.userName = userName;
		this.userPw = userPw;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	@Override
	public String toString() {
		return "AjaxMemberDto [id=" + id + ", userName=" + userName + ", userPw=" + userPw + "]";
	}

}
