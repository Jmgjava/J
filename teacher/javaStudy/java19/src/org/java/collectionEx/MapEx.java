package org.java.collectionEx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapEx {

	public static void main(String[] args) {
		
		System.out.println("Map<K,V>");
		//카는 중복 허용X
		// ajax, json	
		List<String> board1=new ArrayList<String>();
		board1.add("일반게시글1");		board1.add("일반게시글2");
		board1.add("일반게시글3");		board1.add("일반게시글4");
		board1.add("일반게시글5");		System.out.println(board1);
		
		List<String> board2=new ArrayList<String>();
		board2.add("비밀게시글1");		board2.add("비밀게시글2");
		board2.add("비밀게시글3");		board2.add("비밀게시글4");
		board2.add("비밀게시글5");		System.out.println(board2);
		System.out.println();		
		
		Map<String, List<String>> boardMap=new HashMap<String, List<String>>();
	 
		boardMap.put("일반게시판",board1 );
		boardMap.put("비밀게시판",board2 );
		
		System.out.println(boardMap);
		
		// keySet이용해서 board1, board2의 게시글 모두 콘솔에 출력 
		Set<String> boardKeys=boardMap.keySet();
		Iterator<String> iterator2=boardKeys.iterator();
		
		while(iterator2.hasNext()) {
		
			String key=iterator2.next();
			
			List<String> boardLists=boardMap.get(key);			
			
			for(String el: boardLists) {
				System.out.println(el);
			}			
			
			System.out.println();
		}
		
		System.out.println();
		
		// 기본
		Map<Integer, String> basicMap=new HashMap<Integer, String>();
		basicMap.put(1, "객체1");
		basicMap.put(2, "객체2");
		basicMap.put(3, "객체3");
		basicMap.put(4, "객체4");
		basicMap.put(5, "객체5");
		System.out.println(basicMap);
		
		Set<Integer> set= basicMap.keySet(); // 키값을 Set
		Iterator<Integer> iterator=set.iterator();
		while(iterator.hasNext()) {
			Integer key=iterator.next();	
			//키(Key)에 해당하는 값(Value)을 추출
			System.out.println(basicMap.get(key));
		}
		
		
		
		
	}
}
