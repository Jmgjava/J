package org.java.dto;

public class ShopDto {

	private int no;
	private String title;
	private String detail;
	private String writer;
	private int isfile;
	
	public ShopDto() {
		// TODO Auto-generated constructor stub
	}

	public ShopDto(int no, String title, String detail, String writer, int isfile) {
		super();
		this.no = no;
		this.title = title;
		this.detail = detail;
		this.writer = writer;
		this.isfile = isfile;
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

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getIsfile() {
		return isfile;
	}

	public void setIsfile(int isfile) {
		this.isfile = isfile;
	}

	@Override
	public String toString() {
		return "ShopDto [no=" + no + ", title=" + title + ", detail=" + detail + ", writer=" + writer + ", isfile="
				+ isfile + "]";
	}

}
