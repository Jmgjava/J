package org.java.basicApi;

public class ClassEx {

	public static void main(String[] args) {

		System.out.println("Class");
		// Ŭ���� �ִ��� Ȯ��
		// ������ Exception(����)�� �߻���Ų��.
		// ������ �������
		// �ݵ�� ����ó���� ���־���Ѵ�. -> �ڵ����� ��������

		try {
			// ���ܰ� �߻��� ���ɼ� �ִ� �ڵ�(��ɹ�)
			// ã�� Ŭ������ ������ ����(������ �� �ִ� ����)�� �߻�
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// ����(������ �� �ִ� ����)�� �߻��ϸ�
		} catch (ClassNotFoundException e) {
			// ����(���� �� �� �ִ� ���� -> ���α׷��� �ߴ� ����) ���� �ֿܼ� ���
			e.printStackTrace();
			System.out.println("����̹� No"); // �����ڰ� ���� ����
		}

//		Class.forName("oracle.jdbc.driver.OracleDriver");

		System.out.println("���α׷� ���� ����");

	}

}
