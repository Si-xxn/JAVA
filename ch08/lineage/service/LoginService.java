package ch08.lineage.service;

import java.util.Scanner;

import ch08.lineage.DTO.Account;

public class LoginService {
	// 로그인 부메뉴
	
	public static Account menu(Scanner sc,Account[] accounts, Account loginAccount) {
		System.out.println("1.로그인   2.회원가입   3.회원수정   4.나가기");
		System.out.print(">> ");
		int select = sc.nextInt();
		
		switch(select) {
		case 1:
			System.out.println("------ 로 그 인 ------");
			System.out.print("ID : ");
			String id = sc.next();
			System.out.print("PW : ");
			String pw = sc.next();
			Account account = new Account();
			account.setId(id);
			account.setPw(pw);// 새로만든 account 객체에 id,pw 넣음
			
			//배열값과 비교
			for(int i=0; i<accounts.length; i++) {
				if(accounts[i]!= null) {
					if(accounts[i].getId().equals(account.getId())) {
						System.out.println("해당하는 아이디가 있습니다.");
						if(accounts[i].getPw().equals(account.getPw())) {
							System.out.println("해당하는 비밀번호가 있습니다.");
							loginAccount = accounts[i];
							System.out.println("로그인 성공");
							break;
						}else {
							System.out.println("해당하는 비밀번호가 없습니다.");
						}
					}else {
						System.out.println("해당하는 아이디가 없습니다.");
					}
				}else{  // 빈객체 비교
					System.out.println("해당하는 정보가 없습니다.");
					break;
				}
			}
			
			break;
		case 2:
			System.out.println("------회 원 가 입------");
			break;
		case 3:
			System.out.println("------ 로 그 인 ------");
			break;
		case 4:
			System.out.println("------ 로 그 인 ------");
			break;	
		}// switch
		return loginAccount;
	}// menu

}// class
