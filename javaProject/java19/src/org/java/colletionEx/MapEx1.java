package org.java.colletionEx;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx1 {

	public static void main(String[] args) {

		System.out.println("Map");

		Map<Integer, String> map1 = new HashMap<Integer, String>();

		// put() -> 추가
		map1.put(1, "Java");
//		map1.put(2, "Java"); // value는 중복허용		
//		map1.put(1, "Oracle"); // key는 중복되면 X
		map1.put(2, "Oracle");
		map1.put(3, "mysql");
		map1.put(4, "servlet");
		map1.put(5, "jsp");
		System.out.println(map1);

		System.out.println();
		// get() -> 조회
		System.out.println(map1.get(1)); // get(key) -> 키값으로 조회

		// key -> 별도의 KeySet() -> 저장
		Set<Integer> set1 = map1.keySet();
		Iterator<Integer> iter1 = set1.iterator(); // KeySet -> iterator
		while (iter1.hasNext()) {
			Integer i = iter1.next();
			System.out.println("Key: " + i + "\nvalue: " + map1.get(i));
		}

	}
}
