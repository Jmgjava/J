package org.java.memberservice;

import java.io.IOException;
import java.sql.SQLException;

import org.java.memberdao.MemberDao;

public class MemberDeleteService implements MemberService {

	@Override
	public void excuteQueryService() throws SQLException, IOException {
		System.out.println("회원삭제");

		// DAO
		MemberDao dao = new MemberDao();
		int result = dao.delete();

		if (result != 1) {
			System.out.println("삭제 실패");
		} else {
			System.out.println("삭제 성공");
		}
	}
}
