package loop;

public class Main03 {

	public static void main(String[] args) {
		/*
		 * 구구단 7단
		 * 결과 값 :
		 * 7
		 * 14
		 * 21
		 * ...
		 * 63
		 */
		
		int result = 0;
		
		System.out.println("구구단 7단 결과 값 : ");
		 for( int i = 1; i <= 9; i++  ) {
			 result = i * 7; 
			 System.out.println(result);
		 }
		
		
	}

}
