package ch04;

public class ForPrintExam {

	public static void main(String[] args) {
		// for문은 횟수가 정해진 반복문이다.
		// for (초기값; 조건식; 증감식){실행문 ; 실행문2;}<-실행블럭
		int sum = 0; // 총 합의 누적 계산용
		
		for(int i = 1;    // 초기값  
				i <= 100;  // 조건식
				i++      // 증감식
				) { 
			// 실행문
			sum+=i; // sum = sum + i
			
		}// for 종료
		System.out.println("1~100까지 출력 : " + sum);
		
		for(int x = 0 , y = 100; x <= 10 && y >= 90; x++ , y--) {
			System.out.println("x값의 증가 : " + x + "\ty값의 감소 : " + y);
		}
	    

	}//main 종료

} // class 종료
