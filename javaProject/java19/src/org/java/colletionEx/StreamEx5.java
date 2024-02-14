package org.java.colletionEx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.java.dto.boardDto;

public class StreamEx5 {

	public static void main(String[] args) {

		System.out.println("Stream");
		// 게시글 5개를 List에 저장
		// Map<> "boards"로 저장

		List<boardDto> list = new ArrayList<boardDto>();

		list.add(new boardDto(1l, "제목1", "내용1", "작성자1", "m1"));
		list.add(new boardDto(2l, "제목2", "내용2", "작성자2", "m2"));
		list.add(new boardDto(3l, "제목3", "내용3", "작성자3", "m3"));
		list.add(new boardDto(4l, "제목4", "내용4", "작성자4", "m4"));
		list.add(new boardDto(5l, "제목5", "내용5", "작성자5", "m5"));

		System.out.println("for-each");
		// for-each
		for (boardDto i : list) {
			System.out.println("글번호: " + i.getNo());
			System.out.println("글제목: " + i.getTitle());
			System.out.println("글내용: " + i.getContent());
			System.out.println("작성자: " + i.getWriter());
			System.out.println("닉네임: " + i.getNickName());
			System.out.println();
		}

		System.out.println("iterator");
		// iterator
		Iterator<boardDto> iter1 = list.iterator();
		while (iter1.hasNext()) {
			boardDto i = iter1.next();
			System.out.println("글번호: " + i.getNo());
			System.out.println("글제목: " + i.getTitle());
			System.out.println("글내용: " + i.getContent());
			System.out.println("작성자: " + i.getWriter());
			System.out.println("닉네임: " + i.getNickName());
			System.out.println();
		}

		System.out.println("forEach문");
		// forEach 문
		list.forEach(i -> {
			System.out.println("글번호: " + i.getNo());
			System.out.println("글제목: " + i.getTitle());
			System.out.println("글내용: " + i.getContent());
			System.out.println("작성자: " + i.getWriter());
			System.out.println("닉네임: " + i.getNickName());
			System.out.println();
		});

	}

}
