package org.java.dto;

public class boardDto {

	Long no; // �� ��ȣ -> �ڵ� 1,2,3,4...
	String title; // �� ����
	String content; // �� ����
	String writer; // �ۼ���
	String nickName; // �г���
	// ���� �ð�, ���� �ð� -> �ڵ����� ���� ����
	public boardDto(Long i, String title, String content, String writer, String nickName) {
		super();
		this.no = i;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.nickName = nickName;
	}

	public boardDto() {
		// TODO Auto-generated constructor stub
	}


	public Long getNo() {
		return no;
	}

	public void setNo(Long no) {
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

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	@Override
	public String toString() {
		return "boardDto [no=" + no + ", title=" + title + ", content=" + content + ", writer=" + writer + ", nickName="
				+ nickName + "]";
	}
}
