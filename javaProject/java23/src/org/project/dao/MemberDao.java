package org.project.dao;

import org.project.dto.MemberDto;

public class MemberDao {

	// �̱��� ���� -> "��ü�� �ѹ��� ����"
	// 1. ������ private
	// 2. INSTANCE �ѹ��� ���� -> �ѹ��� ��ü�� ����
	// 3. �ܺ� static MemberDao getInstance() -> �ѹ��� ����
	private static final MemberDao INSTANCE = new MemberDao();

	private MemberDao() {
		System.out.println("DAO");
	}

	public static MemberDao getInstance() {
		return MemberDao.INSTANCE;
	}

	/////////////////////////////////////////////////////////////////////
	// C reat ȸ������
	public int insert() {
		return 0;
	}

	// R ead ȸ����ȸ
	public MemberDto select() {
		MemberDto dto = null;

		return dto;
	}

	// U pdate ȸ������
	public int update() {
		return 0;
	}

	// D elete ȸ������
	public int delete() {
		return 0;
	}
}
