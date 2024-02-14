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

			System.out.println("url: " + url); // ��üURL
			System.out.println("Protocol: " + url.getProtocol()); // ��������
			System.out.println("Host: " + url.getHost()); // ȣ��Ʈ
			System.out.println("Port: " + url.getPort()); // ��Ʈ
			System.out.println("Path: " + url.getPath()); // ������ �⺻ ���
			System.out.println("File: " + url.getFile()); // �����̸�
			System.out.println("Query: " + url.getQuery()); // 

		} catch (MalformedURLException e) {
			System.out.println("�߸��� URL�Դϴ�.");
			e.printStackTrace();
		}

	}
}
