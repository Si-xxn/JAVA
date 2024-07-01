package ch07.exam1.package2;

import ch07.exam1.package1.A;
import ch07.exam1.package1.B;

public class C {
	A a; // default 다른패키지 안됨
	B b; // public 은 import 처리 -> 접근 가능
	
	A a1 = new A(true); // public
	// A a2 = new A(2); // default
	// A a3 = new A("문자열"); // private 생성자
}
