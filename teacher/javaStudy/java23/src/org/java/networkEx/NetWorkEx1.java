package org.java.networkEx;

import java.io.BufferedReader;
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
			//URL -> 원하는 웹 URL의 정보를 읽을 수가 있다.
			// URL 자원 경로
//			String urlData = "http://192.168.23.211:8099/board/boardList";
//			String urlData = "https://www.naver.com/";
			String urlData = "https://www.apple.com/";
			// URL
			URL url = new URL(urlData);
			in = new BufferedReader(new InputStreamReader(url.openStream()));

			String htmlStr = "";

			while ((htmlStr = in.readLine()) != null) {
				System.out.println(htmlStr);
			}

		} catch (IOException e) {
			System.out.println("URL에서 데이터 읽는 중에 에러가 발생 했습니다.");
			e.printStackTrace();
		} finally {
			try {
				if (in != null)
					in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
