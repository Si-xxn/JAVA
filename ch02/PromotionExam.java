package ch02;

import java.util.Scanner; // 다른 패키지에 있는 코드를 가져온다.

public class PromotionExam {

	public static void main(String[] args) {
		// 자동타입 변환(Promotion)은 작은 크기의 타입을 큰 크기 타입으로 자동 변환
		// byte(1) short(2> int -> long -> float -> double
		// 예를 들어 국,영,수,사,과 과목은 byte -> 총점 int -> 평균 double

		byte kor = 0;
		byte eng = 0;
		byte math = 0;
		byte sol = 0;
		byte sci = 0;
		
		// 키보드로 점수를 입력 받는 곳
		Scanner input = new Scanner(System.in); // 키보드로 입력받는 객체 생성 (암기)
		System.out.print("국어 점수 : ");
		kor = input.nextByte(); // 스캐너 객체에서 키보드로 입력받은 값을 byte로 처리 / next다음 단위는 바꿀 수 있음
		// input.nextByte는 입력 받을 것을 기다림
		System.out.print("영어 점수 : ");
		eng = input.nextByte();
		
		System.out.print("수학 점수 : ");
		math = input.nextByte();
		
		System.out.print("사회 점수 : ");
		sol = input.nextByte();
		
		System.out.print("과학 점수 : ");
		sci = input.nextByte();
		
		
		
		
		System.out.println("--------현재 점수표--------");
		System.out.println("------------------------");
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("사회 : " + sol);
		System.out.println("과학 : " + sci);
		
		//byte total = 0; 연산시 기본 타입은 int (자동 타입 변환)
		int total = 0; //코드는 위에서 아래로 출력 전에 계산
		total = kor + eng + math + sol + sci; //Type mismatch: cannot convert(변환) from int to byte
		
		System.out.println("----------총점-----------");
		System.out.println("총점 : " + total);
		
		
		double avg = 0.0; //초기값
		avg = total / 5; /* /<- 나누기 */
		System.out.println("-----------평균----------");
		System.out.println("평균 : " + avg);
		
		
		if(avg >= 60) {
			// 참
			System.out.println("-----합격을 축하드릷니다.-----");
			System.out.println("현재 점수 : " + avg);
			System.out.println("합격 점수 : 60점 이상");
		}else {
			//거짓
			System.out.println("------불합격을 축하드릷니다.------");
			System.out.println("현재 점수 : " + avg);
			System.out.println("합격 점수 : 60점 이상");
		}
	}

}
