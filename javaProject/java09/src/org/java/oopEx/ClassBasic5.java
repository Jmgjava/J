package org.java.oopEx;

public class ClassBasic5 {

	// ���

	// ���� ������
	private String userId; // �ν��Ͻ� ��� -> new ����
	private String userPw; // �ν��Ͻ� ��� -> new ����
	public int age; // �ν��Ͻ� ��� -> new ����
	public static String projectName; // Ŭ����(static)���

	// ������ -> constructor -> �޼ҵ�
	// ��ȯŸ�� void -> ����
	// ��ü ������, ��ü ������ ����
//	public ClassBasic5() {
//		System.out.println("�⺻������");
//	}

	// �޼ҵ�
	public void instanceMethod1() {
		this.userId = "m111";
		this.userPw = "1111";
		this.age = 14;
		// �ν��Ͻ� �޼ҵ忡�� Ŭ��������� ��� �� Ŭ����, ����� ��� ����
		ClassBasic5.projectName = "WE";
		System.out.println("�ν��Ͻ� �޼ҵ�"); // �ν��Ͻ� ��� -> new ����

		classMethod();
	}

	public static void classMethod() {
		// static �޼ҵ忡���� static �ʵ常 ��밡��
//		userId=100;
		ClassBasic5.projectName = "WEB";
		System.out.println("Ŭ���� �޼ҵ�"); // Ŭ����(static)���
		// static �޼ҵ忡���� static �޼ҵ常 ��밡��
//		instanceMethod();
	}

	public void m1(String[] args) {
		System.out.println("");
	}

	// setter, getter -> private �ʵ忡 �ܺ� ���� ���
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

}
