package org.java.ioEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ioEx2 {

	public static void main(String[] args) {
		System.out.println("IO2");
		// 문자
		InputStreamReader inputReader = null;

		try {
			System.out.println("이름을 입력 하세요: ");
			inputReader = new InputStreamReader(System.in);

			BufferedReader reader = new BufferedReader(inputReader);

			String name = reader.readLine();

			System.out.println("이름: " + name);

			// 국어, 영어, 수학 점수 입력 -> 총점, 평균 출력

			System.out.println("국어점수: ");
			String kor = reader.readLine();
			System.out.println("영어점수: ");
			String eng = reader.readLine();
			System.out.println("수학점수: ");
			String math = reader.readLine();

			int sum = Integer.parseInt(kor) + Integer.parseInt(eng) + Integer.parseInt(math); // String -> int
//			String sum = (kor+eng+math);

			double avg = (double) sum / 3;

			String.format("%.2f", avg); // 소수 2째 자리

			System.out.println("총점: " + sum + " 평균: " + String.format("%.2f", avg));

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				inputReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
