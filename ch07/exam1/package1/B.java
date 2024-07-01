package ch07.exam1.package1;

public class B {
	// A와 같은 패키지
	
	A a; // 필드
	A a1 = new A(true); // public 생성자 사용
	A a2 = new A(2); // default 생성자
	// A a3 = new A("문자열"); // private 생성자-> 같은 클래스에서만 사용 가능

}
