package org.java.collectionEx;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx {

	public static void main(String[] args) {
		System.out.println("Set");

		Set<String> set1 = new HashSet<String>();

		set1.add("s1");
		set1.add("s2");
		set1.add("s3");
		set1.add("s4");
		set1.add("s5");

		System.out.println(set1);
		System.out.println(set1.size());

		for (String str : set1) {
			System.out.println(str);
		}

		System.out.println();

		Iterator<String> iter = set1.iterator();
		while (iter.hasNext()) {
			String str = iter.next();
			System.out.println(str);
		}

	}
}
