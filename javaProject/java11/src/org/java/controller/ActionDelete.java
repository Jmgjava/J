package org.java.controller;

import org.java.service.ExcuteCommand;

public class ActionDelete extends ExcuteCommand {

	@Override
	public void excuteQueryCommand() {
		System.out.println("회원삭제");
	}

}
