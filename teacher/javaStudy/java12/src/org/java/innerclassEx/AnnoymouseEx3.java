package org.java.innerclassEx;

interface MemberImpl {
	void select();

	int update();

	int delete();

	int insert();

	void login();

	int idChecked();
}

// 구현 매서드가 여러개일 경우 구현 객체 이용 권장
class MemberImplClass implements MemberImpl {

	@Override
	public void select() {
		// TODO Auto-generated method stub

	}

	@Override
	public int update() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void login() {
		// TODO Auto-generated method stub

	}

	@Override
	public int idChecked() {
		// TODO Auto-generated method stub
		return 0;
	}

}

interface I1 {
	void m1();
}

public class AnnoymouseEx3 {

	public static void main(String[] args) {

		MemberImpl m1 = new MemberImplClass();
		m1.insert();

		new I1() {
			@Override
			public void m1() {
				System.out.println("익명(무명)클래스 구현");
			}
		}.m1();

	}
}
