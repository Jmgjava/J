package org.java.colletionEx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapEx3 {

	public static void main(String[] args) {

		// {"키":"값", "키":"값", "키":"값", "키":"값"} -> Ajax, JSON
		// -> List -> Map
		System.out.println("Map");

		// List
		List<AjaxMemberDto> memberList1 = new ArrayList<AjaxMemberDto>();

		memberList1.add(new AjaxMemberDto(1L, "m1", "11"));
		memberList1.add(new AjaxMemberDto(2L, "m2", "22"));
		memberList1.add(new AjaxMemberDto(3L, "m3", "33"));
		memberList1.add(new AjaxMemberDto(4L, "m4", "44"));
		memberList1.add(new AjaxMemberDto(5L, "m5", "55"));

		// List -> Map
		Map<String, List<AjaxMemberDto>> mapList = new HashMap<String, List<AjaxMemberDto>>();

		// {"키":"값", "키":"값", "키":"값", "키":"값"} -> Ajax, JSON 데이터 처리 방식
		mapList.put("memberList", memberList1); // {"키": "값} -> {"키": Object}

		System.out.println(mapList.get("memberList"));

		System.out.println();
		// for-each문
		for (AjaxMemberDto i : mapList.get("memberList")) {
			System.out.println(i);
		}

		System.out.println();

		// forEach 메소드
		mapList.get("memberList").forEach(member -> {
			System.out.println(member);
		});
		;

	}

}
