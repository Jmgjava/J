package org.java.networkEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class NetWorkEx3 {

	public static void main(String[] args) {
		System.out.println("network");
		
		String urlData = "http://192.168.23.211:8099/";
		URL url=null;
		
		try {
			
			url=new URL(urlData);
			// 1.연결 
			URLConnection uC=url.openConnection();			
			uC.setDoOutput(true);
			
			// 2. 연결URL 쿼리문 정송
			// 쿼리문 저장 객체
			OutputStreamWriter out=new OutputStreamWriter(uC.getOutputStream());					
			// 쿼리문을 보낼려고
			out.write("userId=11&userPw=11");
			out.close();
			
			// 3. 결과를 콘솔에 출력
			// 다시 정보를 읽어 드린다.
			BufferedReader in=new BufferedReader(new InputStreamReader(uC.getInputStream()));

			String htmlStr = "";

			while ((htmlStr = in.readLine()) != null) {
				System.out.println(htmlStr);
			}

			in.close();
			
		} catch (MalformedURLException e) {
			System.out.println("URL Fail!");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("데이터 입력 Fail!!");
			e.printStackTrace();
		}
		
		
		
		
	}
}
