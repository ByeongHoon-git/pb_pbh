package loop;

public class Main01 {

	public static void main(String[] args) {
		// 1부터 10까지 누적된 합
		// 1 + 2 + 3 + ... + 9 + 10 = 55
		int sum = 0;
		
		// 초기식; 조건식; 증감식;
		for ( int i = 1; i <=10; i++ ) { 
			sum += i; 
		}
		
		System.out.println("합은 : " + sum);
		
		
		
		
	}

}
