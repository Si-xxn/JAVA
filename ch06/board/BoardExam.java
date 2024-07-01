package ch06.board;

import java.util.Scanner;

public class BoardExam {

	public static Scanner sc = new Scanner(System.in);
	public static Member[]members = new Member[100]; // member 배열 생성 (인덱스 0~99까지)
	public static Board[]boards = new Board[1000];   // board 배열 생성 (인덱스 0~999까지)
	public static void main(String[] args) {
		// 게시판 구현
		// 객체는 2개 (member, board)
		// 회원제용 게시판 구현용
		System.out.println("-------- 회원제 게시판 --------");
		boolean run = true;
		while(run) {
			System.out.println("1.회원관리  \t2.게시판  \n3.종료");
			System.out.print(">>> ");
			int select = sc.nextInt();
			switch(select) {
			case 1:
				System.out.println("-------- 회원관리 클래스로 진입합니다. --------");
				Member member = new Member(); // 새로운 빈 객체 생성
				member.menu(sc,members);
				break;
			case 2:
				System.out.println("-------- 게시판관리 클래스로 진입합니다. --------");
				// 메서드실행
				break;
			case 3:
				System.out.println("-------- 종료합니다. --------");
				run = false;
				break;	
			default:
				System.out.println("잘못된 입력입니다. 1~3 메뉴만 입력하세요.");
			}// switch 종료
			
		}// while 종료
		

	}// main 종료

}// class 종료
