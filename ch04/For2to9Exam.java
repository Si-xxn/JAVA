package ch04;

public class For2to9Exam {

	public static void main(String[] args) {
		// 2단 ~ 9단까지 구구단을 찍어보자.
		// for 문 안쪽에 for를 또 작성하면 바깥쪽에 for가 돌면서 안쪽 for문이 돈다.
		// 블럭 for {  for  } <- 블럭 조심!!
		
		System.out.println("====== 구구단 시작======");
		
		for (int m = 2; m <= 9; m++) {
			System.out.println("------ " + m + "단 ------");
			for(int n = 1; n <= 9; n++) { // 실제로 곱하는 코드
				System.out.println(m + " X " + n + " = " + (m*n));
			} // 중첩 for 종료
		
		} // for 종료
		
	} // main 종료

} // class 종료
