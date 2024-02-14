package org.java.basicApi;

public class StringEx2 {

	public static void main(String[] args) {

		System.out.println("String");
		System.out.println("String 주요 매서드");

		String s1 = "java";
		String s2 = "oracle";
		String s3 = "java 2024 Project";

		// 문자열 길이 -> length() 공백 포함
		System.out.println("문자열 길이 -> length() 공백 포함 ");
		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println(s3.length());

		String userId = "m111";
		int size = userId.length();
		System.out.println(size < 4);
		if (size < 5) {
			System.out.println("5글자 이상입력하세요!!");
		}
		System.out.println("charAt(인덱스)  ");
		System.out.println(s3);
		System.out.println(s3.charAt(5));
		System.out.println(s3.codePointAt(5));

		System.out.println("compareTo(문자열) ->  사전(문자열비교)  ");
		System.out.println(s1.compareTo(s2));// -1(사전순서압)
		System.out.println("az".compareTo("za"));

		System.out.println("concat(String str), 문자열합쳐서 -> 새로운 문자열");

		String addr1 = "서울시";
		String addr2 = "노원구";
		System.out.println(addr1.concat(addr2));
		String addr3 = addr1.concat(addr2);
		System.out.println(addr3);
		System.out.println(addr1);
		System.out.println(addr2);

		String s31 = "java 2024 Project";
		System.out.println("contains() -> 포함되어 있느냐?... 검색 ");
		System.out.println(s31.contains("j"));		
		
		String s32 = "java 2023 Project";
		System.out.println("replace(문자열1,문자열2) -> 문자열1 -> 문자열2 바꿔라 -> 새로운 문자열  ");
		// "2023" -> "2024"
		String s32_R=s32.replace("2023", "2024");
		System.out.println(s32_R);
		System.out.println(s32); // 원래 문자열은 변함이 없다*****
		
		System.out.println("split -> 특정기호로 분리해서 String배열로 저장 ");
		String phone="010-1234-5678";
		
		// -으로 구분하여 String 배열 저장
		String[] phoneArr= phone.split("-");// "-"구분하여 String배열에 저장
	    // {"010","1234","5678"}		
		System.out.println(phoneArr[0]+","+phoneArr[1]+","+phoneArr[2]);
		
		//1.for문이용해서 출력
		for(int i=0;i<phoneArr.length;i++) {
			System.out.println(phoneArr[i]);
		}
		System.out.println();
		
		//2.foreach문이용해서 출력
		for(String element: phoneArr) {
			System.out.println(element);// 배열의 모든 요소 조회
		}
		
		System.out.println("소문자변환->toLowerCase(), 대문자변환->toUpperCase()");
		String apha1="JAVA";
		System.out.println(apha1.toLowerCase());
		String apha2="java";
		System.out.println(apha2.toUpperCase());
		
		System.out.println("trim() -> 공백제거(좌/우)");
		
		String password=" 1234 ";
		System.out.println(password.length());
		System.out.println(password.length()>5);
		
		String pw2= password.trim();
		System.out.println(pw2.length());		

	}
}
