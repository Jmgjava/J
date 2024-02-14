package org.java.dto;

public class BoardEntity {

	Long no;// 글번호 -> 자동 1,2,3,4,5
	String title;// 글제목
	String cotent;// 글내용
	String writer;// 작성자
	String nickName;// 닉네임
	// 생성시간, 수정시간 -> 필수 -> 자동으로 설정 가능

	public BoardEntity() {
	}

	public BoardEntity(Long no, String title, String cotent, String writer, String nickName) {
		super();
		this.no = no;
		this.title = title;
		this.cotent = cotent;
		this.writer = writer;
		this.nickName = nickName;
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

	public String getCotent() {
		return cotent;
	}

	public void setCotent(String cotent) {
		this.cotent = cotent;
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
		return "BoardDto [no=" + no + ", title=" + title + ", cotent=" + cotent + ", writer=" + writer + ", nickName="
				+ nickName + "]";
	}

	// BoardDto -> BoardEntity 변환
	public static BoardEntity toBoardEntity(BoardDto boardDto) {

		BoardEntity boardEntity = new BoardEntity();

		boardEntity.setNo(boardDto.getNo());
		boardEntity.setTitle(boardDto.getTitle());
		boardEntity.setCotent(boardDto.getCotent());
		boardEntity.setNickName(boardDto.getNickName());

		return boardEntity;
	}

}
