package org.java.networkEx;

import java.net.MalformedURLException;
import java.net.URL;

public class NetWorkEx2 {

	public static void main(String[] args) {
		System.out.println("network");

		String urlData = "http://192.168.23.211:8099/board/boardList?userId=11&userPw=11";
//		String urlData = "http://192.168.23.211:8099/upload/a99c570b-fb14-4ebc-852c-9b1c8d45a0ef_s1.jpg";

		URL url = null;

		try {
			url = new URL(urlData);

			System.out.println("url: " + url); // 전체URL
			System.out.println("Protocol: " + url.getProtocol()); // 프로토콜
			System.out.println("Host: " + url.getHost()); // 호스트
			System.out.println("Port: " + url.getPort()); // 포트
			System.out.println("Path: " + url.getPath()); // 서버의 기본 경로
			System.out.println("File: " + url.getFile()); // 파일이름
			System.out.println("Query: " + url.getQuery()); // 

		} catch (MalformedURLException e) {
			System.out.println("잘못된 URL입니다.");
			e.printStackTrace();
		}

	}
}
