package ch12.shareThread;

public class Calculator {
	// 공유된 계산기
	
	private int memory;

	public int getMemory() { // 값을 출력용
		return memory;
	}
//			동기화 임계영역 설정 -> 단 하나의 스레드만 실행할 수 있는 코드 
	public synchronized void setMemory(int memory) { // 값 입력용
			// ^ 임계영역 설정으로 누가 쓰고 있으면 대기
		this.memory = memory;
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("2초간 딜레이 중 예외 발생");
			//e.printStackTrace();
		}// try-catch 종료
		System.out.println(Thread.currentThread().getName()+" : "+ this.memory);
		// 2초 뒤에 메모리 필드 값 출력
	}
	
	

}
