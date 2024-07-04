package ch14.collection.list;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class ArrayListExam {

	public static void main(String[] args) {
		// list 컬렉션은 ArrayList, Vector, LinkedList 3가지를 주로 사용한다.
		// list 컬렉션은 배열 대신 활용도가 높다. (배열 길이가 자유롭다.)
		// list<String> -> 강한 타입 체크로 String 만 들어간다.
		// List <String> list = new ArrayList<String>(); -> 10개가 기본값
		
		List<String> listS = new ArrayList<String>();
		
		listS.add("JAVA"); // [0] 번 인덱스
		listS.add("Oracle"); // 1번 데이터베이스
		listS.add("JDBC"); // 2번 java + DB 연동
		listS.add("HTML, CSS, JS"); // 프론트
		listS.add("JSP"); // java + DB + 프론트
		listS.add("tomcat"); // 서버프로그래밍 (servlet)
		listS.add("리눅스"); // 배포 서버
		listS.add(5, "servlet"); // jsp+java
		listS.add("AWS"); // 가상배포서버
		
		int size = listS.size();
		System.out.println("총 객체수 : "+size);
		
		System.out.println("__________________________________");
		
		String skill = listS.get(2); // 2번 인덱스 값을 가져와 skill 변수에 넣음
		System.out.println("2번째 인덱스 값 : "+skill);
		
		listS.remove(2);
		listS.remove(2);
		listS.remove("JSP");
		
		System.out.println("_____________for_전체출력______________");
		for(int i=0; i<listS.size(); i++) {
			System.out.println(i+"번째 값 : "+listS.get(i));
		}
		
		
		
		System.out.println("_________for_each_전체출력(index X)__________");
		for(String str : listS) {
			System.out.println(str);
		}
		
		
		

	}

}
