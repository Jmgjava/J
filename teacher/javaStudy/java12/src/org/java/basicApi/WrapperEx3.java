package org.java.basicApi;

import java.util.ArrayList;
import java.util.List;

public class WrapperEx3 {

	public static void main(String[] args) {
		System.out.println("Wrapper");
		System.out.println("�ڵ� �ڽ�(�⺻�ڷ���-> ��ü��(Wrapper)��ȯ)");

		int i = 10;// i-> int
		Integer in1 = i;// int -> Integer (�ڽ�)

		// primitive type
		byte b = 10;
		short s = 10;
		int j = 10;
		long l = 10;
		float f = 1.1f;
		double d = 1.1;
		char ch = 'a';
		boolean bool = false;

		Integer i111=new Integer("111");
		System.out.println(i111.intValue());
		
		int i222=new Integer("1111");
//		int i22243="1111";
		
		// �⺻ Ÿ�� -> ��ü��(Wraper) -> �ڽ�
		Byte b2 = b;
		Short s2 = s;
		Integer i2 = j;
		Float f2 = f;
		Double d2 = d;
		Character ch2 = ch;
		Boolean bool2 = bool;

		System.out.println(b2);
		System.out.println(s2);
		System.out.println(i2);
		System.out.println(f2);
		System.out.println(d2);
		System.out.println(ch2);
		System.out.println(bool2);

		System.out.println();

		System.out.println(j == i2);

		// �÷��� �����ӿ�ũ(�÷���) -> ��ü�� �׷�ȭ
		List<Integer> list = new ArrayList<Integer>();
	}
}
