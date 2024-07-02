package ch09.interfaceExam.extended;

public class BirdExam {

	public static void main(String[] args) {
		// 다중상속 인터페이스 테스트
		
		Flamingos flamingos = new Flamingos();
		flamingos.eat();
		flamingos.flying();
		flamingos.sound();
		
		System.out.println("_________________________");
		
		Fly fly = flamingos; // 업캐스팅
		
		fly.flying();
		fly.land();
		fly.takeOff();
		// fly.eat(); 부모가 다름
		
		Animal animal = flamingos;
		animal.breath();
		animal.dispose();
		animal.eat();
		// animal.land(); 부모가 다름
		
		

	}

}
