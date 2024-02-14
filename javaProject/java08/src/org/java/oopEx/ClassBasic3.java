package org.java.oopEx;

public class ClassBasic3 {
	// ���

	// 1.�ʵ�, ������Ƽ(�Ӽ�), �ϳ��� ��

	// �ν��Ͻ� ��� -> ��ü�� ������ �� ��� ���� new
	// CalssBasic3 c1 = new ClassBasic3();
	// c1.num1;, c1.num2;, c1.name;, c1.num3;
	public int num1;
	public int num2;
	public String name;// �ּҰ�, ��ü���� �⺻�� -> null
	public int[] arrInt;

	int sum; // ���� ��Ű�� �������� ���� ����

	// private �ʵ� -> ���� Ŭ���� �������� ���� ����
	// �����ͺ��̽��� �����ϰ� ���� ������ �ʿ��� ����� private����
	// �ܺο��� ������ �� ���� ������ �ܺο��� ���� ������ �޼ҵ带 �����Ͽ� �����Ѵ�
	// setters, getters �޼ҵ��.
	private String userId;
	private String userPw;

	// static(Ŭ����) ��� -> ��ü ���� ���� ��� ����, ����, public static final
	// ��ü ���� ���� Ŭ������.static���
	public static int num3;

	// 2. �޼ҵ� -> ���, �� ó��, ����
	// �ν��Ͻ� �޼ҵ� -> �ν��Ͻ� ��� -> ��ü�� ������ �� ��� ���� new
	// CalssBasic3 c1 = new ClassBasic3();
	// c1.�޼ҵ��();
	// ���� ������ ��ȯ Ÿ�� �޼ҵ��() { //������ }

	// �����
	public void instanceMethod() {
		// ������ -> ó��,����,����
		System.out.println("�޼ҵ�(�ν��Ͻ�)");
		// �޼ҵ�� �⺻�� return(��ȯ��) �� �ִ�.
//		return;
	}

	// Ŭ����(static)�޼ҵ� -> ��ü ���� ���� ��� ����
	// Ŭ������.static�޼ҵ�();
	// ClassBasic3.staticMethod();
	// ���� ������ static ��ȣ��Ÿ�� �޼ҵ��(){ //������ }
	public static void staticMethod() {
		System.out.println("static(Ŭ����)�޼ҵ�");
//		return;
	}

	// getters, setters
	// private String userId;
	public void setUserId(String userId) {
		this.userId = userId;
	}

	// �ܺο��� �������� getters -> ��ȸ
	public String getUserId() {
		return userId;
	}

	// private String userPw;
	// �ܺο��� setters -> �ʱ�ȭ
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	// �ܺο��� �������� getters -> ��ȸ
	public String getUserPw() {
		return userPw;
	}

}
