package org.web.dto;

public class BoardDto {

	private int no;
	private String btitle;
	private String bcontent;
	private String userId;

	public BoardDto() {
		// TODO Auto-generated constructor stub
	}

	public BoardDto(int no, String btitle, String bcontent, String userId) {
		super();
		this.no = no;
		this.btitle = btitle;
		this.bcontent = bcontent;
		this.userId = userId;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getBtitle() {
		return btitle;
	}

	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}

	public String getBcontent() {
		return bcontent;
	}

	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "BoardDto [no=" + no + ", btitle=" + btitle + ", bcontent=" + bcontent + ", userId=" + userId + "]";
	}

}
