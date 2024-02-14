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
		// List -> Stream -> Stream�� ��� ��� ->(BŬ���� toBoardEntity()����)
		list2.stream().forEach(B::toBoardEntity);

//		list2.stream().forEach(el->{
//			B.toBoardEntity(el);
//		});;
//		

		//

		System.out.println("Stream");
		// �Խñ� 5�� -> List����
		// Map<> "boards"�� ����

		List<BoardDto> boardList = new ArrayList<BoardDto>();
		// int -> Integer, int ->Long , long ->Long
		boardList.add(new BoardDto(1l, "����1", "����1", "�ۼ���1", "m1"));
		boardList.add(new BoardDto(2l, "����2", "����2", "�ۼ���2", "m2"));
		boardList.add(new BoardDto(3l, "����3", "����3", "�ۼ���3", "m3"));
		boardList.add(new BoardDto(4l, "����4", "����4", "�ۼ���4", "m4"));
		boardList.add(new BoardDto(5l, "����5", "����5", "�ۼ���5", "m5"));

		// {"Ű":"��"} -> JSON -> Ajax , MongoDB
		Map<String, List<BoardDto>> boardMap = new HashMap<String, List<BoardDto>>();
		boardMap.put("boardList", boardList);
		System.out.println(boardMap);

		// Map -> List
		List<BoardDto> lists = boardMap.get("boardList");

		// Stream -> ������ �ջ� ���� �ʰ� ���ο� Stream��ü�� ���(�ѹ��� ���)
		Stream<BoardDto> stream1 = lists.stream();
		
		////////////////////////////////////////////////////////
		// BoardDto -> BoardEntity ��ȯ -> ���� 
		
		// void ���� BoardEntityŬ���� -> toBoardEntity�ż���
		stream1.forEach(BoardEntity::toBoardEntity);
		// Stream -> List
		stream1.collect(Collectors.toList());
		// BoardDto -> BoardEntity ��ȯ
		stream1.map(BoardEntity::toBoardEntity);
		// Stream -> List
		List<BoardEntity> boardEntityList = 
				stream1.map(BoardEntity::toBoardEntity)
				.collect(Collectors.toList());
		
		////////////////////////////////////////////////////////	
		

//		stream1.forEach(System.out::println);

//		stream1.filter(el -> el.getNo() >= 2) // ���͸�
//				.collect(Collectors.toList()) // Stream -> List
//				.forEach(el -> {
//					System.out.print("��ȣ:" + el.getNo() + " ");
//					System.out.print("����:" + el.getTitle() + " ");
//					System.out.print("����:" + el.getCotent() + " ");
//					System.out.print("�ۼ���:" + el.getWriter() + " ");
//					System.out.println("�г���:" + el.getNickName() + " ");
//				});
//		List<BoardDto> toList = stream1
//								.filter(el -> el.getNo() >= 2)
//								.collect(Collectors.toList());// Stream -> List

		System.out.println("foreach��");
		// foreach��
		for (BoardDto board : boardList) {
			System.out.print("��ȣ:" + board.getNo() + " ");
			System.out.print("����:" + board.getTitle() + " ");
			System.out.print("����:" + board.getCotent() + " ");
			System.out.print("�ۼ���:" + board.getWriter() + " ");
			System.out.println("�г���:" + board.getNickName() + " ");
		}
		System.out.println("Iterator");
		// Iterator
		Iterator<BoardDto> iter = boardList.iterator();
		while (iter.hasNext()) {
			BoardDto board = iter.next();
			System.out.print("��ȣ:" + board.getNo() + " ");
			System.out.print("����:" + board.getTitle() + " ");
			System.out.print("����:" + board.getCotent() + " ");
			System.out.print("�ۼ���:" + board.getWriter() + " ");
			System.out.println("�г���:" + board.getNickName() + " ");
		}
		System.out.println("forEach() ");
		// forEach()
		boardList.forEach(board -> {
			System.out.print("��ȣ:" + board.getNo() + " ");
			System.out.print("����:" + board.getTitle() + " ");
			System.out.print("����:" + board.getCotent() + " ");
			System.out.print("�ۼ���:" + board.getWriter() + " ");
			System.out.println("�г���:" + board.getNickName() + " ");
		});

	}
}
