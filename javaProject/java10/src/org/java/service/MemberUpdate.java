package org.java.service;

import org.java.controller.MemberService;

public class MemberUpdate extends MemberService {
	
	@Override
	public void excuteQueryService() {
		System.out.println("회원 수정");
	}

}
