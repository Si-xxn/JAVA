package ch04;

public class IfDiceExam {

	public static void main(String[] args) {
		// if문 활용하여 주사위 값을 추출해본다. 
		// Math.random() 메서드는 컴퓨터 시간의 초를 활용하여 난수를 발생시킨다. 
		// double f = Math.random()/Math.nextDown(1.0);
		// double x = x1*(1.0 - f) + x2*f;

		
		
		int num = (int)(Math.random() * 6) + 1; // 1~6 사이 값이 랜덤으로 추출
		
		System.out.println("주사위 값 : " + num);

	}

}
