package org.java.oopEx;
// ��Ű��-> ����� ����� Ŭ������ ��Ƶ� ���丮

//����������(������)  class Ŭ������
// �����
public class ClassBasic {
	// �ɹ�=�ʵ�+�ż���+������(�ڵ�,����)+�ٸ���ü(���,import)

	// �ʵ�,������Ƽ(�Ӽ�)
	// ���������� Ÿ�� �ʵ��;
	public int num1; // �ν��Ͻ� �ɹ�, new
	public int num2; // �ν��Ͻ� �ɹ�, new
	//Ŭ�����ɹ� -> new �������� �ʰ�, Ŭ����.�ɹ�
	public static int num3; // static(Ŭ����)�ɹ�-> ����

//	public ClassBasic() {
//		System.out.println("�⺻������(�ڵ����λ���)");
//	}

	// �ż��� -> ���, ���ϴ� ,����
	// ���������� ��ȯŸ�� �ż����(�Է�����){ return }	
	public void instanceMethod() { 
		System.out.println("�ν��Ͻ� �ż���"); // �ν��Ͻ� �ɹ� , new
	}

	public static void staticMethod() {
		System.out.println("static(Ŭ����) �ż���");// static(Ŭ����)�ɹ�-> ����
	}

}
