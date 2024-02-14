package org.java.oopEx;

import java.time.LocalDateTime;

public class BoardDtoMain {

	public static void main(String[] args) {

		BoardDto board1 = new BoardDto();

		BoardDto board2 = new BoardDto(1, "제목1", "내용1", "작성자1", "닉네임1", 0, LocalDateTime.now(), LocalDateTime.now());

		System.out.println(board2.getTitle());
		System.out.println(board2.getContent());
		System.out.println(board2.getWriter());
		System.out.println(board2.getNickName());
		System.out.println(board2.getHit());
		System.out.println(board2.getCreatTime());
		System.out.println(board2.getUpdateTime());

		// 컬렉션

	}
}
