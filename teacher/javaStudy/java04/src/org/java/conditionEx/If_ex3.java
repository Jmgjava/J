package org.java.conditionEx;

import java.util.Scanner;

public class If_ex3 {

	public static void main(String[] args) {
		System.out.println("if");

//		국어,영어,수학의 평균이 90이상이면 "A"를 콘솔에 출력
//		국어,영어,수학의 평균이 80이상이면 "B"를 콘솔에 출력
//		국어,영어,수학의 평균이 70이상이면 "C"를 콘솔에 출력
//		국어,영어,수학의 평균이 60이상이면 "D"를 콘솔에 출력
//		국어,영어,수학의 평균이 60미만이면 "F"를 콘솔에 출력
//		국어,영어, 수학 점수를 각각 입력 받아서 평균 계산

		Scanner scn = new Scanner(System.in);

		System.out.print("국어점수: ");
		int kor = scn.nextInt();

		System.out.print("영어점수: ");
		int eng = scn.nextInt();

		System.out.print("수학점수: ");
		int math = scn.nextInt();
		// 총합계
		int sum = kor + eng + math;
		// 과목수
		int subject = 3;

		// 평균
		double avg = (double) sum / subject;

		System.out.println("총합계: " + sum + ", 과목수: " + subject + ", 평균: " + avg);

		if (avg >= 90) {
			if (avg >= 95) {
				System.out.println("A+");
			} else {
				System.out.println("A");
			}
		} else if (avg >= 80) {
			if (avg >= 85) {
				System.out.println("B+");
			} else {
				System.out.println("B");
			}
		} else if (avg >= 70) {
			if (avg >= 75) {
				System.out.println("C+");
			} else {
				System.out.println("C");
			}
		} else if (avg >= 60) {
			if (avg >= 65) {
				System.out.println("D+");
			} else {
				System.out.println("D");
			}
		} else {
			System.out.println("F");
		}

		scn.close();

	}
}
