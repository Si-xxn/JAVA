package ch08.extended.Tire;

import java.util.Scanner;

public class CarExam {

	public static void main(String[] args) {
		// 자동차 주행 테스트
		// 결론 -> Tire tire = new Tire();
		// 		  Tire tire = new HankookTire();
		//		  Tire tire = new KumhoTire();   -> 다형성
		
		Car car = new Car(); // 서비스 객체
		Scanner scanner = new Scanner(System.in);
		for(int i=1; i<=30; i++) {
			// 30번 주행
			int problemLocation = car.run();
			// 0 이면 정상 1 ~ 4는 고장과 함께 위치정보 전달
			
			switch(problemLocation) {
			case 1:
				System.out.println("=============================");
				System.out.println("앞 왼쪽 타이어 펑크");
				System.out.println("1. 한국타이어  2. 금호타이어  3.oem타이어");
				System.out.print(">> ");
				int select1 = scanner.nextInt();
				if(select1 == 1) {
					car.fl = new HankookTire(90,"앞 왼");
					System.out.println("한국타이어 교체 성공");
				}else if(select1 == 2) {
					car.fl = new KumhoTire(90, "앞 왼");
					System.out.println("금호타이어 교체 성공");
				}else {
					car.fl = new Tire(90, "앞 왼");
					System.out.println("oem타이어 교체 성공");
				}// if 종료
				System.out.println("=============================");
				break;
			case 2:
				System.out.println("=============================");
				System.out.println("앞 오른쪽 타이어 펑크");
				System.out.println("1. 한국타이어  2. 금호타이어  3.oem타이어");
				System.out.print(">> ");
				int select2 = scanner.nextInt();
				if(select2 == 1) {
					car.fr = new HankookTire(90,"앞 오");
					System.out.println("한국타이어 교체 성공");
				}else if(select2 == 2) {
					car.fr = new KumhoTire(90, "앞 오");
					System.out.println("금호타이어 교체 성공");
				}else {
					car.fr = new Tire(90, "앞 오");
					System.out.println("oem타이어 교체 성공");
				}// if 종료
				System.out.println("=============================");
				break;
			case 3:
				System.out.println("=============================");
				System.out.println("뒤 왼쪽 타이어 펑크");
				System.out.println("1. 한국타이어  2. 금호타이어  3.oem타이어");
				System.out.print(">> ");
				int select3 = scanner.nextInt();
				if(select3 == 1) {
					car.bl = new HankookTire(90,"뒤 왼");
					System.out.println("한국타이어 교체 성공");
				}else if(select3 == 2) {
					car.bl = new KumhoTire(90, "뒤 왼");
					System.out.println("금호타이어 교체 성공");
				}else {
					car.bl = new Tire(90, "뒤 왼");
					System.out.println("oem타이어 교체 성공");
				}// if 종료
				System.out.println("=============================");
				break;
			case 4:
				System.out.println("=============================");
				System.out.println("뒤 오른쪽 타이어 펑크");
				System.out.println("1. 한국타이어  2. 금호타이어  3.oem타이어");
				System.out.print(">> ");
				int select = scanner.nextInt();
				if(select == 1) {
					car.br = new HankookTire(90,"뒤 오");
					System.out.println("한국타이어 교체 성공");
				}else if(select == 2) {
					car.br = new KumhoTire(90, "뒤 오");
					System.out.println("금호타이어 교체 성공");
				}else {
					car.br = new Tire(90, "뒤 오");
					System.out.println("oem타이어 교체 성공");
				}// if 종료
				System.out.println("=============================");
				break;	
				
				
			}// switch
			System.out.println("----- 정 상 주 행 -----");
			
		}// for

	}// main

}// class
