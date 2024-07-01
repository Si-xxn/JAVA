package ch06.Ranking;

public enum Ranking { // 열거타입생성
	// enum 타입은 열거타입으로 자동으로 숫자 판단이 가능한 코드
	// enum 활용되는 부분은 제한된 문자열을 숫자로 판단하는 역할을 주로 한다. 
	// 열거타입에 선언된 상수는 모든 문자 대문자 사용(여러 문자인 경우 _ 으로 구분)
	
	GUEST,  //0
	MEMBER, //1
	VIP,    //2
	VVIP,   //3
	VVVIP   //4

}
