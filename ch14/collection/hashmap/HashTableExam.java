package ch14.collection.hashmap;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableExam {

	public static void main(String[] args) {
		// 키보드로 입력받은 아이디와 패스워드를 이용한 로그인 성공 테스트

		Map<String, String> login = new Hashtable<String, String>();
		login.put("kkk1", "12341");
		login.put("kkk2", "12342");
		login.put("kkk3", "12343");
		login.put("kkk4", "12344");
		login.put("kkk5", "12345"); // id, pw

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("아이디 입력 >> ");
			String id = scanner.next();
			System.out.print("패스워드 입력 >> ");
			String pw = scanner.next();

			if (login.containsKey(id)) { // 테이블에 K 가 ID와 같은 것을 찾음
				if (login.get(id).equals(pw)) { // ID 와 PW 같은 것을 찾음
					System.out.println("로그인 성공");
					break;

				}else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				} // 패스워드 일치 if 문
			}else {
				System.out.println("입력된 아이디가 없습니다.");
			}// id 일치 if 문 종료
		}

	}

}
