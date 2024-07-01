package ch02;

public class LongExam {

	public static void main(String[] args) {
		// long타입은 int타입의 2배인 64bit 값을 갖는다.
		// 대부분 금융, 은행, 증권, 등 돈에 관련된 변수타입으로 사용된다. 
		// 초기값 입력시 int와 차이를 주기 위해 숫자뒤에 l또는L을 붙인다. (대문자 선호)
		
		long var1 = 10; //int 범위에서는 생략 가능
		long var2 = 20L;
		long var3 = 2222222222L; // int범위 초과지 L은 필수!
		//The literal 2222222222 of type int is out of range (인트범위 넘어섬)
	}

}
