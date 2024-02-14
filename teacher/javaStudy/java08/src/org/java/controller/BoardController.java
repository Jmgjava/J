package org.java.controller;

import org.java.dto.BoardDto;

public class BoardController {

	public static void main(String[] args) {
		
		BoardDto board1= new BoardDto();		
		
		board1.setNo(1);
		board1.setTitle("글제목1");
		board1.setContent("글내용1");
		board1.setWriter("작성자1");
		board1.setNickName("닉네임1");
		board1.setHit(1);
		
		String info=board1.toString();
		System.out.println(info);
		
		int no=board1.getNo();
		String title=board1.getTitle();
		String content=board1.getContent();
		String writer=board1.getWriter();
		String nickName=board1.getNickName();
		int hit=board1.getHit();
		
		
	}
}
