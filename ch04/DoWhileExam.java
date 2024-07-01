package ch04;

import java.util.Scanner;

public class DoWhileExam {

	public static void main(String[] args) {
		// 업 앤 다운 게임 만들기
		// 컴퓨터가 랜덤 숫자를 생성한다. (1~50)
		// 사용자가 숫자를 입력한다.
		// 컴퓨터가 랜덤숫자를 판단하여 up & down 을 알려준다.
		// 사용자의 숫자와 컴퓨터의 랜덤수자가 일치하면 프로그램 종료와 함께 당첨사실 알린다. 
		// 3번안에 성공시 상품 증정용 코드 추가
		
		int answer= (int)(Math.random()*50)+1; //컴퓨터가 1~50까지 랜덤숫자를 생성
		Scanner scanner=new Scanner(System.in); //키보드로 입력받을 객체 생성	
		int question = 0; // 사용자가 입력하는 숫자 보관용
		int hits = 0; // 카운트용
		System.out.println("------------------------------------");
		System.out.println("up & down 게임에 오신걸 환영합니다.");
		System.out.println("3번안에 성공하시면 상품을 드립니다.");
		System.out.println("상품 제공은 관리자에게 문의하세요.");
		System.out.println("------------------------------------");//인트로 작성
		do {
			System.out.println("1 부터 50 사이의 숫자를 입력하세요");
			question = scanner.nextInt(); // 사용자가 숫자를 키보드로 입력한다.
			hits++; // 키보드로 입력한 횟수 카운트용
				if (question > answer) { // 입력값이 더 크니 값은 입력값보다 낮다
					System.out.println("down");
				}else if (question < answer) {// 입력값이 작으니 답은 입력값보다 높다
					System.out.println("up");
				}
				
			
		}//do
		while(question != answer); //do~while 종료
		// 랜덤숫자와 입력숫자가 같지 않으면 do문으로 올라감
		// 랜덤숫자와 입력숫자가 같으면 아래로 내려옴
		System.out.println("정답입니다." + answer);
		System.out.println("맞춘 횟수 : "+hits+"번 입니다.");
		
		if(hits<=3) {
			System.out.println("축하드립니다. 상품수령 문의는 카운터에 해주세요.");
		}else {
			System.out.println("상품 수령은 다음기회에~");
		}
			

	}

}
