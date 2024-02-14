package org.java.collectionEx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.java.dto.BoardDto;
import org.java.dto.BoardEntity;

class B {

	public static void toBoardEntity(String name) {
		System.out.println("BoardDto -> BoardEntity " + name);
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
		// List -> Stream -> Stream의 모든 요소 ->(B클래스 toBoardEntity()실행)
		list2.stream().forEach(B::toBoardEntity);

//		list2.stream().forEach(el->{
//			B.toBoardEntity(el);
//		});;
//		

		//

		System.out.println("Stream");
		// 게시글 5개 -> List저장
		// Map<> "boards"로 저장

		List<BoardDto> boardList = new ArrayList<BoardDto>();
		// int -> Integer, int ->Long , long ->Long
		boardList.add(new BoardDto(1l, "제목1", "내용1", "작성자1", "m1"));
		boardList.add(new BoardDto(2l, "제목2", "내용2", "작성자2", "m2"));
		boardList.add(new BoardDto(3l, "제목3", "내용3", "작성자3", "m3"));
		boardList.add(new BoardDto(4l, "제목4", "내용4", "작성자4", "m4"));
		boardList.add(new BoardDto(5l, "제목5", "내용5", "작성자5", "m5"));

		// {"키":"값"} -> JSON -> Ajax , MongoDB
		Map<String, List<BoardDto>> boardMap = new HashMap<String, List<BoardDto>>();
		boardMap.put("boardList", boardList);
		System.out.println(boardMap);

		// Map -> List
		List<BoardDto> lists = boardMap.get("boardList");

		// Stream -> 원본이 손상 입지 않고 새로운 Stream객체로 사용(한번만 사용)
		Stream<BoardDto> stream1 = lists.stream();
		
		////////////////////////////////////////////////////////
		// BoardDto -> BoardEntity 변환 -> 정리 
		
		// void 실행 BoardEntity클래스 -> toBoardEntity매서드
		stream1.forEach(BoardEntity::toBoardEntity);
		// Stream -> List
		stream1.collect(Collectors.toList());
		// BoardDto -> BoardEntity 변환
		stream1.map(BoardEntity::toBoardEntity);
		// Stream -> List
		List<BoardEntity> boardEntityList = 
				stream1.map(BoardEntity::toBoardEntity)
				.collect(Collectors.toList());
		
		////////////////////////////////////////////////////////	
		

//		stream1.forEach(System.out::println);

//		stream1.filter(el -> el.getNo() >= 2) // 필터링
//				.collect(Collectors.toList()) // Stream -> List
//				.forEach(el -> {
//					System.out.print("번호:" + el.getNo() + " ");
//					System.out.print("제목:" + el.getTitle() + " ");
//					System.out.print("내용:" + el.getCotent() + " ");
//					System.out.print("작성자:" + el.getWriter() + " ");
//					System.out.println("닉네임:" + el.getNickName() + " ");
//				});
//		List<BoardDto> toList = stream1
//								.filter(el -> el.getNo() >= 2)
//								.collect(Collectors.toList());// Stream -> List

		System.out.println("foreach문");
		// foreach문
		for (BoardDto board : boardList) {
			System.out.print("번호:" + board.getNo() + " ");
			System.out.print("제목:" + board.getTitle() + " ");
			System.out.print("내용:" + board.getCotent() + " ");
			System.out.print("작성자:" + board.getWriter() + " ");
			System.out.println("닉네임:" + board.getNickName() + " ");
		}
		System.out.println("Iterator");
		// Iterator
		Iterator<BoardDto> iter = boardList.iterator();
		while (iter.hasNext()) {
			BoardDto board = iter.next();
			System.out.print("번호:" + board.getNo() + " ");
			System.out.print("제목:" + board.getTitle() + " ");
			System.out.print("내용:" + board.getCotent() + " ");
			System.out.print("작성자:" + board.getWriter() + " ");
			System.out.println("닉네임:" + board.getNickName() + " ");
		}
		System.out.println("forEach() ");
		// forEach()
		boardList.forEach(board -> {
			System.out.print("번호:" + board.getNo() + " ");
			System.out.print("제목:" + board.getTitle() + " ");
			System.out.print("내용:" + board.getCotent() + " ");
			System.out.print("작성자:" + board.getWriter() + " ");
			System.out.println("닉네임:" + board.getNickName() + " ");
		});

	}
}
