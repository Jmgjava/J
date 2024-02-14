package org.java.basicApi;

public class WrapperEx5 {

	public static void main(String[] args) {
		System.out.println("Wrapper");

		// 문자열 숫자 -> "111" -> int(기본자료형) 
		// 웹상에 숫자 입력 시 -> 문자열로 인식 , 오류가 발생 할 수 있으니 주의
		String num = "12";
		System.out.println(num + 100);

		// 1 . Wrapper
		int i = new Integer(num);
		System.out.println(i + 100);

		// 2. Integer.parse~
		int i2 = Integer.parseInt(num);
		System.out.println(i2 + 100);

		System.out.println(Byte.parseByte(num));
		System.out.println(Short.parseShort(num));
		

	}
}
