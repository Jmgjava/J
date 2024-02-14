package org.java.collectionEx;

import java.util.HashSet;
import java.util.Set;

public class SetEx {

	public static void main(String[] args) {
		System.out.println("Set"); //주머니,중복 불가능, 순서가 X
		
		 Set<Integer> set=new HashSet<Integer>();
		 set.add(10);
		 set.add(20);
		 set.add(30);
		 set.add(40);
		 set.add(50);
		 set.add(50); // 중복 허용X		 
		 System.out.println(set.size());	
		 
		 for(Integer el: set) {
			 System.out.println(el);
		 }
		
		
	}
}
