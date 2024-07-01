package ch08.extended.vehicle;

public class Vehicle {
	// 탈것 이라는 최상위 클래스
	// 택시,버스,자전거,트럭 등이 자식 클래스
	String name;
	
	public void run() {
		System.out.println("탈것이 달립니다.");
	}

}
