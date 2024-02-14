package org.java.exceptionEx2;

import java.io.IOException;
import java.sql.SQLException;

interface in1 {
	void indb() throws SQLException, IOException; // �߻� �޼ҵ� ( public abstract ��ŵ )
}

// �߻�ȭ -> Ŭ�������� �������� ��Ҹ� �̾Ƽ� ���� Ŭ������ ����� ��

class In1Sub1 implements in1 {

	@Override
	public void indb() throws SQLException, IOException {
		System.out.println("In1Sub1 indb() method");
	}
}

class In1Sub2 implements in1 {

	@Override
	public void indb() throws SQLException, IOException {
		System.out.println("In1Sub2 indb() method");

	}
}

class In1Sub3 implements in1 {

	@Override
	public void indb() throws SQLException, IOException {
		System.out.println("In1Sub3 indb() method");

	}
}

//class A {
//
//	void m1() {
//
//		try {
//			// IllegalArgumentException **�Է¹��� ����(�Ű�����)�� Ʋ�� ���
//			// ��й�ȣ ����, �˻��� , ȭ���̺�...
//			// ���̵� ã�� -> DB���̺� ����� ���̵� ���� -> ���� �߻�
//			// Exception ex1 = new Exception();
//			throw new IllegalArgumentException("���̵� �����ϴ�."); // ���ܸ� ���Ƿ� �߻�
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		System.out.println("���� ���� m1");
//	}
//}
//
//class B {
//
//	void m2() throws SQLException, IOException {
//		System.out.println("���ܰ� �մ� �޼ҵ�");
//	}
//}

public class ExceptionEx_Sub {

	public static void main(String[] args) throws SQLException, IOException {

		in1 i1 = new In1Sub1();
		i1.indb();

		i1 = new In1Sub2();
		i1.indb();

		i1 = new In1Sub3();
		i1.indb();

//		System.out.println("���� ó�� ���");
//
//		B b1 = new B();
//		b1.m2(); // ���ܰ� �����ϴ� �޼ҵ带 ��� �� ���� ���ܸ� ó�� �� ���
//
//		A a1 = new A();
//		a1.m1();
//
//		// 1.try-catch ��
//		try {
//			int num = 10 / 0;
//
//			System.out.println("���� ���� ���� ����");
//		} catch (ArithmeticException e) {
//			System.out.println("ArithmeticException");
//			e.printStackTrace();
//		} catch (Exception e) {
//			System.out.println("catch�� �̿��� ��� ���� ó��");
//			e.printStackTrace();
//		} finally {
//			System.out.println("���ܿ� ������� ������ ����");
//		}

	}

}
