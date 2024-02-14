package org.java.colletionEx;

public class MemberDto {

	private String Id;
	private String Pw;

	public MemberDto() {
		// TODO Auto-generated constructor stub
	}

	public MemberDto(String id, String pw) {
		super();
		Id = id;
		Pw = pw;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getPw() {
		return Pw;
	}

	public void setPw(String pw) {
		Pw = pw;
	}

	@Override
	public String toString() {
		return "MemberDto [Id=" + Id + ", Pw=" + Pw + "]";
	}

}
