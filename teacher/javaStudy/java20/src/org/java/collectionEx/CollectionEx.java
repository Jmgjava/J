package org.java.collectionEx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.xml.sax.HandlerBase;

class Member {
	private String userId;
	private String userPw;

	public Member() {
	}

	public Member(String userId, String userPw) {
		super();
		this.userId = userId;
		this.userPw = userPw;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	@Override
	public String toString() {
		return "Member [userId=" + userId + ", userPw=" + userPw + "]";
	}

}

public class CollectionEx {

	public static void main(String[] args) {
		System.out.println("컬렉션 프레임워크");

		// List
		List<Member> members = new ArrayList<Member>();
		Member m1=new Member("m1", "11");
		members.add(m1);
		members.add(new Member("m2", "21"));
		members.add(new Member("m3", "31"));
		members.add(new Member("m4", "31"));
		members.add(new Member("m5", "51"));

		System.out.println("foreach문");// 모든 요소를 조회
		// foreach문
		for (Member member : members) {
			System.out.println(member.getUserId() + "," + member.getUserPw());
		}
		System.out.println("forEach() 매서드, 람다식 ");// 모든 요소를 조회
		members.forEach(member -> System.out.println(member.getUserId() + "," + member.getUserPw()));
		members.forEach(member -> {
			System.out.println(member.getUserId() + "," + member.getUserPw());
		});
		System.out.println("특정 값을 조회 "); // 특정 요소 조회
		members.forEach(member -> {
			if (member.getUserId().equals("m1"))
				System.out.println(member.getUserId() + "," + member.getUserPw());
		});

		System.out.println("Map<K,V>");
		// Map<K,V>
		Map<String, List<Member>> map1 = new HashMap<String, List<Member>>();
		// "memberList" members -> {"키":"값"} -> JSON, Ajax
		map1.put("memberList", members);// List -> Map

		System.out.println(map1);
		// Map -> List
		List<Member> memberList2 = map1.get("memberList");
		memberList2.forEach(member -> System.out.println(member.getUserId() + "," + member.getUserPw()));

		System.out.println("Stream -> 원본이 손상 없이 별도의 Stream객체생성");

		Stream<Member> streamList1 = memberList2.stream();

		List<Member> strList = streamList1.filter(el -> el.getUserId().contains("2"))// 필터링 -> 가공
				.collect(Collectors.toList()); // 결과물 -> List변환
		// 조회
		strList.forEach(el -> System.out.println(el.getUserId() + ", " + el.getUserPw())); // 결과(조회)

	}
}
