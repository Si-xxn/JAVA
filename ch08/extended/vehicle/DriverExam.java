package ch08.extended.vehicle;

public class DriverExam {

	public static void main(String[] args) {
		// 운전자가 실행하는 코드
		
		Driver driver = new Driver();
		
		Vehicle vehicle = new Vehicle(); // 탈것 부모 객체
		vehicle.name= "탈것";
		
		driver.drive(vehicle);
		
		Bus bus = new Bus();
		
		bus.name = "시내버스";
		bus.type = "전기형";
		bus.busCard();
		driver.drive(bus); // 버스 객체 연결 (버스 운전)
		
		Taxi taxi = new Taxi();
		taxi.model = "카카오택시";
		taxi.name = "가스형";
		taxi.meter();
		driver.drive(taxi); // 택시운전 -> 택시 객체 연결

	}// main

}// class
