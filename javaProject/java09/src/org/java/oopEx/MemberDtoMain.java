package org.java.oopEx;

public class MemberDtoMain {

	public static void main(String[] args) {

		MemberDto member1 = new MemberDto();

		member1.setNo(1);
		member1.setUserId("m111");
		member1.setUserPw("1111");
		member1.setName("조민근");
		member1.setAddr("노원구");
		member1.setAge(24);
		member1.setPhone("010-0000-0000");
		member1.setEmail("dddd@naver.com");

		System.out.println(member1.toString());
	}

}
