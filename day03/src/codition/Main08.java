package codition;

public class Main08 {

	public static void main(String[] args) {
		/*
		 * 문1. if문
		 * 만약 3000원(기준 값, int) 이상의 돈을 가지고 잇으면
		 * "택시를 타고 가라" 출력
		 * 그렇지 않으면 "걸어가라" 출력
		 */
		int mymony = 300;
		
		if( mymony >= 3000 ) {
			System.out.println("택시타고 가라");
		} else {
			System.out.println("걸어가라");
		}
	
		System.out.println("--------------------------------");
		
		
		/*
		 * 문2. if문 
		 * 3000원 이상 있거나, 카드가 있으면
		 * "택시를 타고 가라" 출력
		 * 그렇지 않으면 "걸어가라" 출력
		 */
		int mony = 1000;
		boolean hasCard = false;
		
		if( mony >= 3000 || hasCard ) {
			System.out.println("택시타고 가라");
		} else {
			System.out.println("걸어가라");
		}
		  
		
		System.out.println("--------------------------------");
		
		/*
		 * 문3. if문
		 * 어떤 특정 정수 값 a(변수명)가 
		 * 짝수이면 "짝수", 홀수이면 "홀수" 출력
		 */
		
		int num3 = '2';
		 
		if ( num3 %2 == 0  ) {
			System.out.println("짝수입니다");
		} else {
			System.out.println("홀수입니다");
		}
		
		System.out.println("--------------------------------");
		
		
		/*
		 * 문4. if문
		 * 어떤 특정 서로다른 정수값 a1, b1, c1의 최대값 을 구하여라.
		 * a1 = 10, b1 = 20, c1 = 9;
		 */
		int a1 = 120, b1 = 50, c1 = 45;
		int max = 0;
		
		
		if( a1 > b1 && a1 > c1 ) {
			max = a1;
		} else {
			if( b1 > c1 ) {
	 			max = b1;
			} else {
				max = c1;
			}
		}
		
		System.out.println("최댓값 : " + max);
		
		System.out.println("--------------------------------");
		
		
		/*
		 * 문제5. if문
		 * 수학 점수 가 90점 이상이면 "A학점"
		 * 수학 점수 가 80점 이상이면 "B학점"
		 * 수학 점수 가 70점 이상이면 "C학점"
		 * 수학 점수 가 60점 이상이면 "D학점"
		 * 나머지는 "F힉점"
		 */
		int mat = 70;
			
			if ( mat >= 90 ) {
				System.out.println("A학점");
			} else if ( mat >= 80 ) {
				System.out.println("B학점");
			} else if ( mat >= 70 ) {
				System.out.println("C학점");
			} else if ( mat >= 60 ) {
				System.out.println("D학점");
			} else {
				System.out.println("F학점");
			}
		
			System.out.println("--------------------------------");
			
		/*
		 * 문6. switch-case
		 * 특정 정수 num의 값이 1이면 "축구",
		 * 2이면 "농구", 3이면 "야구",
		 * 4이면 "배구", 그 외에는 "배드민턴"이 출력
		 */
		int num = '4';
		
		switch ( num ) {
			case 1 : 
				System.out.println("축구");
				break;
			case 2 : 
				System.out.println("농구");
				break;
			case 3 : 
				System.out.println("야구");
				break;
			case 4 : 
				System.out.println("배구");
				break;
			default :
				System.out.println("배드민턴");
				break;
		}
			
			
		System.out.println("--------------------------------");
			
		/*
		 * 문7. switch-case
		 * 특정 정수의 값이 3이면 "안녕"이 세줄,
		 * 2이면 "안녕"이 두줄, 1이면 "안녕"이 한줄,
		 * 그 외는 "잘가" 출력
		 */
		int num1 = 3;
		
		switch ( num1 ) {
			case 3 :
			System.out.println("안녕");
			case 2 :
				System.out.println("안녕");
			case 1 :
				System.out.println("안녕");
				break;
			default :
				System.out.println("잘가");
				break;
		}
		
	}

}
