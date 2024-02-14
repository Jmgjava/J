package org.java.var2;

public class VarEx5 {

	public static void main(String[] args) {
		System.out.println("변수");
		System.out.println("객체참조변수");
		
		int i=10;// 변수명은 동일하게 사용할수 없다.
		i=100;
		
		//int i=20; // 같은 공간에는 변수이름 같으면 안된다.
		
					//new 객체생성연산자-> 객체의 주소생성
		String str1=new String("문자열1");
		//   str1->객체참조변수(생성된 객체의 주소값이 저장)
		
		char ch1=str1.charAt(1);// 문자열(str1)의 인덱스가 1번지 해당하는 문자 -> 자
		int len=str1.length(); // 문자열의 길이
		
		System.out.println("문자열의 길이: "+str1.length());
		System.out.println("문자열 인덱스 1번지 문자: "+str1.charAt(1));
		
		String str2="문자열1";
		System.out.println("문자열의 길이: "+str2.length());
		System.out.println("문자열 인덱스 1번지 문자: "+str2.charAt(1));
	
		System.out.println(str1==str2);//str1주소값==str2주소값
		
		// str1.equals(str2) -> 문자열의 값만 비교 
		boolean bool=str1.equals(str2);
		System.out.println("str1.equals(str2) -> 결과값 "+bool);
		
		System.out.println("아이디1".equals("아이디1"));
		
		String userId=new String("m111");// 로그인 아이디 "m111"
		String inputId="m111";
		
		System.out.println( inputId.equals(userId));// 문자열의 값만 비교-> 로그인,,,,
		
		System.out.println(inputId==userId); // 주소값비교-> 값과 상관 없다.
		
		System.out.println("=========================");
		
		
		String java1= new String("JAVA");
		String java2= new String("JAVA");
		
		System.out.println(java1==java2);
		System.out.println(java1.equals(java2));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
		
	}
}
