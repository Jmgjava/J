package org.java.oopEx;

public class ConstructEx2 {

	private String userId;
	private String userPw;

	// �⺻����
	public ConstructEx2() {
		this("m111", "1111"); // �ٸ� ������ ȣ��
		System.out.println("�⺻ ������");
	}

	public ConstructEx2(String userId) {
		// this.���(�ʵ�, �޼ҵ�)
		this.userId = userId;
	}

	public ConstructEx2(String userId, String userPw) {
		super();
		this.userId = userId;
		this.userPw = userPw;
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

	@Override
	public String toString() {
		return "ConstructEx2 [userId=" + userId + ", userPw=" + userPw + "]";
	}

}
