package org.java.oopEx;

public class ClassBasic4 {

	// �ν��Ͻ� ���
	public int num1;
	public int num2;
	private String userId; // setters, getters
	private String userPw; // setters, getters

	// �޼ҵ� -> return�� -><- ��ȯŸ�� Ÿ�� ��ġ �ؾߵȴ�.
	// �޼ҵ� ����1
	// void return���� ����.���� ����
	public void method1() {
		// ��������(local) -> �޼ҵ尡 ����Ǹ� �޸𸮿��� ���ŵ�
		int m1 = 10;
		int m2 = 20;
		int s1 = m1 + m2;
		System.out.println("�޼ҵ�(�ν��Ͻ�)" + s1);
//		return;
	}

	// �޼ҵ� ����2
	// void return���� ����. �Է°��� �ִ�.
	public void method2(int num1, int num2) {
		// ��������(local) -> �޼ҵ尡 ����Ǹ� �޸𸮿��� ���ŵ�
		System.out.println(num1 + num2);
//		return
	}

	// �޼ҵ� ����3
	// ��ȯŸ�� �� �ݵ�� return���� �־�ߵȴ�.
	// �Է°��� ����.
	public int method3() {
		return 100;
	}

	public String method31() {
		return "��ȯ���ڿ�";
	}

	// �޼ҵ� ����4
	// ��ȯŸ�� �� �ݵ�� return���� �־�ߵȴ�.
	// �Է°��� �ִ�.
	public int method4(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}

}
