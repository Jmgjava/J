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

			System.out.println("url: " + url); // �������� : http
			System.out.println("Protocol: " + url.getProtocol()); // �������� : http
			System.out.println("Host: " + url.getHost()); // ȣ��Ʈ : 192.168.23.211
			System.out.println("Port: " + url.getPort()); // ��Ʈ : :8099
			System.out.println("Path: " + url.getPath()); // ������ �⺻ ���
			System.out.println(": " + url.getFile()); // ���� : /board/boardList
			System.out.println(": " + url.getQuery());
			

		} catch (MalformedURLException e) {
			System.out.println("�߸��� url�Դϴ�");
			e.printStackTrace();
		}
	}

}
