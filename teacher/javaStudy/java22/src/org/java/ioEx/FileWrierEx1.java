package org.java.ioEx;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWrierEx1 {

	public static void main(String[] args) {
		System.out.println("FileWriter");
		
		//1. �Է�		
		InputStreamReader iReader= new InputStreamReader(System.in);
		
		//2. ���Ϸ� ���
		FileWriter fWriter=null;//  �ؽ�Ʈ ���Ϸ� ����
		
		String fileName="E:\\saveFiles\\test0125.txt";
//		String fileName="C:\\saveFiles\\test0125.txt";
//		String fileName="C:\\Users\\Administrator\\Desktop\\saveFiles\\test0125.txt";
		
		FileReader fReader=null;
		
		try {
			// �ؽ�Ʈ ���Ϸ� ����
			fWriter=new FileWriter(fileName);
			
			int inData=0;
			//�Է½� -1 ->ctr+z, ������ �о�帱 �� -1-> ������ ��
			while((inData=iReader.read() ) !=-1) {
				fWriter.write(inData);
			}
			
			// ���� �ҷ�����
			fReader=new FileReader(fileName);
			
			int inData2 = 0;
			// ������ �� -1
			while ((inData2 = fReader.read()) != -1) {

				System.out.print((char)inData2);
			}

			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				iReader.close();
				fWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
}
