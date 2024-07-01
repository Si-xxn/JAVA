package ch04;

public class ForEachExam {

	public static void main(String[] args) {
		// ForEach 는 인덱스를 사용하지 않는다.
		// 정의된 변수에 값이 들어간다. 
		// 배열에선 처음 값 부터 마지막 값 까지 변수를 통해서 가져온다. 
		
		int[]scores=new int[] {95, 71, 84, 93, 87};
		
		for(int i : scores) { // for each 문
			// 배열 처음부터 마지막 까지 반복해서 값을 i에 넣는다.
			
			System.out.println("값 : " +i);
			
		}
		String[]name=new String[] {"엠비씨", "아카데미", "컴퓨터", "교육센터"};
		
		for(String i : name) {
			System.out.print(i + " ");
		}

	}

}
