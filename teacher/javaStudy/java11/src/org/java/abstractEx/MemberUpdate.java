package org.java.abstractEx;

public class MemberUpdate extends MemberService{

	// 반드시 오버라이딩 해야된다.
	@Override
	public void excuteQueryService() {
		System.out.println("회원수정");
	}
}
