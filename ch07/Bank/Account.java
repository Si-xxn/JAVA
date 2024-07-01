package ch07.Bank;
/*
 * private String newAccountNum() { // 랜덤 계좌번호 생성 Random random = new Random();
 * // 랜덤 시스템 활용 String bankNum = "0625"; // 은행고유번호 ex)0625-****-**** int number1
 * = 0; // 랜덤숫자 출력할 때 1자리수 난수 만들어주는 역할 int number2 = 0; String randomNum1 = "";
 * // 랜덤번호 4자리 1 String randomNum2 = ""; // 랜덤번호 4자리 2
 * 
 * for (int i = 0; i < 5; i++) { number1 = random.nextInt(9); number2 =
 * random.nextInt(9); randomNum1 = Integer.toString(number1); randomNum2 =
 * Integer.toString(number2); accountNum = bankNum + "-" + randomNum1 + "-" +
 * randomNum2; } return accountNum;
 * 
 * }
 */

public class Account {
	// 계좌 정보

	// 필드
	private String name; // 계좌 주 이름
	private int phoneNum;// 계좌 주 전화번호
	private String accountNum; // 계좌번호
	private int accountPw; // 계좌 비밀번호
	private int balance; // 잔액
	
	

	public String getName() {
		return name;
	}

	public int getPhoneNum() {
		return phoneNum;
	}

	public String getAccountNum() {
		return accountNum;
	}

	public int getAccountPw() {
		return accountPw;
	}

	public int getBalance() {
		return balance;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhoneNum(int phoneNum) {
		this.phoneNum = phoneNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public void setAccountPw(int accountPw) {
		this.accountPw = accountPw;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	

	
}
