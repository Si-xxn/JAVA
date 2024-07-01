package ch07.getter_setter;

public class Car {
	// 필드에 직접적인 접근을 막는다. (private)
	// 메서드를 통해 검증 후에 데이터를 보낸다.(private 제외 선언)

	// 필드
	private int speed ; // Car class 안에서만 호출

	// 생성자

	// 메서드

	void setSpeed(int speed) { // set 메서드 입력용
		// default 메소드 > 같은 패키지에서만 쓸 수 있다. 
		if (speed < 0) {
			this.speed =0;
			return;
		}else {
			this.speed = speed;
		}
	}// setter
	double getSpeed() { // 출력용
		return this.speed*0.621371; 
	}// getter
}
