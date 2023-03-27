package loop;

public class Main07 {

	public static void main(String[] args) {
		/*
		 * 구구단 7단
		 * 7
		 * 14
		 * ...
		 * 63
		 */
		
		int result = 0;
		int i = 1;
		
		do {
			result = i * 7;
			
			System.out.println(result);
			i++;
		} while ( i <= 9 );
		
		
	}

}
