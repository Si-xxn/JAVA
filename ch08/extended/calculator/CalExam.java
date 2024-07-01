package ch08.extended.calculator;

public class CalExam {

	public static void main(String[] args) {
		// 
		System.out.println("구형 계산기 (부모)");
		Calculator calculator = new Calculator();
		double result1 = calculator.areaCircle(10.5);
		System.out.println("10.5의 원 면접 =" +result1);
		
		System.out.println("신형 컴퓨터(자식)");
		Computer computer = new Computer();
		double result2 = computer.areaCircle(10.5); // 재정의
		System.out.println("10.5의 원 면접 =" +result2);

		
		
	}

}
