package org.java.collectionEx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
//
//class M1{
//	
//}

public class ListEx {

	public static void main(String[] args) {
		System.out.println("List<E>");

		new Vector<Integer>();
		new ArrayList<Integer>();
		new LinkedList<Integer>();

		ArrayList<Integer> arrList1 = new ArrayList<Integer>();
		// 다형성(PolyMolpysim)
		List<Integer> arrList2 = new ArrayList<Integer>();
		arrList1.add(new Integer(10));
		arrList1.add(new Integer(20));
		arrList1.add(new Integer(30));
		arrList1.add(new Integer(40));
		arrList1.add(new Integer(50));
		// (요소타입 변수: 컬렉션)
		for (Integer el : arrList1) {
			System.out.println(el);// 0번지 ~
		}
		//
		Iterator<Integer> iterator = arrList1.iterator();
		while (iterator.hasNext()) {
			Integer el = iterator.next();
			System.out.println(el);
		}

	}
}
