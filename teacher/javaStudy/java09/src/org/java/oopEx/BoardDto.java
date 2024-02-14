package org.java.oopEx;

import java.time.LocalDateTime;

public class BoardDto {

	private int no; // 글번호
	private String title;// 글제목
	private String content;// 글내용
	private String writer;// 작성자
	private String nickName;// 닉네임
	private int hit;// 조회수
	// 작성시간,수정시간은 자동으로 spring에서 설정
	private LocalDateTime creatTime = LocalDateTime.now();// 작성시간
	private LocalDateTime updateTime = LocalDateTime.now();// 수정시간

	// NoArgsContstruct -> 기본생성자
	public BoardDto() {
		System.out.println("기본생성자");
	}

	// AllArgsContstruct -> 모든 맴버(필드)가 매개인자로 설정된 생성자
	public BoardDto(int no, String title, String content, String writer, String nickName, int hit,
			LocalDateTime creatTime, LocalDateTime updateTime) {
		super();
		this.no = no;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.nickName = nickName;
		this.hit = hit;
		this.creatTime = creatTime;
		this.updateTime = updateTime;
	}

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

	public LocalDateTime getCreatTime() {
		return creatTime;
	}

	public void setCreatTime(LocalDateTime creatTime) {
		this.creatTime = creatTime;
	}

	public LocalDateTime getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(LocalDateTime updateTime) {
		this.updateTime = updateTime;
	}

	@Override
	public String toString() {
		return "BoardDto [no=" + no + ", title=" + title + ", content=" + content + ", writer=" + writer + ", nickName="
				+ nickName + ", hit=" + hit + ", creatTime=" + creatTime + ", updateTime=" + updateTime + "]";
	}

}
