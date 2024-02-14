package org.java.basicApi;

public class WrapperEx4 {

	public static void main(String[] args) {
		
		System.out.println("Wrapper");
		System.out.println("ÀÚµ¿ ¾ð¹Ú½Ì(°´Ã¼Çü-> ±âº»Çü)");

		Byte b = new Byte((byte) 10);// b-> Wrapper(°´Ã¼Çü)
		byte b2 = b;// °´Ã¼Çü-> ±âº»Çü

		Short s = new Short((short) 10);
		short s2 = s;

		Integer i = new Integer(10);
		int i2 = i;
		// Integer-> int
		int i22=new Integer(10);

		Long l = new Long(10);
		long l2 = l;

		Float f = new Float(1.1f);
		float f2 = f;

		Double d = new Double(1.1);
		double d2 = d;

		Character ch = new Character('a');
		char ch2 = ch;

		Boolean bool = new Boolean(false);
		boolean bool2 = bool;

		System.out.println(b2);
		System.out.println(i2);
		System.out.println(l2);
		System.out.println(f2);
		System.out.println(d2);
		System.out.println(ch2);
		System.out.println(bool2);
	}
}
