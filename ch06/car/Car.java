package ch06.car;

public class Car {
	// 자동차 객체용 클래스
	
	
	//필드(멤버변수)
	// 고유 데이터
	String company; // 제작회사
	String model; // 모델명
	String color; // 차 색상
	int maxSpeed; // 최고 속도
	
	// 상태
	int speed; // 현재속도
	int rpm;   // 현재 엔진 회전수
	boolean start ; // 시동 유/무
	// 부품
	Body body;  // 종류(버스,4륜, 오토바이 등등)
	Engin engin; // 객체(클래스)타입
	Tire tire;
	//생성자(new) -> source -> construct using field
	public Car() {
		
	}// 기본생성자 자동으로 안됨
	
	public Car(String company, String model, String color, int maxSpeed, boolean start) {
		// super(); -> 상속에 관련된 메서드
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.start = start;
	}

	@Override //재정의코드 -> 객체를 문자열로 출력
	public String toString() {
		return "Car [company=" + company + ", model=" + model + ", color=" + color + ", maxSpeed=" + maxSpeed
				+ ", speed=" + speed + ", rpm=" + rpm + ", start=" + start + "]";
	}
	
	//메소드(동작)
	
	
	
	

}
