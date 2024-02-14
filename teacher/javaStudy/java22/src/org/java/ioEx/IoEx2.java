package org.java.ioEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IoEx2 {

	public static void main(String[] args) {
		System.out.println("IO");
		
		//���� �Է�		
		
		InputStreamReader inputReader=null; // �ݵ�� close()
		
		try {
			System.out.println("�̸��� �Է� �ϼ���: ");
			
			inputReader=new InputStreamReader(System.in);			
			BufferedReader bReader=new BufferedReader(inputReader);
			
			String name=bReader.readLine();			
			System.out.println("�̸�: "+name);
			
			// ����, ����, ���� ���� �Է� -> ���� , ��� ���
			
			System.out.println("�������� �Է�: ");
			String kor=bReader.readLine();			
			System.out.println("�������� �Է�: ");
			String eng=bReader.readLine();			
			System.out.println("�������� �Է�: ");
			String math=bReader.readLine();			
			
			// ����(String) -> int
			int sum=Integer.parseInt(kor)+Integer.parseInt(eng)+Integer.parseInt(math); 
			
			double avg=(double)sum/3;
			
			String.format("%.2f", avg);// �Ҽ� 2°�ڸ�
			
			System.out.println("����: "+sum+", ���: "+String.format("%.2f", avg));// ��� �Ҽ� 2°�ڸ�
			
			
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
