package org.java.abstractEx;

public class AbstractEx1Main {

	public static void main(String[] args) {

		// �߻�Ŭ������ ��ü�� ���� ���� ���Ѵ�.
//		new AbstractEx1();		
		AbstrractEx1Sub1 a1 = new AbstrractEx1Sub1();
		a1.num1 = 10;
		a1.num2 = 20;
		a1.num3 = 30;
		a1.num4 = 40;
		a1.abstractMethod();

		// ������ ,, �θ�Ÿ�� ��ü���� ���� -> �ڽİ�ü
		AbstractEx1 ab1 = new AbstrractEx1Sub1();
		ab1.num1 = 20;
		ab1.num2 = 30;
		ab1.abstractMethod();

		// new AbstractEx1Sub2(); //�߻�Ŭ����

		AbstractEx1Sub2Sub abs1 = new AbstractEx1Sub2Sub();
		abs1.abstractMethod();
		abs1.abstractMethod2();
		abs1.abstractMethod3();

		AbstractEx1 abs11 = new AbstractEx1Sub2Sub();
		abs11.abstractMethod();

		AbstractEx1Sub2 abs12 = new AbstractEx1Sub2Sub();
		abs12.abstractMethod();
		abs12.abstractMethod2();
		abs12.abstractMethod3();

	}
}
