package org.java.basicApi;

import java.awt.Window.Type;
import java.util.ArrayList;
import java.util.List;

//java.lang -> �ڵ����� import��
//import java.lang.*;

public class WrapperEx1 {

	public static void main(String[] args) {

		System.out.println("Wrapper");
		System.out.println("�ڽ�(boxing)(�⺻�� -> ��ü��(Wrapper)��ȯ)");

		int i = 10; // i -> int
		Integer i1 = new Integer(i); // int -> Integer (boxing)

		// Primitive Type �⺻�ڷ���
		byte b = 10;
		short s = 10;
		int j = 10;
		long l = 10;
		float f = 1.1f;
		double d = 1.1;
		char ch = 'c';
		boolean bool = true;

		// �⺻ �ڷ��� -> ��ü��(Wrapper) -> boxing
		Byte by1 = new Byte(b);
		Short sh1 = new Short(s);
		Integer jn1 = new Integer(j);
		Long lo1 = new Long(l);
		Float fl1 = new Float(f);
		Double do1 = new Double(d);
		Character ch1 = new Character(ch);
		Boolean bl1 = new Boolean(bool);

		System.out.println(by1);
		System.out.println(sh1);
		System.out.println(jn1);
		System.out.println(lo1);
		System.out.println(fl1);
		System.out.println(do1);
		System.out.println(ch1);
		System.out.println(bl1);

		System.out.println();

		System.out.println(i1 == j);

		// �÷��� �����ӿ�ũ(�÷���) -> ��ü�� �׷�ȭ

		List<Integer> list = new ArrayList<Integer>();
	}

}
