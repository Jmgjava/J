package org.java.ioEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {

	public static void main(String[] args) {
		System.out.println("FileOutputStream");
		// 파일(텍스트+이진)을 저장한다. (파일생성)

		FileOutputStream foutput = null; // finally에 넣기 위해
		String fileName = "C:\\sample\\test2.out";
		
		FileInputStream fStream = null;

		try {
			// 파일 저장 //
			// 입력을 받아서 저장 시킨다. -> Write() ->
			foutput = new FileOutputStream(fileName);

			// 10 ~ 1 숫자를 저장 ->
			for (int i = 0; i < 10; i++) {
				int num = 10 - i; // 10 9 8 ..... 1
				System.out.println(num + "<--");
				foutput.write(num); // 파일 읽기
			}
			// 파일 저장 //

			// 파일 읽어들임.
			fStream = new FileInputStream(fileName);
			int inData = 0;

			// file의 data를 하나씩 -> 파일의 마지막 -1
			while ((inData = fStream.read()) != -1) {
				// 하나씩 출력 -> 공백 및 엔터 포함
				System.out.print((char) inData);

			}

		} catch (FileNotFoundException e) {
			System.out.println("파일없음");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("파일 읽기 실패");
			e.printStackTrace();
		} finally {
			try {
//				if (foutput != null)
				foutput.close();
			} catch (IOException e) {
				System.out.println("닫음");
				e.printStackTrace();
			}
		}

	}

}
