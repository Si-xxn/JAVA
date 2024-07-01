package ch04;

public class WhileSumExam {

	public static void main(String[] args) {
		// 1~100까지의 합 구하시오 ->5050
		
		int sum=0; // 합을 구하는 상자
		int i=0;   // 반복용 상자
		while(i<=100) { // i가 100보다 작거나 같거나 조건(true)
			// 1 부터 100 까지 반복
			sum = sum+i; // sum+=i -> i값이 1~100까지 나오고 sum 이랑 더함
			i++;// i=i+1 -> 1~100까지 증가	
		}System.out.println(" 1~100까지의 합 : "+sum);
		
	}

}
