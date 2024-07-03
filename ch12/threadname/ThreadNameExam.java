package ch12.threadname;

public class ThreadNameExam {

	public static void main(String[] args) {
		// 스레드의 이름을 정하면 버그 수정에 좋다.
		Thread mainThread = Thread.currentThread(); 
		// 사용중인 스레드 객체 얻기
		System.out.println("mainThread.getName() : " + mainThread.getName());
		// 메인 스레드의 객체를 가져와 이름을 출력하는 메서드 실행
		
		ThreadA thA = new ThreadA(); // 스레드A 객체 만듬
		System.out.println("new ThreadA().getName : "+thA.getName());
		thA.start(); // 스레드A 시작
		
		ThreadB thB = new ThreadB(); // 스레드A 객체 만듬
		System.out.println("new ThreadB().getName : "+thB.getName());
		thB.start(); // 스레드A 시작
		
		
		

	}

}
