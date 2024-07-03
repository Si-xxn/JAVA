package ch10;

public class StringBuilderExam {

	public static void main(String[] args) {
		// StringBuilder 는 신형문자열 처리 방법으로 객체의 문자열을 수정, 추가 할 수 있다.
		// 동기화되지 않는다는 점을 제외하고는 StringBuilder 클래스와 메서드가 같다. (비동기화)
		// 동기화 : 여러객체가 변수를 같이 쓰는 개념
		// 구현에서 빠르기 때문에 우선적으로 활용한다.
		
		
		StringBuilder stringBuilder = new StringBuilder(); //16개 문자열 배열 생성(기본 값)
		StringBuilder stringBuilder1 = new StringBuilder("Hello "); // 6개 문자열 배열
		StringBuilder stringBuilder2 = new StringBuilder("Hello "); // 50 개의 문자열 배열
		
		stringBuilder1.append("Programming"); // Hello Programming 문자열
		System.out.println(stringBuilder1);
		
		stringBuilder1.insert(6,"Java ");
		System.out.println(stringBuilder1);
		
		stringBuilder1.replace(1, 4, "Good");
		System.out.println(stringBuilder1);
		
		stringBuilder1.delete(1,5);
		System.out.println(stringBuilder1);
		
		stringBuilder1.reverse();
		System.out.println(stringBuilder1);
		
		System.out.println(stringBuilder1.equals(stringBuilder2)); // equals 재정의 안됨

	}

}
