package ch12.beeptest;



public class BeepExam {

	public static void main(String[] args) {
		// 소리와 자막이 동시에 나오고 싶은 프로그램 -> 단일 스레드(한줄)
		Runnable beepTask = new BeepTask();
		// 스레드 run()  객체 생성
		Thread th1 = new Thread(beepTask);
		// run 메서드가 포함된 객체를 스레드에 넣음
		th1.start();
		
		
		for(int i=0; i<10; i++) {
			System.out.println("띠리링~!");
			
			try {
				Thread.sleep(1000); // 1초 동안 대기
			} catch (Exception e) {
				
				e.printStackTrace();
			} 
		}// print for
		

	}

}
