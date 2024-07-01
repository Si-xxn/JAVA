package ch08.extended.people;

public class Student extends People {
// 필드
	public int studentNo;
	

	
	// 생성자
	public Student (String name, String ssn, int studentNo) {
		// 커트텀생성자 Student student = new Student("이름",2406);
		//this.name=name;
		//this.ssn = ssn;
		super(name,ssn);
		this.studentNo=studentNo;
	}
	
	// 메서드
}
