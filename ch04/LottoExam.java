package ch04;

import java.util.Scanner;

public class LottoExam {

	public static void main(String[] args) {
		// 정수 6개의 값을 입력받고 랜덤으로 6개의 값을 생성
		// 몇개가 맞았는지 파악
		
		System.out.println("1 부터 45 까지 중 6개의 번호를 입력해주세요.");
		
		Scanner sc = new Scanner(System.in); // 키보드로 입력받는 객체 생성
		
		int myN1 = sc.nextInt(); // 키보드로 입력받은 값 myN1에 넣음
		System.out.println("첫 번째 번호 : " + myN1);
		
		int myN2 = sc.nextInt();
		System.out.println("두 번째 번호 : " + myN2);
		
		int myN3 = sc.nextInt();
		System.out.println("세 번째 번호 : " + myN3);
		
		int myN4 = sc.nextInt();
		System.out.println("네 번째 번호 : " + myN4);
		
		int myN5 = sc.nextInt();
		System.out.println("다섯 번째 번호 : " + myN5);
		
		int myN6 = sc.nextInt();
		System.out.println("여섯 번째 번호 : " + myN6);
		
		System.out.println("========선택한 6개의 로또 번호========");
		System.out.println("                                 ");
		System.out.println(myN1 + ", "+ myN2 + ", " + myN3 + ", " + myN4 + ", " + myN5 + ", " + myN6); // 입력한 번호 한눈에 볼 수 있게 정리
		System.out.println("                                 ");
		
		
		int n1 = (int)(Math.random() * 45) +1 ;
		int n2 = (int)(Math.random() * 45) +1 ;
		int n3 = (int)(Math.random() * 45) +1 ;
		int n4 = (int)(Math.random() * 45) +1 ;
		int n5 = (int)(Math.random() * 45) +1 ;
		int n6 = (int)(Math.random() * 45) +1 ;
		// Math.random 메서드 사용 -> 컴퓨터 시간의 초를 활용하여 난수를 발생
		// -> double 타입을 쓰기 때문에 (int)로 강제 타입 변환
		
		int x = 0;
		
		if(myN1 == n1 || myN1 == n2 || myN1 == n3 || myN1 == n4 || myN1 == n5 || myN1 == n6) {
			++x;
		}
		if(myN2 == n1 || myN2 == n2 || myN2 == n3 || myN2 == n4 || myN2 == n5 || myN2 == n6) {
			++x;
		}
		if(myN3== n1 || myN3 == n2 || myN3 == n3 || myN3 == n4 || myN3 == n5 || myN3 == n6) {
			++x;
		}
		if(myN4 == n1 || myN4 == n2 || myN4 == n3 || myN4 == n4 || myN4 == n5 || myN4 == n6) {
			++x;
		}
		if(myN5 == n1 || myN5 == n2 || myN5 == n3 || myN5 == n4 || myN5 == n5 || myN5 == n6) {
			++x;
		}
		if(myN6 == n1 || myN6 == n2 || myN6 == n3 || myN6 == n4 || myN6 == n5 || myN6 == n6) {
			++x;
		} // 겹치는 변호 확인을 위해 myN1 ~ myN6을 n1 ~ n6에 입력된 숫자와 맞는지 비교
		  // x의 초기값을 0으로 두고 증감연산자를 이용하여 맞은 갯수 확인 
		
		System.out.println("========이번주 로또 당첨 번호=========");
		System.out.println("                                 ");
		System.out.println(n1 + ", " + n2 + ", " + n3 + ", " + n4 + ", " + n5 + ", " + n6 );
		System.out.println("                                 ");
		System.out.println("============맞은 갯수==============");
		
		if (x == 0) { 
			System.out.println("0개 맞았습니다. 아쉽지만 다음 기회에");
		}else if (x == 1) {
			System.out.println("1개 맞았습니다. 아쉽지만 다음 기회에");
		}else if (x == 2) {
			System.out.println("2개 맞았습니다. 아쉽지만 다음 기회에");
		}else if (x == 3) {
			System.out.println("축하합니다. 3개 맞았습니다.");
		}else if (x == 4) {
			System.out.println("축하합니다. 4개 맞았습니다.");
		}else if (x == 5) {
			System.out.println("축하합니다. 5개 맞았습니다.");
		}else if (x == 6) {
			System.out.println("축하합니다. 6개 맞았습니다.");
		}
		

	}

}
