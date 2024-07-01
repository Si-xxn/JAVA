package ch06.board;

import java.util.Scanner;

public class Member {// 회원에 대한 CRUD
	// 필드 -> 멤버변수
	String id;
	String pw;
	String nickName;
	String email;

	// 생성자 -> new로 객체 생성시 사용(생략시 기본 생성자 자동으로 만들어짐)
	// Member member = new Member();

	// 메서드 -> 동작(CRUD)
	public Member register(Scanner sc) {
		Member newMember = new Member();
		// 새로운 Member 객체를 생성하여 키보드로 넣은 필드 값을 삽입하고 객체로 리턴
		System.out.print("아이디 입력 : ");
		newMember.id = sc.next();
		System.out.print("비밀번호 입력 : ");
		newMember.pw = sc.next();
		System.out.print("닉네임 입력 : ");
		newMember.nickName = sc.next();
		System.out.print("이메일 입력 : ");
		newMember.email = sc.next();
		return newMember;
	}// register

	public Member login(Scanner sc, Member[] members) {
		// 매개값 키보드 입력, 회원배열
		Member logInMember = new Member(); // 키보드로 입력한 객체 생성
		// 입력받은 값 배열에 저장된 값과 같은지 비교
		System.out.println("------ 로그인 시작 ------");
		System.out.print("아이디 입력 : ");
		logInMember.id = sc.next();
		System.out.print("패스워드 입력 : ");
		logInMember.pw = sc.next(); // 키보드로 입력받은 id , pw 새로만든 객체에 저장

		// 배열에 있는 객체와 새로만든 객체 비교 시작

		for (int i = 0; i < members.length; i++) {
			if (members[i] != null) { // 배열에 빈칸이 아니면 이라는 조건
				if (members[i].equals(logInMember.id) && members[i].equals(logInMember.pw)) {
					// 배열에 있는 id 와 키보드로 입력한 id 가 같고 배열 pw 와 입력 pw가 같다.
					// logInMember 는 2개의 값 member[i]는 4개 값
					logInMember = members[i];// 교체
					System.out.println("----- 로그인 성공 -----");
					break; 
					// 키보드로 입력받은 값이 2개만 있음 -> 자리바꿈으로써 원래 값 까지 리턴 가능
					
				} // 중첩 if(id , pw 비교 -> 객체 치환)
			} // if
			else {
				System.out.println("일치하는 회원정보가 없습니다. \nID 와 PW 확인하세요.");
				// register(sc);
			}// else
			break;
		} // login for (id,pw 비교)
		return logInMember;
	}// login

	public void modify() {
		System.out.println("------ 회원정보 수정 ------");
	}// modify

	public void delete() {
		System.out.println("------ 회 원 탈 퇴 ------");
	}// delete

	public void menu(Scanner sc, Member[] members) {
		// 매개값 멤버배열
		boolean run = true;
		while (run) {
			System.out.println("------- 회원전용 메뉴 -------");
			System.out.println("1.회원가입 2.로그인 3.수정 4.탈퇴 5.종료");
			System.out.print(">>> ");
			int select = sc.nextInt();
			switch (select) {
			case 1:
				System.out.println("------- 회 원 가 입 -------");
				Member newMember = register(sc);
				// 키보드로 입력받을 필드 완성 후 객체로 받음

				// Member 배열에 null 찾아 삽입
				for (int i = 0; i < members.length; i++) {
					if (members[i] == null) {
						members[i] = newMember;
						System.out.println(newMember.nickName + "--- 객체가 배열에 저장됨 ---");
						break; // for 문 끝나야함!!!!
					}
				} // for null 값 찾아 객체 삽입용
				break;
			case 2:
				System.out.println("------- 로 그 인 -------");
				Member logInMember = login (sc, members); // 호출시 스캐너와 배열객체 전달
				System.out.println(logInMember.nickName + "님 환영합니다. ");
				break;
			case 3:
				System.out.println("------- 회 원 수 정 -------");
				modify();
				break;
			case 4:
				System.out.println("------- 회 원 탈 퇴 -------");
				delete();
				break;
			case 5:
				System.out.println("------- 종 료 -------");
				run = false;
				break;
			default:
				System.out.println("잘못된 입력입니다.");
			}// switch

		} // menu while
	}// menu

}// class
