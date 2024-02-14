package org.java.conditionEx;

import java.util.Scanner;

public class if_ex3 {

	public static void main(String[] args) {
		System.out.println("학점");

		/*
		 *** 계산기
		 *** 
		 * 학점 관리 프로그램 국어, 영어, 수학의 평균이 95이상이면 “S”를 콘솔에 출력
		 * 
		 * 국어, 영어, 수학의 평균이 90이상이면 “A”를 콘솔에 출력
		 * 
		 * 국어, 영어, 수학의 평균이 85이상이면 “B+”를 콘솔에 출력
		 * 
		 * 국어, 영어, 수학의 평균이 80이상이면 “B”를 콘솔에 출력
		 * 
		 * 국어, 영어, 수학의 평균이 75이상이면 “C+”를 콘솔에 출력
		 * 
		 * 국어, 영어, 수학의 평균이 70이상이면 “C”를 콘솔에 출력
		 * 
		 * 국어, 영어, 수학의 평균이 65이상이면 “D+”를 콘솔에 출력
		 * 
		 * 국어, 영어, 수학의 평균이 60이상이면 “D”를 콘솔에 출력
		 * 
		 * 국어, 영어, 수학의 평균이 60미만이면 “F”를 콘솔에 출력
		 * 
		 * 국어, 영어, 수학 점수를 각각 입력 받아서 평균을 계산
		 */

		Scanner scn = new Scanner(System.in);

		System.out.println("국어: ");
		int Kor = scn.nextInt();

		System.out.println("영어: ");
		int Eng = scn.nextInt();

		System.out.println("수학: ");
		int Math = scn.nextInt();

		int sum = Kor + Eng + Math;

		int sub = 3;

		double avg = (double) sum / sub;

		if (avg >= 90) {
			if (avg >= 95) {
				System.out.println(avg + " S");
			} else {
				System.out.println(avg + " A");
			}
		} else if (avg >= 80) {
			if (avg >= 85) {
				System.out.println(avg + " B+");
			} else {
				System.out.println(avg + " B");
			}
		} else if (avg >= 70) {
			if (avg >= 75) {
				System.out.println(avg + " C+");
			} else {
				System.out.println(avg + " C");
			}
		} else if (avg >= 60) {
			if (avg >= 65) {
				System.out.println(avg + " D+");
			} else {
				System.out.println(avg + " D");
			}
		} else {
			System.out.println(avg + " F");
		}

		scn.close();

	}

}
