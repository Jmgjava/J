package org.java.exceptionEx;

public class ExceptionEx2 {

	public static void main(String[] args) {
		System.out.println("Exception");
		
		int[] arrInt=new int[5];
		int arrIntLen=arrInt.length;
		
		try {
			for(int i=0;i<6;i++) {			
				System.out.println(arrInt[i]);
			}
			System.out.println("예외가 발생 X");
		}catch(ArrayIndexOutOfBoundsException e) {
			// 예외 발생시 처리 
			e.printStackTrace();
		}finally {
			System.out.println("예외 발생 유무와 상관없이 실행");
		}
		
		System.out.println("프로그램 정상 종료");
		
	}
}
