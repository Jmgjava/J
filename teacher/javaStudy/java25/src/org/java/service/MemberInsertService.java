package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.MemberDao;

public class MemberInsertService implements MemberService {

	@Override
	public void executeQueryService() throws IOException, SQLException {

		System.out.println("회원가입");

		Scanner input = new Scanner(System.in);

		System.out.println("아이디");
		String userId = input.next();

		System.out.println("비빌번호");
		String userPw = input.next();

		System.out.println("나이");
		int age = input.nextInt();

		System.out.println("이름");
		String name = input.next();

		// 싱글톤
		MemberDao dao = MemberDao.getInstance();	
		
		// 회원 아이디 유무
		int bool=dao.selectBool(userId);
		
		if(bool==1) {
			System.out.println("이미 존재하는 회원입니다!!");
			return;
		}
		
		// 이미 회원 등록이 되어 있으면 회원가입을 실행 하지 않는다
		int result = dao.insert(userId, userPw, age, name);
		
		if (result!= 1) {
			System.out.println("회원가입 Fail!");
		} else {
			System.out.println("회원가입 Success!");
		}
		
		
//		if (result== 1) {
//			System.out.println("회원가입 Success!");
//		}else if(result==2) {
//			System.out.println("이미 존재 하는 회원입니다!!");			
//		} else {
//			System.out.println("회원가입 Fail!");
//		}
		
		
		
		
		
		
		
		
		
		

	}
}
