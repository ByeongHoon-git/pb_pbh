package loop;

public class Main02 {

	public static void main(String[] args) {
		// 1 + 2 + ... + 99 + 100 =?
		int sum = 0;
		for ( int i = 1; i<=100; i++ ) {
			sum += i;
		}
		System.out.println("sum : " + sum);
	
		System.out.println("--------------------------");
		
		
		// 2 + 3 + .... + 98 + 99 = ?
		
		int sum2 = 0;
		for( int i = 2; i <=99; i++ ) {
			sum2 += i;
		}
		System.out.println("합2 : " + sum2);
		
		
		
		
		
	}

}
