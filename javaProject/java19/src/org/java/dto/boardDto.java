package org.java.dto;

public class boardDto {

	Long no; // 글 번호 -> 자동 1,2,3,4...
	String title; // 글 제목
	String content; // 글 내용
	String writer; // 작성자
	String nickName; // 닉네임
	// 생성 시간, 수정 시간 -> 자동으로 설정 가능
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
