package ch08.extended.car;

public class Car {
	// 부모자동차

	// 필드
	public int speed;

	// 생성자
	public Car() {
	}

	// 기본생성자, 안쓰면 자동생성
	// Car car = new Car();
	// 메소드
	public void speedUp() {
		speed += 1; // 메서드 호출 시 속도 1씩 증가
	}
	public final void stop() {// final= 최종적
		System.out.println("자동차가 멈춥니다.");
		speed = 0;
	}
}
