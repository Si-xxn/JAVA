package ch08.lineage;

import java.util.Scanner;

import ch08.lineage.DTO.Account;
import ch08.lineage.DTO.ElfDTO;
import ch08.lineage.DTO.HumanDTO;
import ch08.lineage.DTO.KnightDTO;
import ch08.lineage.service.CharacterService;
import ch08.lineage.service.LoginService;

public class LineageExam {
	public static Scanner sc = new Scanner(System.in);  // 키보드로 입력받는 객체
	public static Account[] accounts = new Account[10]; // 계정정보 배열 10칸
	public static Account loginAccount;		// 로그인 성공 시 객체
	public static KnightDTO knight = new KnightDTO();
	public static ElfDTO elf = new ElfDTO();
	public static HumanDTO humanDTO = null;
	
	static {// 생성자 대신
		
		knight.setSword("양손검");
		knight.setArmor("징박힌갑옷");
		knight.setShield("징박힌방패");
		knight.setName("양기사");
		knight.setSex("남");
		knight.setLevel("1");
		knight.setHp(5000);
		knight.setMp(50);
		knight.setMoney(500000);

		
		elf.setBow("양손활");
		elf.setDress("천사드레스");
		elf.setArrow("크리티컬화살");
		elf.setName("저요정");
		elf.setSex("여");
		elf.setLevel("1");
		elf.setHp(5000);
		elf.setMp(50);
		elf.setMoney(500000);

		Account account = new Account();
		account.setId("kkk");
		account.setPw("kkk");
		account.setNickName("kkk");
		accounts[0] = account; // 배열[0]번에 계정 객체 연결
	}// DB대신 초기값 지정

	public static void main(String[] args) {
		// 객체간의 상속을 알아본다.
		// 부모 객체는 자식 객체에게 모든 정보를 상속한다.
		// 자식 객체는 부모객체의 정보를 받아 사용하며 추가적인 정보를 생성하여 활용한다.

		System.out.println("리니지 게임을 시작합니다.");
		boolean run = true;
		while (run) {
			System.out.println("1.로그인    2.캐릭터선택    3.게임실행    4.종료 ");
			System.out.print(">> ");
			int select = sc.nextInt();
			
			switch(select) {
			case 1:
				System.out.println("------ 로 그 인 ------");
				loginAccount = LoginService.menu(sc, accounts, loginAccount);
				break;
			case 2:
				System.out.println("------ 캐릭터 선택 ------");
				CharacterService.menu(sc, loginAccount, knight, elf, humanDTO);
				break;
			case 3:
				System.out.println("------ 게 임 실 행 ------");
				break;
			case 4:
				System.out.println("------  종  료  ------");
				run = false;
				break;
			default:
				System.out.println("1 ~ 4 번 메뉴만 입력하세요.");
			}// switch
		} // while
	}// main

}// class
