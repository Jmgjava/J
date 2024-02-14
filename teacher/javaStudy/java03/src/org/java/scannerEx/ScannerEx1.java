package org.java.scannerEx;

/*// 다른 패키지에서 클래스를 생성 할 때 반드시 
// import 패키지.클래스; 설정 해야된다.
*/
import java.util.Scanner;
/*// java.lang 패키지 -> 자바의 기본패키지
// 단. java.lang 패키지는 자동으로 import된다.
// import문을 생략할수 있다.
// import java.lang.System;
*/
public class ScannerEx1 {

	public static void main(String[] args) {
		
		System.out.println("Scanner");
		//프로그래머가 직접 입력
		Scanner scn=new Scanner(System.in); // 시스템 입력(콘솔에 입력)
		
		System.out.println("주소를 입력하세요");
		String addr=scn.nextLine();// 입력 받은 값이-> enter -> String		
		System.out.println("주소: "+addr);
		
		System.out.print("이름을 입력하세요 -> ");
		String name=scn.next();
		System.out.println("이름: "+name);
		
		System.out.print("나이를 입력하세요 : ");
		int age=scn.nextInt();// int형으로 입력
		System.out.println("나이: "+age);
		
		System.out.print("키를 입력하세요: ");
		double hei=scn.nextDouble();
		System.out.println("키: "+hei);
		
		
	}
}
