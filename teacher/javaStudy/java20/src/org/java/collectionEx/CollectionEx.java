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
		System.out.println("�÷��� �����ӿ�ũ");

		// List
		List<Member> members = new ArrayList<Member>();
		Member m1=new Member("m1", "11");
		members.add(m1);
		members.add(new Member("m2", "21"));
		members.add(new Member("m3", "31"));
		members.add(new Member("m4", "31"));
		members.add(new Member("m5", "51"));

		System.out.println("foreach��");// ��� ��Ҹ� ��ȸ
		// foreach��
		for (Member member : members) {
			System.out.println(member.getUserId() + "," + member.getUserPw());
		}
		System.out.println("forEach() �ż���, ���ٽ� ");// ��� ��Ҹ� ��ȸ
		members.forEach(member -> System.out.println(member.getUserId() + "," + member.getUserPw()));
		members.forEach(member -> {
			System.out.println(member.getUserId() + "," + member.getUserPw());
		});
		System.out.println("Ư�� ���� ��ȸ "); // Ư�� ��� ��ȸ
		members.forEach(member -> {
			if (member.getUserId().equals("m1"))
				System.out.println(member.getUserId() + "," + member.getUserPw());
		});

		System.out.println("Map<K,V>");
		// Map<K,V>
		Map<String, List<Member>> map1 = new HashMap<String, List<Member>>();
		// "memberList" members -> {"Ű":"��"} -> JSON, Ajax
		map1.put("memberList", members);// List -> Map

		System.out.println(map1);
		// Map -> List
		List<Member> memberList2 = map1.get("memberList");
		memberList2.forEach(member -> System.out.println(member.getUserId() + "," + member.getUserPw()));

		System.out.println("Stream -> ������ �ջ� ���� ������ Stream��ü����");

		Stream<Member> streamList1 = memberList2.stream();

		List<Member> strList = streamList1.filter(el -> el.getUserId().contains("2"))// ���͸� -> ����
				.collect(Collectors.toList()); // ����� -> List��ȯ
		// ��ȸ
		strList.forEach(el -> System.out.println(el.getUserId() + ", " + el.getUserPw())); // ���(��ȸ)

	}
}
