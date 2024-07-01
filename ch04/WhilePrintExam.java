package ch04;

public class WhilePrintExam {

	public static void main(String[] args) {
		// While 문은 () 안에 값이 true 일 때 무한반복한다. 
		// while(true) 일때는 반복실행하다가 while문 안에 값이 false로 바뀌면 종료
		// 대부분 최대값이 없는 반복문일 때 활용 -> 메뉴용으로 활용(관리자에 의한 종료)
		
		int i=1;
		while(i <= 10) { // 1~10까지 true -> 11 false(while 종료)
			//반복 실행 문 
			
			System.out.println(i);
			i++;
			
		}// while 종료
		
		System.out.println("프로그램이 정상 종료 되었습니다.");

	}// main 종료

}//class
