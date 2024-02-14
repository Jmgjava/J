package org.java.dto;

import java.time.LocalDateTime;

public class BoardDto {

	// 필드는 private
	private int no;// 게시글 번호
	private String title;// 글제목
	private String content;// 글내용
	private String writer;// 글작성
	private String nickName;// 닉네임
	private int hit;// 조회수
	private LocalDateTime createTime = LocalDateTime.now();// 글등록시간
	private LocalDateTime updateTime = LocalDateTime.now();// 글수정시간

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

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	@Override // 상속을 통해서 오버라이딩 매서드 구현
	public String toString() {
		
		if(title==null) {
			return "조회 할 데이터가 없다";
		}
		
		return "BoardDto [no=" + no + ", title=" + title + ", content=" + content + ", writer=" + writer + ", nickName="
				+ nickName + ", hit=" + hit + ", createTime=" + createTime + ", updateTime=" + updateTime + "]";
	}

	
}
