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
		//ī�� �ߺ� ���X
		// ajax, json	
		List<String> board1=new ArrayList<String>();
		board1.add("�ϹݰԽñ�1");		board1.add("�ϹݰԽñ�2");
		board1.add("�ϹݰԽñ�3");		board1.add("�ϹݰԽñ�4");
		board1.add("�ϹݰԽñ�5");		System.out.println(board1);
		
		List<String> board2=new ArrayList<String>();
		board2.add("��аԽñ�1");		board2.add("��аԽñ�2");
		board2.add("��аԽñ�3");		board2.add("��аԽñ�4");
		board2.add("��аԽñ�5");		System.out.println(board2);
		System.out.println();		
		
		Map<String, List<String>> boardMap=new HashMap<String, List<String>>();
	 
		boardMap.put("�ϹݰԽ���",board1 );
		boardMap.put("��аԽ���",board2 );
		
		System.out.println(boardMap);
		
		// keySet�̿��ؼ� board1, board2�� �Խñ� ��� �ֿܼ� ��� 
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
		
		// �⺻
		Map<Integer, String> basicMap=new HashMap<Integer, String>();
		basicMap.put(1, "��ü1");
		basicMap.put(2, "��ü2");
		basicMap.put(3, "��ü3");
		basicMap.put(4, "��ü4");
		basicMap.put(5, "��ü5");
		System.out.println(basicMap);
		
		Set<Integer> set= basicMap.keySet(); // Ű���� Set
		Iterator<Integer> iterator=set.iterator();
		while(iterator.hasNext()) {
			Integer key=iterator.next();	
			//Ű(Key)�� �ش��ϴ� ��(Value)�� ����
			System.out.println(basicMap.get(key));
		}
		
		
		
		
	}
}
