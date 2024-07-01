package ch07.Bank;

import java.util.Random;
import java.util.Scanner;

public class BankExam {

	public static Scanner sc = new Scanner(System.in); // 키보드로 입력받는 객체 생성
	private static Account[] accounts = new Account[100]; // 은행 회원 정보 저장 배열 객체

	public static void main(String[] args) {
		// 은행 시스템
		boolean run = true;
		while (run) {
			System.out.println("========= B A N K =========");
			System.out.println("1.계좌생성 \t2.계좌목록 \n3.예금입금 \t4.예금출금 \n5.종 료");
			System.out.print(">> ");
			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				System.out.println("------ 계 좌 생 성 ------");
				createMenu();
				break;
			case 2:
				System.out.println("------ 계 좌 목 록 ------");
				accountList();
				break;
			case 3:
				System.out.println("------ 예 금 입 금 ------");
				deposit();
				break;
			case 4:
				System.out.println("------ 예 금 출 금 ------");
				withdraw();
				break;
			case 5:
				System.out.println("------  종   료  ------");
				run = false;
				break;
			default:
				System.out.println("1 ~ 5 번 메뉴만 입력하세요.");
				run = false;
			}
		}
	}

	private static void withdraw() {
		System.out.print("계좌번호(-포함) : ");
		String accountNum = sc.next();
		System.out.println("비밀번호(4자리) : ");
		int pw = sc.nextInt();
		Account account = findAccount(accountNum);
		if (account == null) {
			System.out.println("해당 계좌번호가 존재하지 않습니다. 계좌번호를 확인하세요.");
			return;
		} else if (account != null && account.getAccountPw() != pw) {
			System.out.println("비밀번호가 맞지 않습니다. 다시 입력하세요.");
			return;
		}
		System.out.print("출금액 : ");
		int money = sc.nextInt();
		if (money > account.getBalance()) {
			System.out.println("---- 잔액이 부족합니다. 현재잔액 : " + account.getBalance() + " 원 ----");

		} else {
			account.setBalance(account.getBalance() - money);
			System.out.println(money + " 원 출금되었습니다. 현재잔액 : " + account.getBalance() + " 원 ----");
		}

	}

	private static void deposit() {
		System.out.print("계좌번호(-포함) : ");
		String accountNum = sc.next();
		Account account = findAccount(accountNum);
		if (account == null) {
			System.out.println("해당 계좌번호가 존재하지 않습니다. 계좌번호를 확인하세요.");
			return;
		}
		System.out.print("입금액 : ");
		int money = sc.nextInt();
		account.setBalance(account.getBalance() + money);
		System.out.println(money + " 원 이 입금되었습니다.");
		System.out.println("--- 잔액 : " + account.getBalance() + " ---");
	}

	private static void createMenu() {
		System.out.println();
		System.out.print("이 름 : ");
		String name = sc.next();
		System.out.print("전화번호 : 010");
		int phoneNum = sc.nextInt();
		String newAc = newAccount();
		System.out.println("계좌번호 : "+ newAc);
//		String accountNum = sc.next();
		System.out.print("계좌 비밀번호 : ");
		int accountPw = sc.nextInt();
		System.out.print("입금액 : ");
		int balance = sc.nextInt();
		Account account = new Account();
		account.setName(name);
		account.setAccountNum(newAc);
		account.setAccountPw(accountPw);
		account.setBalance(balance);
		account.setPhoneNum(phoneNum);
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] == null) {
				accounts[i] = account;
				System.out.println("계좌번호 " + account.getAccountNum() + " " + account.getBalance() + " 원");
				break;
			}
		}

	}

	private static String newAccount() {
		String newAccount = null;
		Random random = new Random(); // 랜덤 시스템 활용
		String bankNum = "0625"; // 은행고유번호
		// ex)0625-****-****
		int number = 0; // 랜덤숫자 출력할 때 1자리수 난수 만들어주는 역할 String
		String randomNum1 = ""; // 랜덤번호 4자리 1
		String sum = "";
		String sum1 = "";

		for (int i = 0; i < 5; i++) {
			number = random.nextInt(9); // 랜덤함수 -> 0~9까지4자리
			randomNum1 = Integer.toString(number); // 1자리 난수 String 형으로 변환
			sum += randomNum1; // 첫번째 4자리숫자
			sum1 += randomNum1;// 두번째 4자리숫자 }
			newAccount = bankNum + "-" + sum + "-" + sum1;

		}
		return newAccount;

	}

	private static void accountList() {
		System.out.print("전화번호 : 010");
		int num = sc.nextInt();
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null && accounts[i].getPhoneNum() == num) {
				System.out.println("계좌번호 : " + accounts[i].getAccountNum());
			}
		}
		System.out.println("----------------------------------");
	}

	private static Account findAccount(String accountNum) {
		Account account = null;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null) {
				String dbAccountnum = accounts[i].getAccountNum();
				if (dbAccountnum.equals(accountNum)) {
					account = accounts[i];
					break;
				}
			}
		}
		return account;
	}// 계좌 찾는 메서드

}
