package ch09.interfaceExam;

public interface RemoteControl {
	// 상수 (변하지 않는 값)->초기값이 있다.
	// 타입 상수명 = 값;
	public /* static final */ int MAX_VOLUME = 10; // 최대볼륨
			// ^ 생략해도 상수 처리 된다.
	public int MIN_VOLUME = 0; // 최소볼륨
	
	// 상수 필드 : 인터페이스는 객체 사용설명서
	// 런타임시 데이터를 저장할 수 있는 필드를 선언할 수 없다.
	
	
	
	// 메서드(추상, 디폴트, 정적)
	// 추상메서드(기본값) : abstract -> 자식에게 강제로 주입{실행 문 없다.};로 끝
	public /* abstract */ void turnOn();	// 전원을 킨다.
		//    ^ 생략가능 (기본값이 추상메서드)		
	public void turnOff();					// 전원을 끔.
	public void setVolume(int volume);		// 소리 조절
	
	// 디폴트메서드 : 인스턴스 메서드용 new 로 객체 생성 가능(public 생략가능)
	/* public */ default void setMute(boolean mute) { // mute = true, false
		if(mute) {
			System.out.println("무음 처리 합니다.");
		}else {
			System.out.println("무음 처리 해제...");
		}
	}
	
	
	// 정적 메서드 : new 없이 사용되는 메서드(public 생략가능)
	/* public */ static void changeBattery() {
		System.out.println("건전지를 교환해야 합니다.");
	}
	
	
	

}
