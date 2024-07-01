package ch08.extended.people;

public class MBCSchoolExam {

	public static void main(String[] args) {
		// 상속관계의 객체를 가져와 출력
		// 생성자 활용 -> 객체 생성시 초기값을 줌
		
		// 부모객체 사용
		
		People people = new People("부모", "주민번호");
		System.out.println(people.name+" "+people.ssn);
		
		Student student= new Student("자식", "주민번호",1234);
		System.out.println(student.name +"\n"+ student.ssn +"\n"+ student.studentNo);
		
		Teacher teacher = new Teacher("선생님","주민번호",123);
		System.out.println(teacher.name);
		System.out.println(teacher.ssn);
		System.out.println(teacher.employeeNo);
		
		
		
		// 다형성
		
		People multi1 = new Student("이름","주민번호",2);
		People multi2 = new Teacher("이름","주민번호",22); 
		

	}

}
