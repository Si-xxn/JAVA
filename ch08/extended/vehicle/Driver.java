package ch08.extended.vehicle;

public class Driver{
	// 운전자 서비스 클래스
	
	public void drive(Vehicle vehicle) {
		// Vehicle vehicle = new Vehicle();
		vehicle.name = "탈것";
		
		vehicle.run();
		Vehicle vehicle1 = new Bus(); // 업캐스팅 
		Bus bus = (Bus) vehicle1;// (Bus) 강제타입 변환 -> 다운캐스팅
		bus.name = "시내버스";
		bus.type = "전기형";
		bus.busCard();
		
		Vehicle vehicle2 = new Taxi();
		Taxi taxi = (Taxi) vehicle2;
		taxi.model = "카카오택시";
		taxi.name = "가스형";
		taxi.meter();
	}
	

}
