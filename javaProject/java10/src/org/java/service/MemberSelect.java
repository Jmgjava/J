package org.java.service;

import org.java.controller.MemberService;

public class MemberSelect extends MemberService {

	@Override
	public void excuteQueryService() {
		System.out.println("회원 조회");
	}
}
