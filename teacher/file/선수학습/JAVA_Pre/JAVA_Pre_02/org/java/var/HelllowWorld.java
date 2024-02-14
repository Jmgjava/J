package org.java.var;

import java.util.Date;

// 패키지-> 비슷한 기능의 클라스를 모아둔 디렉토리(폴더)

// java.lang -> 자바의 기본패키지
// java.lang 하위 클래스는 import를 생략 할수 있다.
// import java.lang.System;

// java.lang 이외의 클래스는 import명령어 사용
//import java.util.Date;

//접근지정자(접근제한자)-> Modify
/*
	접근지정자 class 클래스명 {
		맴버
	}
*/
public class HelllowWorld {

	// main메서드 자바APP의 필수 요소
	public static void main(String[] args) {		
		// 구현부,실행부,명령부
		System.out.println("Hellow World!!");
		
		new Date();
		
	}

}
