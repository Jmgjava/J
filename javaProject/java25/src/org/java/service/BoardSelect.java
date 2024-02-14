package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import org.java.dao.BoardDao;
import org.java.dao.MemberDao;
import org.java.dto.BoardDto;
import org.java.dto.MemberDto;

public class BoardSelect implements BoardService {

	@Override
	public void executeQueryService() throws IOException, SQLException {
		System.out.println("�Խñ� ��ȸ");

		BoardDao dao = BoardDao.getInstance();

		List<BoardDto> result = dao.bselect();

		if (result.isEmpty()) {
			System.out.println("��ȸ�� ���X");
		} else {
			for (BoardDto results : result) {
				System.out.print("�� ��ȣ: " + results.getNo() + " ");
				System.out.print("�� ����: " + results.getTitle() + " ");
				System.out.print("�� ����: " + results.getContent() + " ");
				System.out.print("�� �ۼ���: " + results.getWriter() + " ");
				System.out.print("�� �г���: " + results.getNickName() + " ");
				System.out.println();
			}
		}

	}

}
