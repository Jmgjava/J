package org.java.oopEx;

public class ConstructExMain {

	public static void main(String[] args) {
		//인스턴스화 c1
		//new -> 객체 생성	
		// 기본생성자
		ConstructEx c1= new ConstructEx();
		c1.setUserId("m2");
		c1.setUserPw("333");
		System.out.println(c1.getUserId());
		System.out.println(c1.getUserPw());
		
		// 매개인자 1
		ConstructEx c2= new ConstructEx("m111");
		// 객체 생성시 값을 설정
//		c2.setUserId("m4");// 이미 설정값을 수정
		System.out.println(c2.getUserId());
		
		//매개인자 2
		ConstructEx c3 =new ConstructEx("m2", "22");
		
		System.out.println(c3.getUserId());
		System.out.println(c3.getUserPw());
		
		//매개인자 3
		ConstructEx c4= new ConstructEx("m4", "44", 30);
		
		System.out.println(c4.getUserId());
		System.out.println(c4.getUserPw());
		System.out.println(c4.getAge());
		
	}
}
