package org.java.urlNetWorkEx;

import java.net.MalformedURLException;
import java.net.URL;

public class NetWorkEx2 {

	public static void main(String[] args) {
		System.out.println("NetWork");

		String urlData = "http://192.168.23.211:8099/board/boardList";

		URL url = null;

		try {
			url = new URL(urlData);

			System.out.println("url: " + url); // 프로토콜 : http
			System.out.println("Protocol: " + url.getProtocol()); // 프로토콜 : http
			System.out.println("Host: " + url.getHost()); // 호스트 : 192.168.23.211
			System.out.println("Port: " + url.getPort()); // 포트 : :8099
			System.out.println("Path: " + url.getPath()); // 서버의 기본 경로
			System.out.println(": " + url.getFile()); // 파일 : /board/boardList
			System.out.println(": " + url.getQuery());
			

		} catch (MalformedURLException e) {
			System.out.println("잘못된 url입니다");
			e.printStackTrace();
		}
	}

}
