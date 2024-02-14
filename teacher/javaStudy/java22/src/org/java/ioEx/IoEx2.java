package org.java.ioEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IoEx2 {

	public static void main(String[] args) {
		System.out.println("IO");
		
		//문자 입력		
		
		InputStreamReader inputReader=null; // 반드시 close()
		
		try {
			System.out.println("이름을 입력 하세요: ");
			
			inputReader=new InputStreamReader(System.in);			
			BufferedReader bReader=new BufferedReader(inputReader);
			
			String name=bReader.readLine();			
			System.out.println("이름: "+name);
			
			// 국어, 영어, 수학 점수 입력 -> 총점 , 평균 출력
			
			System.out.println("국어점수 입력: ");
			String kor=bReader.readLine();			
			System.out.println("영어점수 입력: ");
			String eng=bReader.readLine();			
			System.out.println("수학점수 입력: ");
			String math=bReader.readLine();			
			
			// 국어(String) -> int
			int sum=Integer.parseInt(kor)+Integer.parseInt(eng)+Integer.parseInt(math); 
			
			double avg=(double)sum/3;
			
			String.format("%.2f", avg);// 소수 2째자리
			
			System.out.println("총점: "+sum+", 평균: "+String.format("%.2f", avg));// 평균 소수 2째자리
			
			
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
