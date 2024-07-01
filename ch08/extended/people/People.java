package ch08.extended.people;

public class People {// 부모클래스
	public String name ; // 이름
	public String ssn;	// 주민번호
	
	public People(String name, String ssn) {
		// custom 생성자 People people = new People("ddd","sss")
		// 내가 생성자를 만들면 기본 생성자는 사용할 수 없다.
		this.name = name;
		this.ssn = ssn;
	}	
	

}
