package org.java.dto;

import java.time.LocalDateTime;
import java.util.Set;

public class BoardDto {

	// 필드는 private
	private int no; // 글 번호
	private String title; // 글 제목
	private String content; // 글 내용
	private String writter; // 글 작성자
	private String nickname; // 닉네임
	private int hit;// 글 조회수
	private LocalDateTime creatTime = LocalDateTime.now(); // 글 등록시간
	private LocalDateTime updateTime = LocalDateTime.now(); // 글 수정시간

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

	@Override // 상속을 통해서 오버라이드 메소드 구현
	public String toString() {

		if (title == null) {
			return "조회할 데이터가 없다.";
		}

		return "BoardDto [no=" + no + ", title=" + title + ", content=" + content + ", writter=" + writter + ", nickname="
				+ nickname + ", hit=" + hit + ", creatTime=" + creatTime + ", updateTime=" + updateTime + "]";
	}

}
