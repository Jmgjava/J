package org.java.oopEx;

public class ClassBasic5 {

	//맴버	
	//필드
	private String userId; //인스턴스 맴버 -> new 생성
	private String userPw; //인스턴스 맴버 -> new 생성
	public int age; 		//인스턴스 맴버 -> new 생성
	public static String projectName; // 클래스(static)맴버
	
	
	// 생성자->Contstruct-> 매서드
	// 반환타입 void -> 생략
	// 객체 생성시 , 객체 유형을 선택
//	public ClassBasic5() {
//		//자동으로 생성 
//		System.out.println("기본생성자");
//	}
	
	//매서드 
	public void instanceMathod1() {
		this.userId="m11";
		this.userPw="1111";
		this.age=11;
		 // 인스턴스 매서드에서 클래스맴버를 사용시 클래스.맴버로 사용 권장
		ClassBasic5.projectName="WEB12";
		System.out.println("인스턴스매서드");//인스턴스 맴버 -> new 생성
		
		classMethode();
	}
	public static void classMethode() {
		//static매서드에서는 static필드만 사용가능
//		userId=100;
		ClassBasic5.projectName="WEB13";
		System.out.println("클래스 매서드");// 클래스(static)맴버
		//static매서드에서는 static매서드만 사용가능
//		instanceMathod1();
	}
	
	public void m1(String[] str) {
		System.out.println("");
	}
	
	// getters,setters -> private 필드에 외부 접근 허용
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	
	
	
}
