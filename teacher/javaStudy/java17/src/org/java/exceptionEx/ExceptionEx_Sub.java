package org.java.exceptionEx;

import java.io.IOException;
import java.sql.SQLException;

interface In1 {
	abstract void indb() throws SQLException,IOException;	
}
//�߻�ȭ -> ���� ,����
class In1Sub1 implements In1{
	@Override
	public void indb() throws SQLException, IOException {		}
	}
class In1Sub2 implements In1{
	@Override
	public void indb() throws SQLException, IOException {
		// TODO Auto-generated method stub
		
	}
	
}
class In1Sub3 implements In1{
	@Override
	public void indb() throws SQLException, IOException {
		// TODO Auto-generated method stub
		
	}
}

class In1Sub4 implements In1{
	@Override
	public void indb() throws SQLException, IOException {
		// TODO Auto-generated method stub
		
	}
}

public class ExceptionEx_Sub {
	public static void main(String[] args) throws SQLException, IOException{		
		In1 i1=new In1Sub1(); 
		i1.indb();		
		i1=new In1Sub2();
		i1.indb();
		i1=new In1Sub3();
		i1.indb();		
		i1=new In1Sub4();
		i1.indb();
		
		
		
		
		
//		B b = new B();
//		b.m2();// ���ܰ� ���� �ϴ� �ż��带 ��� �Ҷ��� ���ܸ� ó�� �� ���
//
//		A a1 = new A();
//		a1.m1();
//
//		System.out.println("���� ó�� ���");
//		// 1. try~catch
//		try {
//			int num = 10 / 0;
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

		System.out.println("���� ����");
	}
}




//class A {
//
//	void m1() {
//
////		Exception ex1=new Exception();
//
//		try {
//			// ���̵� ã�� -> DB���̺� ����� ���̵� ������
//			throw new IllegalArgumentException("���̵� �����ϴ�."); // ���ܸ� ���Ƿ� �߻�
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		System.out.println("���� ����  m1");
//
//	}
//}
//
//class B {
//
//	void m2() throws SQLException, IOException {
//		System.out.println("���ܰ� �ִ� �ż���");
//	}
//}
