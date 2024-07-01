package ch04;

import java.util.Scanner;

public class SSNExam2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in); // 키보드로 입력 받는 객체 생성
		
		System.out.print("주민등록번호를 입력하세요.( -생략 ) : ");
		String ssn = sc.next(); // 웹에서 넘어오는건 거의 다 문자처리 -> String 타입 사용
		
		char ssn2 = ssn.charAt(6); // 성별 확인 추출
		int n1 = Character.getNumericValue(ssn2); // Character.getNumericValue -> 문자로된 숫자를 int타입으로 변경
		
		if (n1%2 == 0) { // 변수값에 2를 나눴을 때 나머지가 0인경우 -> 여자
			System.out.println("여자");
		}
		else if (n1%2 == 1) { // 변수값에 2를 나눴을 때 나머지가 1인경우 -> 남자
			System.out.println("남자");
		} else {// 위 조건 외의 경우
			System.out.println("다시 작성해주세요.");
		}// 성별 if 조건문 종료
		
		int year = Integer.parseInt(ssn.substring(0, 2)); // 태어난 월 추출
		// Integer.parasInt -> 문자열을 숫자열로 변환
		
		if (n1 == 1 || n1 == 2 || n1 == 5 || n1 == 6) {
			System.out.println("나이는 " + (2024 - (1900 + year)) + "입니다.");
		}else if (n1 == 3 || n1 == 4 || n1 == 7 || n1 == 8) {
			System.out.println("나이는 " + (2024 - (2000 + year))+ "입니다.");
			
		}else {
			System.out.println("다시 작성해주세요.");
		}
		
		int month = Integer.parseInt(ssn.substring(2, 4)); // 태어난 달 추출
		
		if (month <= 0 || month >= 13) { // 추출한 숫자가 0보다 작거나 같은 경우 또는 13보다 크거나 같은 경우 다시 작성
			System.out.println("다시 작성해주세요.");
		}else if (month >=3 && month <=5) { // 3보다 크거나 같은 경우 또는 5보다 작거나 같은 경우
			System.out.println("봄에 태어났습니다.");
		}else if (month >=6 && month <=8) { // 6보다 크거나 같은 경우 또는 8보다 작거나 같은 경우
			System.out.println("여름에 태어났습니다.");
		}else if (month >=9 && month <=11) { // 9보다 크거나 같은 경우 또는 11보다 작거나 같은 경우
		    System.out.println("가을에 태어났습니다.");
		}else { // 나머지 
			System.out.println("겨울에 태어났습니다.");
		}

	}

}
