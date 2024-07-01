package ch06.singleton;

public class Singleton {
	// singleton : 개발자가 강제로 객체 1개만 만들고 싶을 때 사용
	// 대부분 보안용 코드로 업데이트용 id/pw 또는 관리자용 계정으로 활용
	
	// 필드
	private static Singleton st = new Singleton();
	// class 외부에서 new 연산자로 생성자를 호출 할 수 없도록 막아야 함.
	
	// 생성자
	private Singleton() {
		// 생성자를 호출한 만큼 객체가 생성된다.
		// 생성자 앞에 private 사용해서 막음
		
	}// 기본생성자
	
	// 메서드 -> 메서드를 통해서만 객체생성을 한다.
	static Singleton getInstance() {
		return st;
	}

}
