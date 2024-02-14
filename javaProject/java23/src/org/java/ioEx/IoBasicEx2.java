package org.java.ioEx;

import java.io.IOException;
import java.io.InputStreamReader;

public class IoBasicEx2 {

	public static void main(String[] args) {
		System.out.println("IO");
		// 콘솔에서 입력을 받고 -1(ctrl+z)를 입력을 하면 종료

		InputStreamReader iReader = new InputStreamReader(System.in);

		try {

			while (true) {
				int inData = iReader.read(); // 입력값을(byte -> int)
				System.out.println("입력 데이터: " + inData);
				// ctrl+z -> -1
				if (inData == -1) {
					System.out.println("while문 종료");
					break; // while문 종료

				}
				System.out.println("출력 데이터: " + (char) inData);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				iReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
