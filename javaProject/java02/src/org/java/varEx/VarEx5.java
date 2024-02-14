package org.java.varEx;

public class VarEx5 {

	public static void main(String[] args) {
		System.out.println("변수와 형변환");
		
		// bit -> 정보(data)의 기본단위 0 1
		// byte -> 메모리(컴퓨터 기억공간)의 기본단위 1byte==8bit
		
		byte b=10;
		int i=10;
//		강제 형변환 큰 자료형 -> 작은 자료형
		b=(byte)i; // 큰 자료형에서 작은 자료형으로 형변환 시키면 오류발생, 자료가 손실됨
//		자동형변환 작은 자료형 -> 큰 자료형
		i=b+10; //byte+int -> int+int
	}
}
