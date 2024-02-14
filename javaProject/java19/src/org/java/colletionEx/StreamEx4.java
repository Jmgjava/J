package org.java.colletionEx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.java.dto.BoardEntity;
import org.java.dto.boardDto;

class B {

	public static void toBoardEntity(String name) {
		System.out.println("boardDto -> boardEntity" + name);
	}
}

public class StreamEx4 {

	public static void main(String[] args) {

		List<String> list2 = new ArrayList<String>();
		list2.add("m1");
		list2.add("m2");
		list2.add("m3");
		list2.add("m4");
		list2.add("m5");
		System.out.println(list2);
		// List -> Stream -> Stream 모든 요소 -> (B클래스 toBoardEntity()실행)
		list2.stream().forEach(B::toBoardEntity);
//		list2.stream().forEach(el -> {
//			B.toBoardEntity(el);
//		});

		System.out.println("Stream");
		// 게시글 5개를 List에 저장
		// Map<> "boards"로 저장

		List<boardDto> boardlist = new ArrayList<boardDto>();

		boardlist.add(new boardDto(1l, "제목1", "내용1", "작성자1", "m1"));
		boardlist.add(new boardDto(2l, "제목2", "내용2", "작성자2", "m2"));
		boardlist.add(new boardDto(3l, "제목3", "내용3", "작성자3", "m3"));
		boardlist.add(new boardDto(4l, "제목4", "내용4", "작성자4", "m4"));
		boardlist.add(new boardDto(5l, "제목5", "내용5", "작성자5", "m5"));

		// {"키","값"} -> JSON -> Ajax, MongoDB
		Map<String, List<boardDto>> boardMap = new HashMap<String, List<boardDto>>();
		boardMap.put("boardList", boardlist);

		System.out.println(boardMap);

		// Map -> List
		List<boardDto> list1 = boardMap.get("boardList");

		// Stream -> 원본이 손상 되지 않고 새로운 Stream객체로 사용(한번만 사용)
		Stream<boardDto> stream1 = list1.stream();

		// boardDto -> boardEntity 변환 -> 정리

//		// void 실행 boardEntity클래스 -> toboardEntity메소드
//		stream1.forEach(BoardEntity::toBoardEntity);
//		// Stream -> List
//		stream1.collect(Collectors.toList());
//		// BoardDto -> BoardEntity 변환
//		stream1.map(BoardEntity::toBoardEntity);
//		// Stream -> List
//		List<BoardEntity> boardEntityList = 
//				stream1.map(BoardEntity::toBoardEntity)
//				.collect(Collectors.toList());

//		stream1.filter(i -> i.getNo() >= 3) // 필터링
//				.forEach(i -> {
//					System.out.print("글번호:" + i.getNo() + " ");
//					System.out.print("글제목:" + i.getTitle() + " ");
//					System.out.print("글내용:" + i.getContent() + " ");
//					System.out.print("작성자:" + i.getWriter() + " ");
//					System.out.print("닉네임:" + i.getNickName() + " ");
//					System.out.println();
//				});

//		stream1.forEach(System.out::print);

		List<boardDto> toList = stream1.filter(i -> i.getNo() >= 3) // 필터링
				.collect(Collectors.toList()); // Stream -> List

		System.out.println("for-each");
		// for-each
		for (boardDto i : boardlist) {
			System.out.print("글번호:" + i.getNo() + " ");
			System.out.print("글제목:" + i.getTitle() + " ");
			System.out.print("글내용:" + i.getContent() + " ");
			System.out.print("작성자:" + i.getWriter() + " ");
			System.out.print("닉네임:" + i.getNickName() + " ");
			System.out.println();
		}

		System.out.println("iterator");
		// iterator
		Iterator<boardDto> iter1 = boardlist.iterator();
		while (iter1.hasNext()) {
			boardDto i = iter1.next();
			System.out.print("글번호:" + i.getNo() + " ");
			System.out.print("글제목:" + i.getTitle() + " ");
			System.out.print("글내용:" + i.getContent() + " ");
			System.out.print("작성자:" + i.getWriter() + " ");
			System.out.print("닉네임:" + i.getNickName() + " ");
			System.out.println();
		}

		System.out.println("forEach문");
		// forEach 문
		boardlist.forEach(i -> {
			System.out.print("글번호:" + i.getNo());
			System.out.print("글제목:" + i.getTitle() + " ");
			System.out.print("글내용:" + i.getContent() + " ");
			System.out.print("작성자:" + i.getWriter() + " ");
			System.out.print("닉네임:" + i.getNickName() + " ");
			System.out.println();
		});

	}

}
