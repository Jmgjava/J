package org.java.urlNetWorkEx;

import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class NetWorkEx1 {

	public static void main(String[] args) {

		System.out.println("network");
		// URL에 데이터를 읽어서 콘솔에 출력
		BufferedReader in = null;

		try {
			// URL -> 원하는 웹 URL의 정보를 읽을 수 있다.
			// URL 저장 경로
			String urlData = "https://www.apple.com/";
			// URL
			URL url = new URL(urlData);
			in = new BufferedReader(new InputStreamReader(url.openStream()));

			String htmlStr = "";
			while ((htmlStr = in.readLine()) != null) {
				System.out.println(htmlStr);
			}

		} catch (IOException e) {
			System.out.println("URL 읽는중 에러 발생 ");
			e.printStackTrace();
		} finally {
			if (in != null)
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}

	}

}
