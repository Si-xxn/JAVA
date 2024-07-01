package ch04;

import java.util.Scanner;

public class ForSumExam {

	public static void main(String[] args) {
		// 키보드로 입력받은 값을 반복 더해주는 코드
		
		Scanner scInt = new Scanner(System.in);
		
		int sum = 0; // 반복 더해주는 결과 값
		int x = 0; // 초기 값 
		int y = 0; // 종료 값
	
		System.out.print("더할 처음 값을 입력하세요. : ");
		x = scInt.nextInt(); // 키보드로 입력한 초기값 저장
		int z = x;
		
		System.out.print("더할 마지막 값을 입력하세요. : ");
		y = scInt.nextInt();
		
		for(  ; x <= y; x++) { 
			sum = sum + x;
		}
		System.out.println(z + "~" + y + " 까지의 누적 합계 값 : " + sum);

	}

}
