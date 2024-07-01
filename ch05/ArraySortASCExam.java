package ch05;

public class ArraySortASCExam { // ASC = 오름차순 의미

	public static void main(String[] args) {
		// 버블 정렬 오름차순으로 구현 (IQ 150 이상)
		// 오름차순은 작은 값 -> 큰 값으로 재배열
		// 필수 항목 : temp(변수명) 임시방
		// 내림차순은 큰 값 -> 작은 값으로 재배열

		int[] scores = new int[] { 79, 88, 91, 33, 100, 55, 95 };
		// scores 변수에 int 배열 7칸 생성 하며 정수 값을 넣음

		System.out.println("----------배열 초기값 출력----------");
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + " ");
		} // for 종료
		System.out.println();
		System.out.println("--------------------------------");

		System.out.println("----------오름 차순 정렬 시작----------");
		System.out.println();
		for (int j = 0; j < scores.length - 1; j++) { // j = 0 ~ 6 까지 반복(싸이클 반복용)
			for (int k = 0; k < scores.length - 1 - j; k++) {
				if (scores[k] > scores[k + 1]) {
					int temp = scores[k]; // 큰 값이 temp 변수에 저장
					scores[k] = scores[k + 1]; // 작은 값이 k 번째에 저장
					scores[k + 1] = temp; // temp 큰 값이 k+1 번째에 저장
				} // 옆자리랑 비교하여 큰지 물어보는 if 문
				System.out.println("----------배열 정렬중 출력----------");
				for (int i = 0; i < scores.length; i++) {
					System.out.print(scores[i] + " ");
				} // for 종료
				System.out.println();
				System.out.println("--------------------------------");
			} // 싸이클 1번은 (0 ~ 6) 싸이클2(0 ~ 5) 싸이클3(0 ~ 4) .... 반복 [마지막에 max 값]
			System.out.println("---------배열 오름 차순 출력---------");
			for (int i = 0; i < scores.length; i++) {
				System.out.print(scores[i] + " ");
			} // for 종료
			System.out.println();
			System.out.println("--------------------------------");
		} // 오름차순 for

	}// main 종료

}// class 종료
