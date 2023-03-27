package multi;

public class Main05 {

	public static void main(String[] args) {
		// 문1. 
		// 구구단 (2~9) 결과값을 출력, 2중 while문으로 출력
		
		int i = 2;
		int j = 1;
		
		while( i <=9 ) {
			while( j <10 ) {
			int k = i * j;
			System.out.println( k );
			j++;
			} 
			
			if( i < 9 ) {
				System.out.println( "---" );
			}
			i++;
			j = 1; // j값 1로 재할당
			}
		

		System.out.println("-------------------");
		// 문2. for
		// 1~10까지의 숫자 합
		int sum = 0;
		
		for( int i1 = 1; i1 <= 10; i1++ ) {
			sum += i1;
		} System.out.println("1~10까지의 홀수의 합" + sum);
		System.out.println("-------------------");
		
		// 문3. for
		// 1~10까지의 홀수의 합
		int sum2 = 0;
		for( int i2 = 1; i2 <= 10; i2++ ) {
			if( i2 % 2 == 1 ) {
				sum2 += i2;
			}
		}
		System.out.println("1~10까지의 홀수의 합" + sum2);
		System.out.println("-------------------");
		
		
		// 문4. for 
		//1~10까지의 짝수의 합
		int sum3 = 0;
		for( int i2 = 1; i2 <= 10; i2++ ) {
			if( i2 % 2 == 0 ) {
				sum3 += i2;
			}
		}
		System.out.println("1~10까지의 짝수의 합" + sum3);
		System.out.println("-------------------");
		
		
		
		/*
		 * 문5. (8*8)
		 * ★★★★★★★★
		 * ★★★★★★★★
		 * ★★★★★★★★
		 * ★★★★★★★★
		 * ★★★★★★★★
		 * ★★★★★★★★
		 * ★★★★★★★★
		 * ★★★★★★★★
		 * System.out.println("★")  -> ln 출력
		 * System.out.print("★")  ->  띄어쓰기 없이 출력
		 */
		for( int i2 = 0; i2 <= 7; i2++ ) {
			for( int j2 = 0; j2 <= 7; j2++ ) {
				System.out.print("★");
			}
			System.out.println("");
		}
		System.out.println("--------------------------");
		
		/*
		 * 문6.
		 * 	★★★★★★★★
			★★★★★★★
			★★★★★★
			★★★★★
			★★★★
			★★★
			★★
			★
			*/
		
		for( int i2 = 0; i2 <= 7; i2++ ) {
			for( int j2 = i2; j2 <= 7; j2++ ) {
				System.out.print("★");
			}
			System.out.println("");
		}
		System.out.println("--------------------------");
		
		
		
		/*
		 * 문7.
		 * 	★
			★★
			★★★
			★★★★
			★★★★★
			★★★★★★
			★★★★★★★
			★★★★★★★★
		 */
		for( int i2 = 7; i2 >= 0; i2-- ) {
			for( int j2 = i2; j2 <= 7; j2++ ) {
				System.out.print("★");
			}
			System.out.println("");
		}
		System.out.println("--------------------------");
		
		
		
		
		/*
		 * 문8. while
		 * "10번 찍어 안넘어 가는 없다."
		 * [결과값]
		 * 나무를 1번 찍었습니다.
		 * 나무를 2번 찍었습니다.
		 * ...
		 * 나무를 10번 찍었습니다.
		 * 나무가 넘어갑니다.
		 */
		
		int treeHit = 0;
		while( true ) {
			treeHit++;
			System.out.println("나무를 "+ treeHit + "번 찍었습니다.");
			if( treeHit >= 10 ) {
			break;
		} System.out.println("나무가 넘어갑니다.");
		} 		
		
		System.out.println("-------------------------");
		
		int treeHit2 = 0;
		while( treeHit2 < 10 ) {
			treeHit2++;
			System.out.println("나무를 "+ treeHit2 
							+ "번 찍었습니다.");
			if( treeHit2 == 10 ) {
			System.out.println("나무가 넘어갑니다.");
		} 
		} 
					
		
		
		
	}

}

