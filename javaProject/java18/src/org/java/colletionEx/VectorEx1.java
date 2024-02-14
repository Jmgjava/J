package org.java.colletionEx;

import java.util.Vector;

public class VectorEx1 {

	public static void main(String[] args) {
		System.out.println("Vector");
		// 정수형 데이터를 저장할 수 있는 Vector 생성
		Vector<Integer> v1 = new Vector<Integer>();

		Integer i1 = new Integer(10); // 박싱
		Integer i2 = 20; // 자동박싱

		v1.add(i1); // 생성된 객체를 참조하는 인스턴스 추가
		v1.add(new Integer(30)); // 생성된 객체를 바로 추가
		v1.add(40); // 자동 박싱
		// Vector 요소식 타입 -> Integer
		// v1 -> 벡터객체
		for (Integer i : v1) {
			// 모든 벡터요소를 조회
			System.out.println(i);
		}

		System.out.println("========");

		// 컬렉션에 객체를 두는 방법
		// 1. 기본자료형(8가지) -> Wrapper, 인스턴스, new, 자동 박싱

		Vector<Double> v2 = new Vector<Double>();
		// 인스턴스
		Double d = new Double(1.1); // 박싱
		Double d2 = 3.3; // 자동박싱
		v2.add(2.2);
		v2.add(d);
		v2.add(d2);
		v2.add(4.4); // 자동박싱

		// v2의 모든 요소를 콘솔에 출력

		for (Double i : v2) {
			System.out.println(i);
		}

		System.out.println("========");

		Vector<Float> v3 = new Vector<Float>();
		v3.add(new Float(6.6));
		v3.add(5.5F);

		for (Float i : v3) {
			System.out.println(i);
		}

		System.out.println("========");

		// 2.String -> new, " "

		Vector<String> v4 = new Vector<String>();
		String str1 = new String("문자열1");
		String str2 = "문자열2";
		v4.add(str1);
		v4.add(str2);
		v4.add(new String("문자열3"));
		v4.add("문자열4");

		for (String s : v4) {
			System.out.print(s);
			System.out.print("길이: " + s.length() + " ");
			System.out.println(s.equals("문자열1"));
		}

		System.out.println("========");

		// 3.일반클래스 -> new, 타입 변수

		MemberDto member1 = new MemberDto(10, "m1");
		MemberDto member2 = new MemberDto(20, "m2");
		MemberDto member3 = new MemberDto(30, "m3");
		MemberDto member4 = new MemberDto(40, "m4");
		MemberDto member5 = new MemberDto(50, "m5");

		Vector<MemberDto> vDto = new Vector<MemberDto>();
		vDto.add(member1);
		vDto.add(member2);
		vDto.add(member3);
		vDto.add(member4);
		vDto.add(member5);

		System.out.println(vDto.size());
		System.out.println(vDto.get(0).getA()); // vDto 벡터의 0번지 요소중 int a를 불러옴
		System.out.println(vDto.get(0).getName());

		for (MemberDto i : vDto) {
			System.out.println(i);
			// age(나이), name(이름)을 각각 출력
			System.out.println("이름: " + i.getName() + ", 나이: " + i.getA());
		}

		System.out.println("========");

		Vector<MemberDto> vDto2 = new Vector<MemberDto>();

		vDto2.add(new MemberDto(110, "m11"));
		vDto2.add(new MemberDto(120, "m12"));
		vDto2.add(new MemberDto(130, "m13"));
		vDto2.add(new MemberDto(140, "m14"));
		vDto2.add(new MemberDto(150, "m15"));
		System.out.println(vDto2);

		// for -> 조회 갯수를 설정
		for (int i = 0; i < vDto2.size(); i++) {
			System.out.println(vDto2.get(i));
		}
		// for-each -> 모든 컬렉션 요소를 조회 -> 하나씩 요소를 조회
		for (MemberDto i : vDto2) {
			System.out.println(i);
		}

	}

}
