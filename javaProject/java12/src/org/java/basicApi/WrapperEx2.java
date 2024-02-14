package org.java.basicApi;

public class WrapperEx2 {

	public static void main(String[] args) {
		System.out.println("Wrapper");
		System.out.println("¾ð¹Ú½Ì(unboxing)(°´Ã¼Çü -> ±âº»Çü");

		Byte b = new Byte((byte) 10); // b -> Wrapper ( °´Ã¼Çü)
		byte b1 = b.byteValue(); // °´Ã¼Çü -> ±âº»Çü

		Short s = new Short((short) 10);
		short s1 = s.shortValue();

		Integer i = new Integer((int) 10);
		int i1 = i.intValue();

		Long l = new Long((long) 10);
		long l1 = l.longValue();

		Float f = new Float((float) 1.1f);
		float f1 = f.floatValue();

		Double d = new Double((double) 1.1);
		double d1 = d.doubleValue();

		Character ch = new Character('c');
		char ch1 = ch.charValue();

		Boolean bool = new Boolean(false);
		boolean bool1 = bool.booleanValue();

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
