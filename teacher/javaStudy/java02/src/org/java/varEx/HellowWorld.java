//package 패키지경로; 
//반드시 명령어 마지막에서 ;를 붙여주어야한다
package org.java.varEx;
//->한줄주석(컴파일x)

/*
  ->여러줄주석
  //여러줄주석 안에 주석 가능, 단 여러줄주석 안에 여러줄주석 안됌
  */

//org.java.varEx패키지 아래에 있는 HellowWorld클래스
public class HellowWorld {
	
	//자바 프로젝트는 보통 하나의 main매서드를 가지고있다.
	//main매서드 안에 있는 명령문을 우선적으로 실행한다.
	public static void main(String[] args) {
		//명령문
		
		//JRE(자바개발환경):라이브러리(<-패키지들을 압축.jar <-class압축)
		//System.out ->콘솔에 출력하시오
		System.out.println("Hellow World^^");
		
		
		
	}
	

}
