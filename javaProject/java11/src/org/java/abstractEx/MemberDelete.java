package org.java.abstractEx;

public class MemberDelete extends MemberService {

	// 반드시 오버라이딩 해야된다.
	@Override
	public void excutequeryService() {
		System.out.println("회원삭제");
	}

}
