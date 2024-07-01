package ch08.extended.vehicle;

public class Taxi extends Vehicle {// 탈것 -> 자식객체
	
	String model; // 택시 회사 종류(카카오, T, 수원 등등)

	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}
	
	public void meter() {
		System.out.println("요금을 측정합니다.");
	}

}
