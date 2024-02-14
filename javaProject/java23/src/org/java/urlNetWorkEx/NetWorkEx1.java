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
		// URL�� �����͸� �о �ֿܼ� ���
		BufferedReader in = null;

		try {
			// URL -> ���ϴ� �� URL�� ������ ���� �� �ִ�.
			// URL ���� ���
			String urlData = "https://www.apple.com/";
			// URL
			URL url = new URL(urlData);
			in = new BufferedReader(new InputStreamReader(url.openStream()));

			String htmlStr = "";
			while ((htmlStr = in.readLine()) != null) {
				System.out.println(htmlStr);
			}

		} catch (IOException e) {
			System.out.println("URL �д��� ���� �߻� ");
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
