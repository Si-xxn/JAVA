package ch06.circle;

public class Circle3Exam {

	public static void main(String[] args) {
		// 매개값이 두개인 생성자로 결과 출력

		Circle circle = new Circle(30, "1");

		// 동장
		double result = circle.getArea(); // 메소드 호출(동작 -> 리턴)

		// 출력
		System.out.println("원의 넓이 : " + circle.radius);
		System.out.println("작성자 : " + circle.name);
		System.out.println("동작 결과 : " + result);

	}

}
