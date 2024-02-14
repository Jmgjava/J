package org.java.threadEx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Member {
	private String userId;
	private String userPw;

	public Member() {

		// TODO Auto-generated constructor stub
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() { // ������
		return userPw;
	}

	public void setUserPw(String userPw) { // private ���� ���� ���� ���
		this.userPw = userPw;
	}

	public Member(String userId, String userPw) { // �ٸ� ������
		super();
		this.userId = userId;
		this.userPw = userPw;
	}

	@Override
	public String toString() {
		return "Member [userId=" + userId + ", userPw=" + userPw + "]";
	}

}

public class CollectionEx {

	public static void main(String[] args) {

		System.out.println("Collection Framework");

		List<Member> members = new ArrayList<Member>();
		members.add(new Member("m1", "11"));
		members.add(new Member("m2", "12"));
		members.add(new Member("m3", "13"));
		members.add(new Member("m4", "14"));
		members.add(new Member("m5", "15"));

		System.out.println("for-each��");
		for (Member i : members) {
			System.out.println("id:" + i.getUserId() + " Pw:" + i.getUserPw() + " ");
		}

		System.out.println("forEach��");
		members.forEach(i -> System.out.println("id:" + i.getUserId() + " Pw:" + i.getUserPw() + " "));

		System.out.println("while��");
		Iterator<Member> iter1 = members.iterator();
		while (iter1.hasNext()) {
			Member list = iter1.next();
			System.out.println("id:" + list.getUserId() + " Pw:" + list.getUserPw() + " ");
		}

		System.out.println("Ư�� ���� ��ȸ");
		members.forEach(i -> {
			if (i.getUserId().equals("m1"))
				System.out.println(i);
		});

		// Map<K,V>
		Map<String, List<Member>> map1 = new HashMap<String, List<Member>>();
		// "memberList" members -> {"Ű","��"} -> JSON, Ajax
		map1.put("memberList", members); // List -> Map

		System.out.println(map1);
//								   Map -> List
		List<Member> memberList2 = map1.get("memberList");
		memberList2.forEach(i -> {
			System.out.println("id:" + i.getUserId() + " Pw:" + i.getUserPw() + " ");
		});

		System.out.println("Stream -> ������ �ջ�X ������ Stream��ü ����");

		Stream<Member> stream1 = memberList2.stream();

		List<Member> streamList3 = 
				stream1.filter(el -> el.getUserId().contains("2")) // ���͸� -> ����
				.collect(Collectors.toList()); // ����� -> List ��ȯ

		streamList3.forEach(i -> System.out.println(i)); // ���

	}

}
