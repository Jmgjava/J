package org.java.abstractEx;

public abstract class MemberService {

	// 반드시 상속을 통해 구현 -> 강제
	public abstract void excuteQueryService();	
	// 선택하여 오버라이딩
	public void m1() {
		System.out.println("선택 오버라이딩 매서드");
	}
}
