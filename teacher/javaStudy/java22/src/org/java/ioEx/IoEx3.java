package org.java.ioEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IoEx3 {

	public static void main(String[] args) {
		System.out.println("IO");

		InputStreamReader reader = null;
//			BufferedReader bReader = new BufferedReader(reader);

		int rs = 0;

		try {

			while (true) {

				System.out.println("숫자입력: ");

				reader = new InputStreamReader(System.in);

				int rs2 = reader.read();

				System.out.println("rs2-> " + rs2);
				if (rs2 == -1)
					break;// -1 -> ctr+z
				rs += rs2; // 숫자 -> -1종류
			}
			System.out.println("누적합계: " + rs);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
