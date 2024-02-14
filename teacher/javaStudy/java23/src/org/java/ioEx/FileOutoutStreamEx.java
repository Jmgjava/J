package org.java.ioEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutoutStreamEx {

	public static void main(String[] args) {
		System.out.println("IO");
		// ����(�ؽ�Ʈ+����)�� �����Ѵ�.(���ϸ����)

		FileOutputStream outputStream = null;
//		String fileName = "C:\\test1.out";
		String fileName = "E:\\saveFiles\\test1.out";
		
		FileInputStream fiStream = null;

		try {
			//// ���� ���� ////
			// �Է��� �޾Ƽ� ������ ��Ų��. -> write() ->
			outputStream = new FileOutputStream(fileName);
			// 10~1���ڸ� ���� -> outputStream
			for (int i = 0; i < 10; i++) {
				int num = 10 - i;// 10 9 8 7,,,,1
				System.out.println(num+" <<-");
				outputStream.write(num);
			}
			//// ���� ���� ////
			
			// ���� �о�帰��.
			fiStream=new FileInputStream(fileName);			
			int inData = 0;
			// ������ �����͸� �ϳ��� -> ������ ������ -1
			while ((inData = fiStream.read()) != -1) {
				// �ϳ��� ��� -> ����, ���� ����
				System.out.print((char) inData);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("���� NO");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("���� ����� Fail!");
			e.printStackTrace();
		} finally {
			try {
				outputStream.close();
				fiStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}
}
