package org.java.service;

import java.util.Scanner;

import org.java.dao.MemberDao;

public class MemberInsert extends MemberService {

	public int d;

	@Override
	public void excuteQueryService() {
		
		System.out.println("ȸ������");
		
//		//DB-> ȸ�������� �Է� �޾Ƽ� �����ͺ��̽� ���� -> DAO
//		MemberDao dao=new MemberDao();
//		
//		Scanner input= new Scanner(System.in);
//		
//		System.out.print("ȸ����ȣ: ");		
//		int no=input.nextInt();//ȸ����ȣ
//		
//		System.out.print("ȸ�����̵�: ");		
//		String userId=input.next();//ȸ�����̵�
//		
//		System.out.print("ȸ�������ȣ: ");		
//		String userPw=input.next();//ȸ�������ȣ
//		
//		System.out.print("ȸ���̸�: ");		
//		String name=input.next();//ȸ���̸�
//		
//		System.out.print("��ȭ��ȣ: ");		
//		String phone=input.next();//��ȭ��ȣ	
//		
//		// ��ȯ���� 1�̸� ȸ������ ����, 1�̾ƴϸ� ȸ������ ����
//		int result=dao.insert(no, userId,userPw,name,phone);
//		
//		 if(result==1) {
//			 System.out.println("ȸ������ ����");
//		 }else {
//			 System.out.println("ȸ������ ����");			 
//		 }
	}

}
