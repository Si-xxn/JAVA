package ch15.functional;

public class MyFunctionExam {

	public static void main(String[] args) {
		// 원래는 인터페이스를 사용하기 위해서 구현 클래스가 있어야 한다.
		// 또한, 익명의 구현 객체를 이용하기도 한다.

		MyFunction myFunction; // 인터페이스를 변수에 타입으로 설정

		myFunction = (x,y) -> {
			int result = x * y; // 실행문 1
			return result; // 실행문 2

		}; // 익명의 구현 객체 -> 동작에 실행코드 주입
		int result = myFunction.method(10,20); // 실행문 2개인 메서드 실행
		System.out.println(result);
		System.out.println("-----------------------------------------");
		System.out.println(myFunction.method(10,20));

		System.out.println("-----------------------------------------");

		myFunction = (x,y) ->  x*y;
		System.out.println(myFunction.method(20, 30)); // 실행문 1개로 압축시 {} 생략 가능하다.

		myFunction = (x,y) -> sum(x,y);
		System.out.println(myFunction.method(20, 30));
	}// main
	
	public static int sum(int x, int y) {
		return (x*y);
	}// i

}// class
