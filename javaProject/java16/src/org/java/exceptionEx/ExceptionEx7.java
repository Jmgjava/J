package org.java.exceptionEx;

public class ExceptionEx7 {

	public static void main(String[] args) {
		System.out.println("Exception throw");

		try {
			System.out.println("���ܸ� ������.");

			String userId = null;

//			Exception e1= new Exception("���ܹ߻�");
//			throw e;
//			throw new Exception("���� �޼���");

			// 1.ȸ������ 2.�α��� 3.���̵�üũ 4.�˻�
			if (userId == null) // ��ġ���� ������, null
				throw new IllegalArgumentException("���̵� �����ϴ�");
//			System.out.println("���� ����");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("finally");
		}

		System.out.println("���� ����");
	}

}
