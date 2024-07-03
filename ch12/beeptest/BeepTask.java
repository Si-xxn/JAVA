package ch12.beeptest;

import java.awt.Toolkit;

public class BeepTask implements Runnable{
	// 소리가 나는 스레드
	@Override
	public void run() { // 자바에서 만들어진 추상 메서드 재정의
		
		Toolkit toolkit = Toolkit.getDefaultToolkit(); // 객체화
		for(int i=0; i<10; i++) {
			toolkit.beep(); // 사운드로 경고음이 출력됨
			
			try {
				Thread.sleep(1000); // 1초 동안 대기
			} catch (Exception e) {
				
				e.printStackTrace();
			} 
		}// beep for
		
	}
	

}
