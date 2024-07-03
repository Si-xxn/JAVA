package ch11.tryCatch;

import java.util.Scanner;

public class TryCatchFinallyExam {

	public static void main(String[] args) {
		// 문자로 입력받은 숫자를 정수로 변환

		Scanner scanner = new Scanner(System.in);

		System.out.print("첫 번째 숫자를 입력하세요 : ");
		String data1 = scanner.next();

		System.out.print("두 번째 숫자를 입력하세요 : ");
		String data2 = scanner.next();

		try {
			System.out.println("두개의 숫자를 더하겠습니다.");

			int value1 = Integer.parseInt(data1); // 문자로 된 숫자를 정수로 변환
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + " + " + data2 + " =" + result);
		} catch (NumberFormatException e) {
			System.out.println("숫자만 입력하세요.");
			//e.printStackTrace();
		}

	}

}
