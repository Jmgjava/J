package org.java.collectionEx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapEx2 {

	public static void main(String[] args) {

		// {"키":"값","키":"값","키":"값" } -> Ajax, JSON
		System.out.println("Map");

		Map<Integer, AjaxMemberDto> members = new HashMap<Integer, AjaxMemberDto>();
		// key 중복X
		members.put(1, new AjaxMemberDto(1L, "m1", "11"));
		members.put(2, new AjaxMemberDto(2L, "m2", "21"));
		members.put(3, new AjaxMemberDto(3L, "m3", "31"));
		members.put(4, new AjaxMemberDto(4L, "m4", "41"));
		members.put(5, new AjaxMemberDto(5L, "m5", "51"));

		// Set -> keySet() -> 키값을 저장
		// 키값,Iterator 을 이용해서 members모든 요소를 콘솔에 출력
		Set<Integer> set1 = members.keySet();
		Iterator<Integer> iter = set1.iterator();
		while (iter.hasNext()) {
			Integer key = iter.next();
//			System.out.println("key: "+key+", value: "+members.get(key));			
			System.out.println(members.get(key).getId() + ", " + members.get(key).getUserName() + ","
					+ members.get(key).getUserPw());
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
		map3.put("list", list);// "list"키값으로 List<Integer> list 저장 -> List -> Map

		System.out.println(map3.get("list")); // {"키": "값"} {"list":List<Inter>}
		List<Integer> list2 = map3.get("list");// Map-> List

		for (Integer i : list2) {
			System.out.println(i);
		}

	}
}
