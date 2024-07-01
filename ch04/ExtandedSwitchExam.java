package ch04;

import java.util.Scanner;

public class ExtandedSwitchExam {
	// 향상된 switch -> 람다식 결합
			// 메서드를 나누는 연습(main 메서드는 주 실행용, 나머지 메서드는 (CRUD) 동작용
			// 메인 메서드는 프로그램 실행시 1순위로 동작
			// 나머지 메서드는 대기하고 있다가 호출시 만 동작함
	
	public static void main(String[] args) {
		// 주메뉴
		Scanner in = new Scanner(System.in);
		System.out.print("찾은 동물의 이름을 입력하세요. >> ");
		String Monster = in.next(); // 키보드로 입력 가능
		
		String kind = whoIsItReturn(Monster); // 아래쪽에 만든 메서드를 호출(매개값)
		// return이 있기 때문에 가능
		System.out.printf("%s는 %s 이다. \n" ,Monster,kind);

	}// main
	
	static String whoIsItReturn(String Monster) {
		// void 가 아닌 타입인 경우에는 return 필수이다. 
		String kind = "넌 누구냐!!";
		switch(Monster) {
		case "호랑이", "사자", "강아지", "고양이"	-> kind = "포유류";	// 화살표는 람다식 기호
		case "독수리", "참새", "까마귀", "비둘기"	-> kind = "조류";	
		case "고등어", "연어", "참치", "갈치"	,"삼치"-> kind = "어류";	
		case "킹크랩", "대게", "새우", "딱새우"	-> kind = "갑각류";	
		case "매미", "잠자리", "메뚜기", "개미"	-> kind = "곤충";
		default -> System.out.println("아이쿠!!!!");
		
		}// switch
		
		return kind;// 결과값을 돌려줌.
		
	}// static String
	
	
	
	static void whoIsIt(String Monster) { // 호출 당함 (매개값) -> 매개값은 타입만 맞으면 된다.
		// void는 결과를 리턴하지 않음, 자체적으로 해결
		String kind = "넌 누구냐!!"; // whoIsIt 메서드에서 사용하는 변수
		
		switch(Monster) {
		case "호랑이", "사자", "강아지", "고양이"	-> kind = "포유류";	// 화살표는 람다식 기호
		case "독수리", "참새", "까마귀", "비둘기"	-> kind = "조류";	
		case "고등어", "연어", "참치", "갈치"	,"삼치"-> kind = "어류";	
		case "킹크랩", "대게", "새우", "딱새우"	-> kind = "갑각류";	
		case "매미", "잠자리", "메뚜기", "개미"	-> kind = "곤충";
		default -> System.out.println("아이쿠!!!!");
		
		}// switch
		
		System.out.printf("%s는 %s 이다. \n" ,Monster,kind);
	
	}// whoIsIt 메서드

}//class
