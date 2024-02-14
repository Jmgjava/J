package org.java.var;

public class VarEx1 {

	public static void main(String[] args) {
		
		//syso
		System.out.println("변수");
		System.out.println("기본자료형(Primititve Type");
		
		// 정수형
		byte b; //byte형 변수 b를 선언했다. 1byte
		b=10;   //byte형 데이터 10를 변수 b에 초기화 했다.
		System.out.println("byte b="+b); // 문자열""+ 변수
		
		short s; //short형 변수 s를 선언, 2byte
		s=10;    //short형 데이터 10을 변수s에 초기화했다.
		System.out.println("short s="+s);
		
		int i;//int형 변수 i를 선언, 4byte
		i=10; //int형 데이터 10을 변수i에 초기화했다.
		System.out.println("int i="+i);

		long l;// long형 변수 l를 선언, 8byte
		l=10; //long형 데이터 10을 변수l에 초기화했다.
		System.out.println("long l="+l);
		
		//실수형
		float f; // float형 변수 f 선언, 4byte
		f=(float)1.1;  //실수형 기본형 double(8byte) ->1.1f, (float)1.1
		System.out.println("float f="+f);
		
		double d;// double형 변수 d 선언, 8byte
		d=1.1;   // double형 데이터1.1를 변수 d에 초기화
		System.out.println("double d="+d);
		
		//문자형
		char ch;// char형 변수 ch를 선언, 2byte
		ch='a';// char형 데이터 'a'를 변수 ch에 초기화
		System.out.println("char ch="+ch);
		
		//논리형(true,false)
		boolean bool; // boolean형 변수 bool를 선언, 1byte
		bool=true;    // boolean형 true,false
		System.out.println("boolean bool="+bool);
		
	}
}
