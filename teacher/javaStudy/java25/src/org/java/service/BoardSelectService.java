package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import org.java.dao.BoardDao;
import org.java.dao.MemberDao;
import org.java.dto.BoardDto;
import org.java.dto.MemberDto;

public class BoardSelectService implements BoardSeriver {

	@Override
	public void executeQueryService() throws IOException, SQLException {

		System.out.println("�Խñ���ȸ(���)");

		BoardDao dao = BoardDao.getInstance();
		List<BoardDto> boards = dao.select();

		if (boards.isEmpty()) {
			System.out.println("��ȸ�� �Խñ۸���� �����ϴ�.");
		} else {
			for (BoardDto board : boards) {
				System.out.print("�۹�ȣ: " + board.getNo());
				System.out.print(", ����: " + board.getTitle());
				System.out.print(", ����: " + board.getContent());
				System.out.print(", �ۼ���: " + board.getWriter());
				System.out.println(", �г���: " + board.getNickName());
			}
		}

	}
}
