package org.java.basicApi;

public class StringEx2 {

	public static void main(String[] args) {

		System.out.println("String");
		System.out.println("String 주요 메소드");

		String s1 = "java";
		String s2 = "oracle";
		String s3 = "Java 2024 Project";
		// 문자열 길이 -> length() 공백까지 포함
		System.out.println("문자열 길이 -> length() 공백까지 포함");
		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println(s3.length());

		String userId = "m111";
		int size = userId.length(); // int형 변환
		System.out.println(size < 4); // int형 비교\
		if (size < 5) { // int형 if문
			System.out.println("5글자 이상 입력하세요");
		}

		System.out.println(s3);
		System.out.println(s3.charAt(6));
		System.out.println(s3.codePointAt(5));

		System.out.println("compareTo(문자열) -> 사전(문자열비교)");
		System.out.println(s3.compareTo(s2)); // -1(사전순서앞)
		System.out.println("az".compareTo("za"));

		System.out.println("concat(String str), 문자열 합쳐서 -> 새로운 문자열");
		String addr1 = "서울시";
		String addr2 = "노원구";
		String addr3 = addr1.concat(" " + addr2); // 새로운 문자열 addr3 생성
		System.out.println(addr3);
		System.out.println(addr2);
		System.out.println(addr1);

		String s31 = "Java 2024 Project";
		System.out.println(".contains(CharSequence s) -> 포함되어 있는가..?(검색)");
		System.out.println(s31.contains("j"));

		String s32 = "Java 2023 Project";
		System.out.println("replace(문자열1, 문자열2) -> 문자열1 -> 문자열2 바꿔라");
		String s33 = s31.replace("2023", "2024"); // 2023 -> 2024
		System.out.println(s33);
		System.out.println(s32); // 원본 문자열은 변함이 없다.

		System.out.println(".split() -> 특정기호로 분리해서 String 배열로 저장");
		String phone = "010-1234-5678";
		// -으로 구분하여 String 배열 저장
		String[] ph1 = phone.split("-"); // "-" 구분하여 스트링 배열에 저장
		System.out.println(ph1);
		// "010" "1234" "5678"
		System.out.println(ph1[0] + "," + ph1[1] + "," + ph1[2]);

		// 1. for문 이용해서 출력
		for (int i = 0; i < ph1.length; i++) {
			System.out.print(ph1[i] + "..");

		}

		System.out.println();

		// 2. for each문 이용해서 출력
//		for(요소 타입 요소: 객체(배열)) {}
		for (String i : ph1) {
			System.out.println(i); // 배열의 모든 요소 조회
		}

		System.out.println("toLowerCase(), toUpperCase() -> 소문자로 바꿔라, 대문자로 바꿔라");
		String alpha = "JAVA";

		String alpha1 = alpha.toLowerCase();
		System.out.println(alpha1);

		String alpha2 = alpha1.toUpperCase();
		System.out.println(alpha2);

		System.out.println("trim() -> 공백 제거");
		String passward = "  1 2 3 4  ";
		System.out.println(passward);
		System.out.println(passward.length() < 4);
		System.out.println(passward.trim());

	}

}
