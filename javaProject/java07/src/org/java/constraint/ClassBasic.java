package org.java.constraint;
// ��Ű�� -> ����� ����� Ŭ������ ��Ƴ��� ���丮

// ����������(������) class Ŭ������
// �����
public class ClassBasic {
	// ������
	// ���

	// �ʵ�+�޼ҵ�+������(�ڵ�, ����)+�ٸ���ü(���, import)

	// �ʵ�,������Ƽ(�Ӽ�)
	public int num1; // �ν��Ͻ� ���, new
	public int num2; // �ν��Ͻ� ���, new
	// Ŭ������� -> new �������� �ʰ�, Ŭ����.���
	public static int num3; // static(Ŭ����)��� -> ����

//	public ClassBasic() {
//		System.out.println("�⺻������(�ڵ����� ����)");
//	}

	// �޼ҵ� �� ���, ���ϴ�, ����
	// ���������� ��ȯŸ�� �޼ҵ��(�Է�����){ return }
	public void instanceMethod() {
		System.out.println("�ν��Ͻ� �޼ҵ�"); // �ν��Ͻ� ���
	}

	public static void staticMethod() {
		System.out.println("static(Ŭ����) �޼ҵ�"); // Ŭ���� ���
	}
}
