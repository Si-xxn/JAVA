package ch09.interfaceExam;

public class Television implements RemoteControl {
	// 리모컨 인터페이스를 사용하는 구현체
	// 필드
	private int volume; // 숫자로 된 볼륨 값

	// 기본생성자 : Television tel = new Television();

	// 메서드
	@Override // 재정의(위에서 만든 메서드를 동작시킴)
	public void turnOn() { // 추상메서드
		// 전원을 켠다
		System.out.println("tv의 전원을 켭니다.");
	}

	@Override
	public void turnOff() {
		// 전원을 끈다
		System.out.println("tv의 전원을 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		// 볼륨조절
		if (volume > RemoteControl.MAX_VOLUME) { // 볼륨이 맥스보다 크다
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		} // if 종료

		System.out.println("현재 tv 볼륨 : " + volume);

	}// setVolume

	@Override
	public void setMute(boolean mute) {
		if (mute) {
			System.out.println("Tv를 무음 처리 합니다.");
		} else {
			System.out.println("Tv를 무음 처리 해제...");
		}
	}

}// class
