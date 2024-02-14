package org.java.inheritanceEx;

import org.java.role.Role;

public class Sub3 extends Parent{

	public Role role;
//	public Sub3() {
//		super();
//	}
	
	@Override
	public void memberShip() {
		System.out.println("직원관리");
	}
}
