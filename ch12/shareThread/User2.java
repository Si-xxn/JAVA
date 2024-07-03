package ch12.shareThread;

public class User2 extends Thread{ // 스레드 상속받음
	// 필드
	private Calculator calculator ;
	
	// 기본 생성자
	// 메서드
	public void setCalculator(Calculator calculator) {
		this.setName("User2");
		this.calculator = calculator;
	}
	
	public void run() {
		calculator.setMemory(50);
	}
	

}
