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
		// List -> Stream -> Stream ��� ��� -> (BŬ���� toBoardEntity()����)
		list2.stream().forEach(B::toBoardEntity);
//		list2.stream().forEach(el -> {
//			B.toBoardEntity(el);
//		});

		System.out.println("Stream");
		// �Խñ� 5���� List�� ����
		// Map<> "boards"�� ����

		List<boardDto> boardlist = new ArrayList<boardDto>();

		boardlist.add(new boardDto(1l, "����1", "����1", "�ۼ���1", "m1"));
		boardlist.add(new boardDto(2l, "����2", "����2", "�ۼ���2", "m2"));
		boardlist.add(new boardDto(3l, "����3", "����3", "�ۼ���3", "m3"));
		boardlist.add(new boardDto(4l, "����4", "����4", "�ۼ���4", "m4"));
		boardlist.add(new boardDto(5l, "����5", "����5", "�ۼ���5", "m5"));

		// {"Ű","��"} -> JSON -> Ajax, MongoDB
		Map<String, List<boardDto>> boardMap = new HashMap<String, List<boardDto>>();
		boardMap.put("boardList", boardlist);

		System.out.println(boardMap);

		// Map -> List
		List<boardDto> list1 = boardMap.get("boardList");

		// Stream -> ������ �ջ� ���� �ʰ� ���ο� Stream��ü�� ���(�ѹ��� ���)
		Stream<boardDto> stream1 = list1.stream();

		// boardDto -> boardEntity ��ȯ -> ����

//		// void ���� boardEntityŬ���� -> toboardEntity�޼ҵ�
//		stream1.forEach(BoardEntity::toBoardEntity);
//		// Stream -> List
//		stream1.collect(Collectors.toList());
//		// BoardDto -> BoardEntity ��ȯ
//		stream1.map(BoardEntity::toBoardEntity);
//		// Stream -> List
//		List<BoardEntity> boardEntityList = 
//				stream1.map(BoardEntity::toBoardEntity)
//				.collect(Collectors.toList());

//		stream1.filter(i -> i.getNo() >= 3) // ���͸�
//				.forEach(i -> {
//					System.out.print("�۹�ȣ:" + i.getNo() + " ");
//					System.out.print("������:" + i.getTitle() + " ");
//					System.out.print("�۳���:" + i.getContent() + " ");
//					System.out.print("�ۼ���:" + i.getWriter() + " ");
//					System.out.print("�г���:" + i.getNickName() + " ");
//					System.out.println();
//				});

//		stream1.forEach(System.out::print);

		List<boardDto> toList = stream1.filter(i -> i.getNo() >= 3) // ���͸�
				.collect(Collectors.toList()); // Stream -> List

		System.out.println("for-each");
		// for-each
		for (boardDto i : boardlist) {
			System.out.print("�۹�ȣ:" + i.getNo() + " ");
			System.out.print("������:" + i.getTitle() + " ");
			System.out.print("�۳���:" + i.getContent() + " ");
			System.out.print("�ۼ���:" + i.getWriter() + " ");
			System.out.print("�г���:" + i.getNickName() + " ");
			System.out.println();
		}

		System.out.println("iterator");
		// iterator
		Iterator<boardDto> iter1 = boardlist.iterator();
		while (iter1.hasNext()) {
			boardDto i = iter1.next();
			System.out.print("�۹�ȣ:" + i.getNo() + " ");
			System.out.print("������:" + i.getTitle() + " ");
			System.out.print("�۳���:" + i.getContent() + " ");
			System.out.print("�ۼ���:" + i.getWriter() + " ");
			System.out.print("�г���:" + i.getNickName() + " ");
			System.out.println();
		}

		System.out.println("forEach��");
		// forEach ��
		boardlist.forEach(i -> {
			System.out.print("�۹�ȣ:" + i.getNo());
			System.out.print("������:" + i.getTitle() + " ");
			System.out.print("�۳���:" + i.getContent() + " ");
			System.out.print("�ۼ���:" + i.getWriter() + " ");
			System.out.print("�г���:" + i.getNickName() + " ");
			System.out.println();
		});

	}

}
