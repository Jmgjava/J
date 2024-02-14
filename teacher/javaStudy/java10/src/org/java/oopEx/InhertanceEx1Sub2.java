package org.java.oopEx;

import org.java.inheritanceEx.InhertanceEx1;

public class InhertanceEx1Sub2 extends InhertanceEx1{

	public static void main(String[] args) {
		
		InhertanceEx1Sub2 i1= new InhertanceEx1Sub2();
	
		i1.num3=10;// 상속-> protected 접근 가능,다른 패키지
	}
}
