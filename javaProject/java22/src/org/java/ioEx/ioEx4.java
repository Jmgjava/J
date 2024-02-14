package org.java.ioEx;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ioEx4 {

	public static void main(String[] args) {
		System.out.println("IO4");

		InputStreamReader iReader = new InputStreamReader(System.in);

		while (true) {
			System.out.println("입력: ");

			try {
				int inData = iReader.read();
				// -1 (ctrl+z)
				if (inData == -1) {
					System.out.println("종료");
					break;
				}

			} catch (IOException e) {
				e.printStackTrace();
			}

			finally {
				try {
					iReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
