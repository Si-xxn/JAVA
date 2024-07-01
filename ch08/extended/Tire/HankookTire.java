package ch08.extended.Tire;

public class HankookTire extends Tire {// 자식 타이어

	public HankookTire(int maxRotation, String location) {
		super(maxRotation, location);
		// oem 타이어에서 만든 규격대로 생성자 만듬
	}

	@Override
	public boolean roll() {// 달린면서 마일리지 소모
		accRotation += 3;
		if (accRotation < maxRotation) {// 타이어 소모 측정
			System.out.println(location + " 위치에 한국타이어 수명 : " + (maxRotation - accRotation) + "마일리지");
			return true;
		} else {
			System.out.println("**** 경 고 ****");
			System.out.println(location + " 위치에 한국타이어가 펑크 되었습니다.");
			return false;
		}
	}

}
