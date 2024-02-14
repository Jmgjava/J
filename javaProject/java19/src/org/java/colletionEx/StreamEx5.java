package org.java.colletionEx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.java.dto.boardDto;

public class StreamEx5 {

	public static void main(String[] args) {

		System.out.println("Stream");
		// �Խñ� 5���� List�� ����
		// Map<> "boards"�� ����

		List<boardDto> list = new ArrayList<boardDto>();

		list.add(new boardDto(1l, "����1", "����1", "�ۼ���1", "m1"));
		list.add(new boardDto(2l, "����2", "����2", "�ۼ���2", "m2"));
		list.add(new boardDto(3l, "����3", "����3", "�ۼ���3", "m3"));
		list.add(new boardDto(4l, "����4", "����4", "�ۼ���4", "m4"));
		list.add(new boardDto(5l, "����5", "����5", "�ۼ���5", "m5"));

		System.out.println("for-each");
		// for-each
		for (boardDto i : list) {
			System.out.println("�۹�ȣ: " + i.getNo());
			System.out.println("������: " + i.getTitle());
			System.out.println("�۳���: " + i.getContent());
			System.out.println("�ۼ���: " + i.getWriter());
			System.out.println("�г���: " + i.getNickName());
			System.out.println();
		}

		System.out.println("iterator");
		// iterator
		Iterator<boardDto> iter1 = list.iterator();
		while (iter1.hasNext()) {
			boardDto i = iter1.next();
			System.out.println("�۹�ȣ: " + i.getNo());
			System.out.println("������: " + i.getTitle());
			System.out.println("�۳���: " + i.getContent());
			System.out.println("�ۼ���: " + i.getWriter());
			System.out.println("�г���: " + i.getNickName());
			System.out.println();
		}

		System.out.println("forEach��");
		// forEach ��
		list.forEach(i -> {
			System.out.println("�۹�ȣ: " + i.getNo());
			System.out.println("������: " + i.getTitle());
			System.out.println("�۳���: " + i.getContent());
			System.out.println("�ۼ���: " + i.getWriter());
			System.out.println("�г���: " + i.getNickName());
			System.out.println();
		});

	}

}
