package org.java.dto;

public class ShopDto {

	private int no;
	private String tile;
	private String detail;
	private String writer;
	private int isFile;

	public ShopDto() {
		// TODO Auto-generated constructor stub
	}

	public ShopDto(int no, String tile, String detail, String writer, int isFile) {
		super();
		this.no = no;
		this.tile = tile;
		this.detail = detail;
		this.writer = writer;
		this.isFile = isFile;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTile() {
		return tile;
	}

	public void setTile(String tile) {
		this.tile = tile;
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

	public int getIsFile() {
		return isFile;
	}

	public void setIsFile(int isFile) {
		this.isFile = isFile;
	}

	@Override
	public String toString() {
		return "ShopDto [no=" + no + ", tile=" + tile + ", detail=" + detail + ", writer=" + writer + ", isFile="
				+ isFile + "]";
	}

}
