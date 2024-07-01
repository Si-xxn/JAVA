package ch03;

public class ArithmeticExam {

	public static void main(String[] args) {
		// 이항 연산자는 2개의 항으로 게산되어 결과를 산출한다. 
		// 사칙연산+나머지 게산 등에 활용
		// 자동 타입 변환으로 큰 타입으로 변경된다. 
		
		int v1 = 5;
		int v2 = 2;
		int result1 = v1 + v2;
		
		System.out.println("result1 = " + result1); // 7
		
		int result2 = v1 - v2;
		System.out.println("result1 = " + result2); // 3
		
		int result3 = v1 * v2;
		System.out.println("result1 = " + result3); // 10
		
		int result4 = v1 / v2;
		System.out.println("result1 = " + result4); // 2
		
		int result5 = v1 % v2;
		System.out.println("result1 = " + result5); //1 나머지
		
		double result6 = v1 / v2;
		System.out.println("result1 = " + result6); // 2.0
		
		double result7 = (double) v1 / v2; // 강제 타입 변환 + 자동 타입 변환 활용
	    // (double) (v1 / v2) = 2.0 -> 괄호 먼저 계산 >> (double)v1 / (double)v2 가 정확한 계산
		System.out.println("result1 = " + result7); // 2.5 
		// !!!!나누기 할 때 주의사항 소수점 계산!!!!
		
		System.out.println("-----------------------------");
		
		
		int x = 1000000;
		int y = 1000000;
		int z = x*y; // 1000000000000
		
		System.out.println("백만 * 백만 = " + z); // 코드 쓰면서 오류 x 결론 문제
		
		long zl = (long) x * y; //x,y 강제 + 자동 타입 변환으로 long 타입으로 변경
		System.out.println("long 강제 + 자동 타입 변환 : " + zl);
		
		System.out.println("-----------------------------");
		
		System.out.println("소수점 정확한 계산은 float, double?");
		// 정확한 계산은 부동소수점(실수) 타입은 사용하지 않는 것이 좋다. 
		// 사과 1개를 0.1 단위인 10조각으로 보고(piece) 그 중 7개의 조각(0.7)을 뺀 3조각(0.3) 계산
		
		
		int apple = 1; // 사과 1개
		double pieceUnit = 0.1; // 사과 1조각 (10등분)
		int piece = 7; // 먹은 조각 수
		
		double result = apple - (piece * pieceUnit);  // 1 - ( 7 * 0.1 = 0.7) = 0.3
		
		System.out.println("남은 사과 조각 수 : " + result); //남은 사과 조각 수 : 0.29999999999999993
		// ㄴ>부동 소수점 연산의 단점 (돈 계산 할 때 double 타입 X) 찌꺼기 남음
		// !!!결론 : 돈 계산 할 때는 double과 같은 실수형으로 사용하지 말 것!!!
		
		System.out.println("-----------------------------");
		
		int appleInt = 1; // 사과 1개
		int totalPieces = appleInt * 10; // 10 등분으로 나누지 말고 곱함
		int number = 7; // 사과 7조각을 표현
		int temp = totalPieces - number; // 사과 10 조각을 - 7 조각 = 3조각
		
		double resultInt = temp / 10.0; // 3/10.0 = 0.3
		
		System.out.println("사과 1개에서 0.7 조각을 빼면 : " + resultInt);
		
		int eng = 90;
		int sol = 80;
		
		int total = eng + sol;
		
		System.out.println("영어 점수 : " + eng); // 문자 + 숫자
		System.out.println("사회 점수 : " + sol);
		System.out.println("총점 : " + total);
		System.out.println((90 + 80)/2 +" : 평균 " ); // 앞이 숫자 + 문자 = 계산 후 문자 붙음
		// 출력 시 앞 글자가 문자이면 뒤에 숫자는 자동 타입 변환으로 문자열 출력
		// 출력 시 앞 글자가 계산정보이면 게산 후 문자열이 붙는다.
		
		
		
		
		
		
		

	}

}
