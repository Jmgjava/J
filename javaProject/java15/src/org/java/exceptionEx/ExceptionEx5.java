package org.java.exceptionEx;

public class ExceptionEx5 {

	public static void main(String[] args) {

		System.out.println("Exception");

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹��� ���������� �ε�Ǿ����ϴ�.");

		} catch (ClassNotFoundException e1) {
			System.out.println("����̹��� �������� �ʽ��ϴ�.");
			e1.printStackTrace();

		} catch (Exception e) {
			System.out.println("��� ���� ó��");

		}
		System.out.println("���α׷� ��������");

	}

}
