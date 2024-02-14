package org.java.oopEx;

import java.time.LocalDateTime;

public class BoardDtoMain {

	public static void main(String[] args) {

		BoardDto b1 = new BoardDto(1, "제목1", "내용1", "작성자1", "닉네임1", 0, LocalDateTime.now(), LocalDateTime.now());
		System.out.println(b1.getNo());
		System.out.println(b1.getTitle());
		System.out.println(b1.getContent());
		System.out.println(b1.getWriter());
		System.out.println(b1.getNickName());
		System.out.println(b1.getHit());
		System.out.println(b1.getCreatTime());
		System.out.println(b1.getUpdateTime());
	}

}
