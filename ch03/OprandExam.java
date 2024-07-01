package ch03;

public class OprandExam {

	public static void main(String[] args) {
		// 단항 연산자는 항이 한개로 처리하는 연산 기법
		// 부호 연산자(+,-) -> 양수나 음수 
		// 증감 연산자(++,--) -> 값을 증가나 감소
		// 논리 부정 연산자(!) -> True -> False
		// 비트 반전 연산자(~) -> 0 -> 1 ; 1 -> 0
		
		
		int x = -100;
		int result1 = +x; // +는 피연산자의 부호를 유지 -> -100
		int result2 = -x; // -는 피연산자의 부호를 변경 -> +100
		
		
		System.out.println(result1);
		System.out.println(result2);
        System.out.println("=========================");	
		
        int a = 10;
        int b = 10;
        int c = 0;
        
        a++;
        ++a;
        
        System.out.println("a = " + a);
		
        System.out.println("-------------------------");
        b--; // b = b(10)-1 = 9
        --b; // b = b(9) -1 = 8
        System.out.println("b = " + b); // = 8
        // ++,-- 는 앞,뒤 상관없이 무조건 1씩 증가 또는 감소
        // (++,--) 앞에 오면 먼저
        
        System.out.println("-------------------------");
        
        c = a++; // c = a -> a = a+1  
        System.out.println("a = " + a); // a = a + 1 (후행)
        System.out.println("c = " + c); // c = a (선행)
        System.out.println("-------------------------");
        
        c = ++a; // a = a+1 -> c = a
        System.out.println("a = " + a); // a = a + 1 (선행)
        System.out.println("c = " + c); // c = a (후행)
        System.out.println("-------------------------");
        
        
        c = ++a + b++ ; // a = 14 b = 8
        System.out.println("a = " + a); // 선행 : a = a(14) + 1 
        System.out.println("b = " + b); // 후행 : b = b(8) + 1 
        System.out.println("c = " + c); // 차행 : a(15) + b(8)  
        System.out.println("-------------------------");
        
        
        boolean play = true;
        System.out.println("실행중 : " + play);
        
        play = !play; // !는 결과 뒤집힌다.(논리 부정 연산자)
        System.out.println("실행중 : " + play);
        
        play = !play; 
        System.out.println("실행중 : " + play);
        
        
        

	} 

}
