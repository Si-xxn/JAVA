package ch05;

import java.util.Scanner;

public class GradeExam {
	// 학생이름 테이블 -> String[]
	// 점수 테이블 -> byte[]
	// 총점 테이블 -> int[]
	// 평균 테이블 -> double[]
	// 표사용, 메서드 이름 중요
	public static void main(String[] args) { // 주메뉴 구현용
		Scanner mainsc = new Scanner(System.in);
		System.out.print("-----성적 관리 프로그램----- \n 학생 수를 입력하세요 > ");
		int count = mainsc.nextInt(); // 학생수 등록완료

		String[] name = new String[count]; // 입력값만큼 String 배열 생성
		byte[] engScores = new byte[count]; // 학생 수 만큼 engScores 배열 생성
		byte[] korScores = new byte[count]; // 학생 수 만큼 korScores 배열 생성
		int[] totalScores = new int[count]; // 학생 수 만큼 총합 배열 생성
		double[] avgScores = new double[count]; // 학생 수 만큼 평균 배열 생성
		int[] grade = new int[count];

		boolean run = true;

		while (run) {

			System.out.println("----MBC 교육 센터 성적 관리 프로그램----");
			System.out.println("1. 학생 관리 \t2. 성적 관리 \n3. 성적 학인  \t4. 종료");
			System.out.println("----------------------------------");
			System.out.print(">>>");
			int select = mainsc.nextInt(); // 키보드 입력 받는(1~4) 값 select 에 저장

			switch (select) {
			case 1:
				System.out.println("=========학생관리 메뉴 이동========="); // 메서드 생성 완료
				student(name);
				break;
			case 2:
				System.out.println("=========성적관리 메뉴 이동========="); // 메서드 생성 완료(void)
				score(engScores, korScores);
				break;
			case 3:
				System.out.println("=========성적확인 진입합니다.=========");
				total(totalScores, grade, korScores, engScores);
				avg(avgScores, totalScores);
				break;
			case 4:
				System.out.println("=========프로그램을 종료합니다.=========");
				run = false;
				break;

			}// switch (주메뉴)
		} // while 종료
	}// main

	private static void avg(double[] avgScores, int[] totalScores) {
		// 평균 구하기
		double avg = 0;
		for (int i = 0; i < avgScores.length; i++) {
			avg = totalScores[i] / 2;

		} // avg for 종료
	}// 평균 메서드

	private static void total(int[] totalScores, int[] grade, byte[] engScores, byte[] korScores) {
		// 성적 합계 및 평균 메서드
		Scanner totalsc = new Scanner(System.in);
		boolean run = true;

		while (run) {
			System.out.println("-----성적 확인-----");
			System.out.println("1.학생 합계 및 평균 \n2.전체 합계 및 평균 \n3.학생 개인 성적표 출력 \t4.등수 확인 \n5.메뉴 나가기 ");
			System.out.println(">>> ");
			int num = totalsc.nextInt();

			switch (num) {
			case 1:
				System.out.print("성적을 확인할 학생 번호 입력 > ");
				int x = totalsc.nextInt();
				for (int i = 0; i < totalScores.length; i++) {
					totalScores[i] = engScores[i] + korScores[i];
					System.out.println(x + "번 학생의 총 합계 : " + totalScores[x - 1]);
					System.out.println(x + "번 학생의 성적 평균 : " + totalScores[x - 1] / 2);

				} // case1-for
				break;
			case 2:
				int sum = 0;
				double avg = 0;
				for (int i = 0; i < totalScores.length; i++) {
					totalScores[i] = engScores[i] + korScores[i];
					sum += totalScores[i]; // total 점수 sum 값에 누적
					avg = sum / totalScores.length; // 학생 수 대신해서 사용
					System.out.println("-------학생 점수 리스트-------");
					System.out.println((i + 1) + "번 학생 : \n 영어 : " + engScores[i] + "점 \t 국어 : " + korScores[i]
							+ "\n 총점/평균 : " + totalScores[i] + "/" + totalScores[i] / 2);
				}
				System.out.println("------전체 학생의 총 합계 및 평균------");
				System.out.println("합 : " + sum + "\t 평균 : " + avg);
				break;
			case 3:
				System.out.println("1.전체 학생 성적표 출력 \n2.학생 성적표 선택 출력");
				System.out.print(">>> ");
				int choice = totalsc.nextInt();
				switch (choice) {
				case 1:
					System.out.println("------전체 학생 성적표를 출력합니다.------");
					for (int i = 0; i < totalScores.length; i++) {
						System.out.println("----" + i + 1 + "번 학생 성적표----" + "\n영어 : " + engScores[i] + "\t국어 : "
								+ korScores[i] + "\n총점 : " + totalScores[i] + "\t평균 : " + totalScores[i] / 2);
					} // case3-1 for
					break;
				case 2:
					System.out.print("성적표를 출력할 학생 번호 입력 > ");
					int number = totalsc.nextInt();
					for (int i = 0; i < totalScores.length; i++) {
						System.out.println("-----" + number + "번 학생 성적표 출력합니다.-----");
						System.out.println("영어 : " + engScores[number - 1] + "\t국어 : " + korScores[number - 1]
								+ "\n총점 : " + totalScores[number - 1] + "\t평균 : " + totalScores[number - 1] / 2);

					}
					break; // case 3-2 for 종료
				default: // case 3 안에 switch default
					System.out.println("메뉴 선택 오류");
				}// switch
				break;
			case 4:
				int max = grade[0];
				int min = grade[0];

				for (int i = 1; i < grade.length; i++) {
					if (grade[i] > max) {
						max = grade[i];
					} else if (grade[i] < min) {

					} // else if 종료
					System.out.println("1등 " + (i + 1) + "번 학생 : " + max);
					System.out.println("꼴등 " + (i + 1) + "번 학생 : " + min);
				} // for

			default: // 본 switch default
				System.out.println("메뉴 선택 오류");
				run = false;
			case 5:
				run = false;
			}// total switch

		} // total while

	}// total 메서드

	private static void score(byte[] engScores, byte[] korScores) {
		// 성적관리 메서드
		Scanner scsc = new Scanner(System.in);
		boolean run = true;
		
		//The local variable name may not have been initialized

		while (run) {
			System.out.println("------성적 관리 메뉴------");
			System.out.println("1. 점수 입력 \t2. 점수 확인 \n3. 점수 수정  \t4. 삭제 \n5. 메뉴 나가기");
			System.out.println("-----------------------");
			System.out.print(">>>");
			int select = scsc.nextInt();

			switch (select) {
			case 1:
				System.out.println("-----성 적 입 력-----");
				for (byte i = 0; i < engScores.length; i++) {
					System.out.print((i + 1) + "번 영어 점수 > ");
					engScores[i] = scsc.nextByte();
					System.out.print((i + 1) + "번 국어 점수 > ");
					korScores[i] = scsc.nextByte();

				} // for

				break;
			case 2:
				System.out.println("-----점 수 확 인-----");
				for (byte i = 0; i < engScores.length; i++) {
					if (engScores[i] != 0 && korScores[i] != 0) {
						System.out.println((i + 1) + "번 \n- 영어 : " + engScores[i] + "\t- 국어 : " + korScores[i]);
					} // if
					else {
						System.out.println("입력된 점수가 없습니다. 점수를 입력해주세요.");
					}
				} // case-for
				break;
			case 3:
				System.out.println("-----점 수 수 정-----");
				System.out.println("1. 영어 \t2. 국어");
				System.out.print(">>>");
				int choice = scsc.nextInt();
				if (choice >= 3) {
					System.out.println("메뉴 선택 오류입니다.");
				} // if
				else if (choice == 1) {
					System.out.print("수정 할 학생 번호 입력 > ");
					int stNum = scsc.nextInt();
					System.out.print("수정 점수 입력 > ");
					byte engScoresMOD = scsc.nextByte();
					engScores[stNum - 1] = engScoresMOD;
					System.out.println(stNum + "번" + "영어 점수" + engScoresMOD + "점 으로 변경");
				} // else if
				else {
					System.out.print("수정 할 학생 번호 입력 > ");
					int stNum = scsc.nextInt();
					System.out.print("수정 점수 입력 > ");
					byte korScoresMOD = scsc.nextByte();
					korScores[stNum - 1] = korScoresMOD;
					System.out.println(stNum + "번" + "국어 점수" + korScoresMOD + "점 으로 변경");
				} // else
			case 4:
				System.out.println("-----점 수 삭 제-----");
				System.out.println("점수를 삭제하시겠습니까? \n1.네 \t2.아니오");
				System.out.print(">>>");
				int num = scsc.nextInt();

				switch (num) {
				case 1:
					if (engScores[num] != 0 && korScores[num] != 0) {
						System.out.print("학생 번호 입력 > ");
						int stNum = scsc.nextInt();
						engScores[stNum - 1] = 0;
						korScores[stNum - 1] = 0;
						System.out.println(stNum + "번 학생 점수를 모두 삭제했습니다.");
					} else {
						System.out.println("입력된 점수가 없습니다. 점수를 입력해주세요.");
					}
					break;
				case 2:
					System.out.println("메뉴로 돌아갑니다.");
					break;
				default:
					System.out.println("메뉴 선택 오류");

				}// switch 종료
			case 5:
				run = false;
			default:
				run = false;
			}// 성적관리 select switch
		} // 성적관리 while
		System.out.println("메인 메뉴로 돌아갑니다.");
	}// 성적관리 메서드 종료

	public static String[] student(String[] name) {
		// 학생관리용 C R U D
		Scanner stsc = new Scanner(System.in);
		boolean run = true; // while 용

		while (run) {
			System.out.println("------학생 관리 메뉴------");
			System.out.println("1. 학생등록 \t2. 학생리스트 \n3. 정보수정 \t4. 정보삭제 \n5.메뉴 나가기");
			System.out.println("-----------------------");
			System.out.print(">>>");
			int select = stsc.nextInt();

			switch (select) {
			case 1:
				System.out.println("-----학생 등록을 시작합니다.-----");
				System.out.println("총 학생 수 : " + name.length + "명 입니다.");
				for (int i = 0; i < name.length; i++) {// 학생이름 입력 반복문
					System.out.print((i + 1) + "번 학생 이름 등록 > ");
					name[i] = stsc.next(); // 키보드로 받은 str 값을 name 배열 i에 넣는다.
				}
				System.out.println("학생 등록 완료");
				break;
			case 2:
				System.out.println("-------학생 리스트-------");
				for (int i = 0; i < name.length; i++) {
					System.out.println((i + 1) + "번 : " + name[i] + "\n");
				}
				break;
			case 3:
				System.out.println("------정 보 수 정------");
				System.out.println("수정할 학생 번호 입력 > ");
				int nameNum = stsc.nextInt();
				System.out.println("새로운 학생 이름을 입력하세요 > ");
				String nameMOD = stsc.next();
				name[nameNum - 1] = nameMOD; // 인덱스는 0번부터 시작하기 때문에 입력번호에서 -1 해줌
				System.out.println(nameNum + "번의 학생 이름 " + nameMOD + "로 수정완료");
				break;
			case 4:
				System.out.println("-----정 보 삭 제-----");
				System.out.println("정보를 삭제하시겠습니까? \n1.네 \t2.아니오");
				System.out.print(">>>");
				int num = stsc.nextInt();
				switch (num) {
				case 1:
					System.out.print("정보를 삭제할 학생 번호 입력 > ");
					int deletNum = stsc.nextInt();
					name[deletNum - 1] = null; // 객체 지울 때 null 처리 (공백 처리)
					System.out.println(deletNum + "번 학생 정보 삭제 완료");
					break;
				case 2:
					System.out.println("메뉴도 돌아갑니다.");
					break;
				default:
					System.out.println("메뉴 선택 오류");
				}// case4-switch
				break;
			case 5:
				run = false;
				break;

			default:
				System.out.println("잘못 된 메뉴 선택 입니다(1~4번 선택)");
				run = false;

			}// switch(학생관리)

		} // while
		return name;
	}// student 메서드

}// class
