package ch04;

import java.util.Scanner;

public class CarRunExam {

	public static void main(String[] args) {
		// 자동차 주행 프로그램 만들기
		// C -> 시동을 건다.(Start)
		// R -> 계기판 정보 출력
		// U -> 주행 (정보 업데이트)
		// D -> 시동을 끈다. (END)
		
		Scanner sc = new Scanner(System.in);
		
		boolean run = true; //시동을 켠다.
		int speed = 0; //차량 속도
		final int MAXSPPED = 300; // 최고속도 상수 
		// final은  선언 된 변수 못바꿈 //상수는 대문자로 작성
		final int MINSPPED = 0; //  최저속도 상수
		System.out.println("람보르기니가 입고 되었습니다.");
		System.out.println("시동을 켭니다.");
		System.out.println("현재 속도 : "+speed +"km/h");
		//MAXSPPED=400;
		
		while(run) {
			// 무한 반복 중 메뉴가 출력
			System.out.println("-----------------메 뉴----------------");
			System.out.println("0. 시동 종료");  // 종료성공
			System.out.println("1. 엑셀");      // 30키로 가속 + 300이하 최대 성공
			System.out.println("2. 브레이크");   // 20키로 감속 + 0이하로 최저 성공
			System.out.println("3. 멀티미디어");  //
			System.out.println("4. 주유하기");   //
			System.out.println("5. 환경설정");   //
			System.out.println("-------------------------------------");
			
			System.out.print("메뉴 선택(0~4 선택) >");
			int select = sc.nextInt();
			switch(select) {
			case 0 :
				System.out.println("시동 종료"); 
				run = false; // while 종료
				break;
			case 1 :
				System.out.println("가 속");
				speed += 30;
				if(speed>=MAXSPPED) {//현재속도가 최고 속도보다 크거나 같으면(조건)
					speed=MAXSPPED;
				} // 300이상 출력 안됨.
				System.out.println("현재 속도 : "+speed +"km/h");
				break;
			case 2 :
				System.out.println("감 속");
				speed -= 20;
				if(speed<=MINSPPED) {
					speed = MINSPPED;
				}
				System.out.println("현재 속도 : "+speed +"km/h");
				break;
			case 3 :
				System.out.println("멀티미디어 작동");
				break;
			case 4 :
				System.out.println("주 유 진 행");
				break;	
			
				
				
			}// switch 종료
			
		}// while 종료
		System.out.println("람보르기니 자동차가 사라집니다.");
		
		

	}// main

}// class
