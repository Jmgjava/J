package org.java.oopEx;

public class MemberDto {
	// DB에 회원의 정보를 저장하기 위해
	// java의 필드 하고 DB에 테이블 칼럼과 연동
	// DB -> <- java 연동 하기 위한 클래스
	private int no;// 회원번호
	private String userId;
	private String userPw;
	private String name;
	private String addr;
	private int age;
	private String phone;
	private String email;

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

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		// 매서드에서 return문을 만나면 매서드가 종료
		if (userId == null) {
			return "입력 정보가 없습니다...";
		}
		return "MemberDto [no=" + no + ", userId=" + userId + ", userPw=" + userPw + ", name=" + name + ", addr=" + addr
				+ ", age=" + age + ", phone=" + phone + ", email=" + email + "]";
	}

}
