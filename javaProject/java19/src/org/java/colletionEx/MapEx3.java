package org.java.colletionEx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapEx3 {

	public static void main(String[] args) {

		// {"Ű":"��", "Ű":"��", "Ű":"��", "Ű":"��"} -> Ajax, JSON
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

		// {"Ű":"��", "Ű":"��", "Ű":"��", "Ű":"��"} -> Ajax, JSON ������ ó�� ���
		mapList.put("memberList", memberList1); // {"Ű": "��} -> {"Ű": Object}

		System.out.println(mapList.get("memberList"));

		System.out.println();
		// for-each��
		for (AjaxMemberDto i : mapList.get("memberList")) {
			System.out.println(i);
		}

		System.out.println();

		// forEach �޼ҵ�
		mapList.get("memberList").forEach(member -> {
			System.out.println(member);
		});
		;

	}

}
