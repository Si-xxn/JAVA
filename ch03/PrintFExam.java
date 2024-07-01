package ch03;

import java.util.Scanner;

public class PrintFExam {

	public static void main(String[] args) {
		// System.out.printf()는 포멧팅용 출력을 진행한다.
		// 대부분 규격을 맞출 때 활용한다. 
		
		Scanner input = new Scanner(System.in); // 키보드로 입력 받을 객체 생성
		System.out.println("======================================");
		System.out.print("이름 : ");
		String name = input.next(); // 문자열 입력용
		
		System.out.print("나이 : ");
		int age = input.nextInt(); // 정수 입력용
		
		System.out.print("평균 : ");
		double avg = input.nextDouble(); //소수점(실수) 입력용
		
		System.out.printf("현재 당신의 이름은 %s\n 당신의 나이는 %d\n 평균은 %5.2f\n 입니다. ", name,age,avg);
		// name,age,avg가 %에 입력됨

	}

}
