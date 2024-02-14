package org.java.exceptionEx;

import java.io.File;
import java.io.IOException;

class C1 {
	void m1() {
		throw new IllegalArgumentException("아이디가 없습니다");
	}
}

public class ExceptionEx10 {

	public static void main(String[] args) throws IOException {

		// 1.
		int[] arrInt = new int[5];
		try {
			for (int i = 0; i < 6; i++) {
				System.out.println(arrInt[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		// 2. throw
		throw new IllegalArgumentException("아이디가 없습니다");
//		C1 c1=new C1();
//		c1.m1();

	}
}
