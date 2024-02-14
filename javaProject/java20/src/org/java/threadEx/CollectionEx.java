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

	public String getUserPw() { // 생성자
		return userPw;
	}

	public void setUserPw(String userPw) { // private 등의 보안 접근 허용
		this.userPw = userPw;
	}

	public Member(String userId, String userPw) { // 다른 생성자
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

		System.out.println("for-each문");
		for (Member i : members) {
			System.out.println("id:" + i.getUserId() + " Pw:" + i.getUserPw() + " ");
		}

		System.out.println("forEach문");
		members.forEach(i -> System.out.println("id:" + i.getUserId() + " Pw:" + i.getUserPw() + " "));

		System.out.println("while문");
		Iterator<Member> iter1 = members.iterator();
		while (iter1.hasNext()) {
			Member list = iter1.next();
			System.out.println("id:" + list.getUserId() + " Pw:" + list.getUserPw() + " ");
		}

		System.out.println("특정 값을 조회");
		members.forEach(i -> {
			if (i.getUserId().equals("m1"))
				System.out.println(i);
		});

		// Map<K,V>
		Map<String, List<Member>> map1 = new HashMap<String, List<Member>>();
		// "memberList" members -> {"키","값"} -> JSON, Ajax
		map1.put("memberList", members); // List -> Map

		System.out.println(map1);
//								   Map -> List
		List<Member> memberList2 = map1.get("memberList");
		memberList2.forEach(i -> {
			System.out.println("id:" + i.getUserId() + " Pw:" + i.getUserPw() + " ");
		});

		System.out.println("Stream -> 원본이 손상X 별도의 Stream객체 생성");

		Stream<Member> stream1 = memberList2.stream();

		List<Member> streamList3 = 
				stream1.filter(el -> el.getUserId().contains("2")) // 필터링 -> 가공
				.collect(Collectors.toList()); // 결과물 -> List 변환

		streamList3.forEach(i -> System.out.println(i)); // 결과

	}

}
