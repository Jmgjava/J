package org.java.abstractEx;

public class MemberInsert extends MemberService {

	// 반드시 오버라이딩 해야된다.
	@Override
	public void excutequeryService() {
		System.out.println("회원가입");
	}

}
