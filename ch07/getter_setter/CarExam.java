package ch07.getter_setter;

public class CarExam {

	public static void main(String[] args) {
		// 
		Car myCar = new Car();
		
		// myCar.speed = 10;
		// private 접근 제한자의 영향으로 직접 접근 불가능
		
		// 검증된 동작인 메서드로 접근하여 데이터를 삽입
		myCar.setSpeed(10);
		
		// System.out.println("속도"+myCar.speed);
		
		System.out.println("속도 : "+ myCar.getSpeed());

	}

}
