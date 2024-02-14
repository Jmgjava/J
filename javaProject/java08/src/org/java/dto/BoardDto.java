package org.java.dto;

import java.time.LocalDateTime;
import java.util.Set;

public class BoardDto {

	// �ʵ�� private
	private int no; // �� ��ȣ
	private String title; // �� ����
	private String content; // �� ����
	private String writter; // �� �ۼ���
	private String nickname; // �г���
	private int hit;// �� ��ȸ��
	private LocalDateTime creatTime = LocalDateTime.now(); // �� ��Ͻð�
	private LocalDateTime updateTime = LocalDateTime.now(); // �� �����ð�

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWritter() {
		return writter;
	}

	public void setWritter(String writter) {
		this.writter = writter;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	@Override // ����� ���ؼ� �������̵� �޼ҵ� ����
	public String toString() {

		if (title == null) {
			return "��ȸ�� �����Ͱ� ����.";
		}

		return "BoardDto [no=" + no + ", title=" + title + ", content=" + content + ", writter=" + writter + ", nickname="
				+ nickname + ", hit=" + hit + ", creatTime=" + creatTime + ", updateTime=" + updateTime + "]";
	}

}
