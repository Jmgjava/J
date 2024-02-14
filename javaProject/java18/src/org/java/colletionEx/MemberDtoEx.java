package org.java.colletionEx;

public class MemberDtoEx {

	private int no;
	private String Id;
	private String Pw;
	private String name;
	private int age;

	public MemberDtoEx() {
		// TODO Auto-generated constructor stub
	}

	public MemberDtoEx(int no, String id, String pw, String name, int age) {
		super();
		this.no = no;
		Id = id;
		Pw = pw;
		this.name = name;
		this.age = age;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "MemberDtoEx [no=" + no + ", Id=" + Id + ", Pw=" + Pw + ", name=" + name + ", age=" + age + "]";
	}

}
