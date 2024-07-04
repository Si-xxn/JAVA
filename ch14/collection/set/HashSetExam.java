package ch14.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetExam {

	public static void main(String[] args) {
		// Set 인터페이스에는 HashSet, LinkedHashSet, TreeSet 등 있다.
		// Set - 중복되지 않는 인덱스가 없는 객체를 담아 놓은 구슬주머니.
		
		Set<String> setHashSet = new HashSet<String>();
		Set<String> setLinkedHashSet = new LinkedHashSet<String>();
		Set<String> setTreeSet = new TreeSet<String>();
		// set 인터페이스 사용으로 메서드는 같다. 
		
		
		setHashSet.add("Java");
		setHashSet.add("Oracle");
		setHashSet.add("JDBC");
		setHashSet.add("HTML");
		setHashSet.add("CSS");
		setHashSet.add("JavaScript");
		setHashSet.add("JDBC");
		// 중복 처리안됨 -> 객체수 반환에 포함안된다.
		
		int size = setHashSet.size(); // 객체수 반환
		System.out.println("set 객체수 : "+size);
		int i = 0;
		System.out.println("-------- 인덱스가 없어서 for 반복문으로 전체출력 안됨 --------");
		
		Iterator<String> iterator = setHashSet.iterator(); // 반복자 타입에 set 타입 연결
		while(iterator.hasNext()) { // .hasNext() 다음 객체가 있으면 True, 없으면 False
			String element = iterator.next(); // 가져온 값(.next()) element 변수에 넣는다.
			
			
			System.out.println(++i +"객체 : "+element);
		}
		
		System.out.println("-------- 인덱스가 없어서 for-each로 전체 출력 --------");
		
		setHashSet.remove("CSS");
		
		for(String entity : setHashSet) {
			System.out.println(++i +"객체 : "+entity);
		}
	}

}
