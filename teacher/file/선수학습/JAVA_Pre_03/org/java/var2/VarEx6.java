package org.java.var2;

public class VarEx6 {

	public static void main(String[] args) {
		System.out.println("변수");
		System.out.println("상수(final 상수)");
		// 한번만 초기화, 변하지 않는, const, final~
		
		int i=10;//선언,초기화
		i=100;i=200;
		System.out.println(i);
		
		//final 상수 -> 변하지 않는 값(프로젝트 공유데이터,config 설정값)
		final int NUM=1000;
//		num=2000;// 한번만 초기화
		System.out.println(NUM);
		
		final String PROJECTNAME="Shopping Mall";
		
		int i2=100;
		char ch='a';
		
		int i3=10;
		byte b=(byte) i3;// (변환타입)
		
		
		
	}
}
