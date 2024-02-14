package org.java.oopEx;

import org.java.inheritanceEx.InheritanceEx1;

public class InheritanceEx1sub2 extends InheritanceEx1 {

	public static void main(String[] args) {
		InheritanceEx1sub2 i1 = new InheritanceEx1sub2();
		
		i1.num3=10; // 상속-> protected 접근 가능, 다른 패키지
	}

}
