package org.java.colletionEx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapEx2 {

	public static void main(String[] args) {

		// {"키":"값", "키":"값", "키":"값", "키":"값"} -> Ajax, JSON
		System.out.println("Map");

		Map<Integer, AjaxMemberDto> map1 = new HashMap<Integer, AjaxMemberDto>();

		// key 중복 X
		map1.put(1, new AjaxMemberDto(1L, "m1", "11"));
		map1.put(2, new AjaxMemberDto(2L, "m2", "22"));
		map1.put(3, new AjaxMemberDto(3L, "m3", "33"));
		map1.put(4, new AjaxMemberDto(4L, "m4", "44"));
		map1.put(5, new AjaxMemberDto(5L, "m5", "55"));

		System.out.println(map1);

		// KeySet 메소드를 이용해서 키값 저장
		// 키값,Iterator를 이용해서 map1 모든 요소를 콘솔에 출력

		Set<Integer> member = map1.keySet();
		Iterator<Integer> iter1 = member.iterator();
		while (iter1.hasNext()) {
			Integer i = iter1.next();
			System.out.println("key: " + i + "\nId: " + map1.get(i).getId());
			System.out.println("Name: " + map1.get(i).getUserName());
			System.out.println("Pw: " + map1.get(i).getUserPw());
			System.out.println();
		}

		System.out.println();

		Map<String, Integer> map2 = new HashMap<String, Integer>();
		map2.put("정수데이터", 100);
		System.out.println(map2.get("정수데이터"));

		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);

		Map<String, List<Integer>> map3 = new HashMap<String, List<Integer>>();

		map3.put("list", list); // "list" 키갑승로 List<Integer> list 저장 -> Map

		System.out.println(map3.get("list")); // {"키", "값"}		{"list": List<Integer>}
		List<Integer> list2 = map3.get("list"); // Map -> list
		
		for(Integer i:list2) {
			System.out.println(i);
		}
		
		

	}

}
