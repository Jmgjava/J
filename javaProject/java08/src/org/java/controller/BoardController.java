package org.java.controller;

import org.java.dto.BoardDto;

public class BoardController {

	public static void main(String[] args) {

		BoardDto board1 = new BoardDto();
		
		board1.setNo(1);
		board1.setTitle("������1");
		board1.setContent("�۳���1");
		board1.setWritter("�ۼ���1");
		board1.setNickname("�г���1");
		board1.setHit(1);

		String info = board1.toString();
		System.out.println(info);
		
		int no=board1.getNo();
		String title=board1.getTitle();
		String content=board1.getContent();
		String writter=board1.getWritter();
		String nickname=board1.getNickname();
		String hit=board1.getHit();
		
	}

}
