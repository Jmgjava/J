package org.java.basicApi;

public class WrapperEx4 {

	public static void main(String[] args) {
		System.out.println("Wrapper");
		System.out.println("�ڵ� ��ڽ�(unboxing)(��ü�� -> �⺻��");

		Byte b = new Byte((byte) 10); // b -> Wrapper ( ��ü��)
		byte b1 = b; // ��ü�� -> �⺻��

		Short s = new Short((short) 10);
		short s1 = s;

		Integer i = new Integer((int) 10);
		int i1 = i;
		// Integet -> int
		int i11 = new Integer(10);

		Long l = new Long((long) 10);
		long l1 = l;

		Float f = new Float((float) 1.1f);
		float f1 = f;

		Double d = new Double((double) 1.1);
		double d1 = d;

		Character ch = new Character('c');
		char ch1 = ch;

		Boolean bool = new Boolean(false);
		boolean bool1 = bool;

		System.out.println(b1);
		System.out.println(s1);
		System.out.println(i1);
		System.out.println(l1);
		System.out.println(f1);
		System.out.println(d1);
		System.out.println(ch1);
		System.out.println(bool1);

	}

}
