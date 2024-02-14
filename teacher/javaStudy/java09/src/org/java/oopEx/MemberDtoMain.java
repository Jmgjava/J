package org.java.oopEx;

public class MemberDtoMain {

	public static void main(String[] args) {
		
		MemberDto member1= new MemberDto();
		
		member1.setNo(1);
		member1.setUserId("m111");
		member1.setUserPw("1111");
		member1.setAge(20);
		member1.setAddr("서울시 노원구");
		member1.setEmail("e@gm.com");
		member1.setName("m1");
		member1.setPhone("010-0000-0000");
		
		System.out.println(member1.toString());
	}
}
