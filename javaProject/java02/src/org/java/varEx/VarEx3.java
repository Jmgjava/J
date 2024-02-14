package org.java.varEx;

public class VarEx3 {
	
	// 상수 -> 보통 대문자로 작성
	// 공유 데이터에 많이 사용 -> 다른 클래스에서도 접근 가능
	// static
	final static int MAXNUMBER=10000;
	final static String PROJECTJAVA="OUTER SHOP";
	final static int MINNUMBER=2000;

	public static void main(String[] args) {
		
		System.out.println("변수명 규칙");
		
		//키워드(예약어) -> 사용하기로 약속된,,,
/*
		int int ; 사용불가 
		int char; 사용불가 등
*/
		//숫자로 시작하지 않는다.
//		int 1var;
		
		//공백을 허용허지 않음.
//		int var 1;
		
		// 특수기호 _ $ 만 허용
//		int _var=10;
//		int var$4=10;
//		int var_01=10;
		// 불가능
//		int var%1=10;
//		int @^22=10;
		
		// 대소문자 구별
		int Var1=10;
		int var1=20;
						// 변수+"문자열"+변수
		System.out.println(Var1+","+var1);
		
		// 변수는 소문자로 시작하기를 권장한다.
		int brown=10;
		
		// 의미 있는 변수명이 중복되면 첫 번째 문자는 소문자
		// 두 번째 문자열의 시작은 대문자로 설정한다.
		// 카멜 케이스 (camel case)
		int varNumber=30;
		int maxNumber=10;
		
		// 한글사용은 권장하지 않음.
		int 인트=100;
		System.out.println(인트);
		
		System.out.println("상수(final)");
		
	}
}
