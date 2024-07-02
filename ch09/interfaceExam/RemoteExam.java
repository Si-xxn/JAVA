package ch09.interfaceExam;

import java.util.Scanner;

public class RemoteExam {

	public static void main(String[] args) {
		// 인터페이스를 사용한 구현 클래스를 이용해본다.
		RemoteControl.changeBattery();

		System.out.println("리모컨 인터페이스를 사용합니다.");
		RemoteControl rc = null; // 인터페이스를 rc 변수에 넣음
		Scanner scanner = new Scanner(System.in);
		boolean condition = true;
		
		while (condition) {
			System.out.println("____________________________");
			System.out.println("1. Tv    2. Audio    3. SmartTv    4. 종료");
			System.out.println("____________________________");
			System.out.print(">> ");
			int select = scanner.nextInt();
			switch (select) {
			case 1:
				rc = new Television(); // RemoteControl rc = new Television();
				rc.turnOn();
				rc.turnOff(); 
				// Television 구현체
				rc.setMute(true); // 음소거 상태
				rc.setMute(false);// 음소거 해제 상태
				// 인터페이스에서 끌어옴
				break;
			case 2:
				rc = new Audio(); // RemoteControl re = new Audio();
				rc.turnOn();
				rc.turnOff();
				break;
			case 3:
				rc = new SmartTelevision(); // RemoteControl re = new SmartTelevision();
				rc.turnOn();
				Searchable se = new SmartTelevision(); // 2번째 인터페이스 연동
				System.out.println("인터넷 검색을 시작합니다.");
				System.out.print(">> ");
				String sc = scanner.next();
				se.search(sc);
				rc.turnOff();
				break;	
			case 4:
				condition = false;
				break;
			default:
				System.out.println("1 ~ 2 값만 입력하세요.");
				
			}// switch 종료
			
		}

	}

}
