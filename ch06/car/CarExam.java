package ch06.car;

public class CarExam {

	public static void main(String[] args) {
		// 객체를 호출하는 메인메소드
		Car myCar = new Car();  // 값 X
		Car yourCar = new Car("페라리","458이탈리아","노란색",350,false); // 값을 넣으면서 객체생성
		
		System.out.println("myCar" + myCar.toString());
		System.out.println("yourCar" + yourCar.toString());

	}

}
