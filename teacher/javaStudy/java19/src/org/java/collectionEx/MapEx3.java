package org.java.collectionEx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapEx3 {

	public static void main(String[] args) {
		// {"키":"값","키":"값","키":"값" } -> Ajax, JSON
		// -> List ->Map
		System.out.println("Map");

		// List
		List<AjaxMemberDto> memberList = new ArrayList<AjaxMemberDto>();

		memberList.add(new AjaxMemberDto(1L, "m1", "11"));
		memberList.add(new AjaxMemberDto(2L, "m2", "21"));
		memberList.add(new AjaxMemberDto(3L, "m3", "31"));
		memberList.add(new AjaxMemberDto(4L, "m4", "41"));
		memberList.add(new AjaxMemberDto(5L, "m5", "51"));

		// List -> Map
		// {"키":"값"} ->{"키": Object} -> Ajax,JSON 데이터 처리 방식
		Map<String, List<AjaxMemberDto>> mapList = new HashMap<String, List<AjaxMemberDto>>();

		mapList.put("memberList", memberList);// {"memberList": List<AjaxMemberDto>}

		System.out.println(mapList.get("memberList"));
		mapList.get("memberList");
		// foreach문
		for (AjaxMemberDto member : mapList.get("memberList")) {
			System.out.println(member);
		}
		System.out.println();
		// forEach 매서드
		mapList.get("memberList").forEach(member -> {
			System.out.println(member);
		});

	}
}
