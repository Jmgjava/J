package org.java.var3;

public class VarEx8 {

	public static void main(String[] args) {
		System.out.println("변수와 형변환");
		
		byte b=10; // 1byte
		int i=10;  // 4byte
		
		b=(byte)i;
		b=(byte)1000;
		b=(byte)(i+10);// int아래 작은형은 자동으로 int형으로 변화
		
		
		byte b1=10;
		byte b2=20;
		byte b3=(byte)(b1+b2);
		
		float f=1.1f; //실수의 기본형 double(8)   1.1f,(float)1.1
				
		System.out.println(f+10);
		
		System.out.println((int)f+10);
		System.out.println((int)(f+10));
		
		int i2=(int)f+10;  // 실수형 > 정수형  float+int -> float+float
		
		float f2=f+10; // float+int-> float+float -> float	
		double d1=f+10;// float+int-> float+float -> double
		
		System.out.println(f2+", "+d1);
		
		double d2=10.1;
		System.out.println(d2);
		
		int i3=(int)d2;
		System.out.println(i3);
		
		
		
	}
}
