package org.java.controller;

import org.java.service.ExcuteCommand;

public class ActionSelect extends ExcuteCommand {

	@Override
	public void excuteQueryCommand() {
		System.out.println("회원조회");
	}

}
