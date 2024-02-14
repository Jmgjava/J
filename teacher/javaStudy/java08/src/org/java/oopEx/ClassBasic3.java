package org.java.oopEx;

public class ClassBasic3 {
	// �ɹ�

	// 1.�ʵ�,������Ƽ(�Ӽ�), �ϳ��� ��
	// �ν��Ͻ� �ɹ� -> ��ü�� ���� �� �� ��� ���� new
	// ClassBasic3 c1= new ClassBasic3();
	// c1.num1; c1.num2; c1.name;c1.arrInt;
	public int num1;// 0
	public int num2;
	public String name;// �ּҰ�, ��ü���� �⺻�� -> null
	public int[] arrInt;
	int sum; // ���� ��Ű���������� ���� ����

	// private �ʵ�-> ���� Ŭ������������ ���� ����
	// �����ͺ��̽��� �����ϰ� ���� ������ �ʿ��� �ɹ��� private����
	// �ܺο��� ���� �� �� ���� ������ �ܺο��� ���� ������ �ż��带 ���� �Ͽ� ����Ѵ�
	// setters, getters �ż����.
	private String userId;
	private String userPw;

	// static(Ŭ����)�ɹ� -> ��ü ���� ���� ��� ����, ����,public static final
	// ��ü ���� ���� Ŭ������.static�ɹ�
	public static int num3;

//	public ClassBasic3() {
//		// �ڵ����� �⺻������
//	}

	// 2.�ż��� -> ���,�� ó��, ����

	// �ν��Ͻ� �ż��� -> �ν��Ͻ� �ɹ� -> ��ü�� ���� �� �� ��� ���� new
	// ClassBasic3 c1= new ClassBasic3();
	// c1.�ż����(); c1.instancMethod();
	// ���������� ��ȯŸ�� �ż����(){ // ������}
	// �����
	public void instancMethod() {
		// ������ -> ó��,����,����
		System.out.println("�ż���(�ν��Ͻ�)");
		// �ż���� �⺻�� return(��ȯ��) �ִ�.
//		return;
	}

	// Ŭ����(static)�ż��� -> ��ü ���� ���� ��� ����
	// Ŭ������.static�ż���();
	// ClassBasic3.staticMethod();
	// ���������� static ��ȯŸ�� �ż����(){ // ������}
	public static void staticMethod() {
		System.out.println("static(Ŭ����)�ż���");
//     	return;
	}

	// getters,setters ->
	// private String userId;
	// �ܺο��� setters -> �ʱ�ȭ
	public void setUserId(String userId) {
		this.userId = userId;
	}

	// �ܺο��� ���� getter -> ��ȸ
	public String getUserId() {
		return userId;
	}

	// private String userPw;
	// �ܺο��� setters -> �ʱ�ȭ
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	// �ܺο��� ���� getter -> ��ȸ
	public String getUserPw() {
		return userPw;
	}

}
