package org.java.exceptionEx;

public class ExceptionEx8 {

	static void m1() throws Exception {
		System.out.println("���� �߻� �޼ҵ�");
	}

//	public static void main(String[] args) throws Exception { // 2.-----
	public static void main(String[] args) {

		System.out.println("Exception method");

		// ���� �޼ҵ带 ����

		// 1.try-catch ��
		try {
			m1();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("finally");
		}

		// 2. main �ι��� throws �߰�
//		m1();

	}

}
