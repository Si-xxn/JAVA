package ch06.ScoresCard;

import java.util.Scanner;

public class ScoresMainExam {
	// 필드 -> 멤버변수 main 에서 사용할 배열이나 객체 생성
	private static Scanner sc = new Scanner(System.in); // 현 class 내 메서드에서 호출되어 사용가능
	private static Student[] st = new Student[5]; // 학생 객체용으로 5칸 배열 생성
	// ex) String[] string = new String[5];
	// 생성자 -> main일 경우 new 사용하지 않음 (정적 static 으로 사용하지 않음)

	// 메서드
	public static void main(String[] args) {
		// 주 실행 클래스로 메뉴와 클래스.메서드 호출용 작업
		// 객체: 학생, 성적, 통계...등

		boolean run = true; // 반복 실행

		while (run) { // 종료 시 run=false;
			System.out.println("----------학생 관리 프로그램vr2.(객체)----------");
			System.out.println("1.학생관리 \t2.성적입력 \n3.통  계  \t4.종  료");
			System.out.println("------------------------------------------");
			System.out.print(">>>");
			int select = sc.nextInt(); // 객체 사용 전에 private static 확인

			switch (select) {
			case 1:
				System.out.println("학생관리 클래스로 진입");
				boolean stRun = true;
				while (stRun) {
					System.out.println("1.학생등록 \t2.학생보기 \n3.학생수정 \t4.학생삭제 \n5.메인메뉴");
					System.out.print(">>> ");
					int stSelect = sc.nextInt();

					switch (stSelect) {
					case 1:
						System.out.println("학생등록 메뉴 입니다.");
						Student regStudent = new Student(); // 객체 생성
						System.out.print("이름 : ");
						regStudent.name = sc.next(); // 키보드로 받은 이름 regStudent name 에 넣음
						System.out.print("성별 : ");
						regStudent.sex = sc.next(); // 키보드로 받은 성별
						System.out.print("학년 : ");
						regStudent.grade = sc.nextInt(); // 키보드로 받은 학번
						System.out.print("반 : ");
						regStudent.classroom = sc.nextInt(); // 키보드로 받은 학년
						System.out.print("학번 : ");
						regStudent.num = sc.nextInt(); // 키보드로 받은 반
						// System.out.println("------객체 생성 입력 완료------");
						// System.out.println("-----배열 빈 칸을 찾아 저장-----");
						for (int i = 0; i < st.length; i++) {
							if (st[i] == null) { // st 배열이 빈칸인지 찾는 역할
								st[i] = regStudent; // 위에서 만든 객체 넣음
								System.out.println("----------저 장 성 공----------");
								break; // 저장 후 종료
							} // if 종료
						} // for 종료 -> null 찾는 for 문
						break; // 학생등록 브레이크
					case 2:
						System.out.println("--------전체 학생 보기--------");
						for (int i = 0; i < st.length; i++) {
							if (st[i] != null) {// st 배열칸이 null 이 아니면 출력
								System.out.println("---------------------------");
								System.out.print("이름 : " + st[i].name);
								System.out.println("(" + st[i].sex + ")");
								System.out.print(st[i].grade + "학년" + " ");
								System.out.println(st[i].classroom + "반" + " ");
								System.out.println("학번 : " + st[i].num);
							} // case2 if 종료
						} // case2 for 종료, st 배열 전체 반복
						break; // 학생 보기 정지
					case 3:
						System.out.println("--------학생 수정 메뉴--------");
						System.out.println("1.이름 2.학번");
						System.out.print(">>> ");
						String searchName = sc.next(); // 키보드로 입력받는 이름
						Student findStudent = find(searchName); // 아래 만든 메서드로 찾아옴
						if (findStudent == null) {
							System.out.println("찾은 학생이 없습니다.");
						} else { // 찾은 학생이 있으면
							System.out.println("수정할 학생 정보를 입력하세요");
							findStudent.num = sc.nextInt();
							System.out.println("학생 정보 수정 완료");
						} // else
						break;
					case 4: // 삭제는 인덱스로 빠져야함
						System.out.println("--------학생 정보 삭제--------");
						System.out.println("삭제할 학생명 입력");
						System.out.print(">>> ");
						String deleteName = sc.next();
						Student deleteStudent = find(deleteName); // 입력받은 이름을 아래에서 만든 메서드에서 찾아옴.
						if (deleteStudent == null) {
							System.out.println("삭제할 학생이 없습니다.");
						} else {
							for (int i = 0; i < st.length; i++) {
								if (st[i].name.equals(deleteStudent.name)) { // 아래에서 새로만든 객체에서 같은 정보를 찾아 원래의 배열에 있는 정보 삭제
									st[i]=null;
									System.out.println(deleteName + " 학생의 정보를 삭제합니다.");
									break;
								} // else-for-if 종료
							} // else 문 안에 for 종료
						} // else 종료
						break;
					case 5:
						System.out.println("메인 메뉴로 이동합니다.");
						stRun = false;
						break;
					default:
						System.out.println("잘못된 메뉴 선택 입니다.");
					} // case1 switch 종료
				} // case 1 while 문

				break;
			case 2:
				System.out.println("성적입력 클래스로 진입");
				break;
			case 3:
				System.out.println("통계 클래스로 진입");
				break;
			case 4:
				System.out.println("성적표 프로그램 종료");
				run = false;
				break;
			default: // break 쓰면 멈춰버림.
				System.out.println("1~4번 메뉴만 선택!");
			}// switch 종료(주 메뉴용)
		} // while 종료

	}// main 메서드

	private static Student find(String name) { // 이름으로 객체 찾아오는 메서드 -> 리턴은 Student 객체
		Student student = null; // 빈 객체 생성
		// 입력받은 값 배열에서 찾아 빈 객체에 저장
		for (int i = 0; i < st.length; i++) {
			if (st[i] != null) {
				String arrayName = st[i].name; // 배열에 있는 이름 가져옴
				if (arrayName.equals(name)) { // 배열이름과 입력받은 이름이 같은지 비교
					student = st[i]; // 찾은 객체를 빈 객체에 넣는다.
					break;
				} // 안쪽 if 종료
			} // if 종료
		} // for 종료
		return student;// 리턴 객체 생성

	}// find 메서드 종료

}// class
