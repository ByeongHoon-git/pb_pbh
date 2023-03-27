package Class;

class Result{
	int plus( int x, int y ) {
		return x + y;
	}
	
	int minus( int x, int y) {
		return x - y;
	}
	
	int mucous( int x, int y ) {
		return x * y;
	}
	int division( int x, int y ) {
		int result = 0;
		
		if( y != 0) {
			// 0으로 나울 수 없다.
			result = x / y;
		}
		return result;
	}
}


/*
 *  계산기 클래스 생성,
 *  +. -, /, * 메서드를 각각 생성, int x, int y -> 파라미터 2개, return
 *  main() -> 각각의 메서드 결과 출력
 */


public class Main05 {

	public static void main(String[] args) {
		
		Result c = new Result();
		System.out.println("100 + 5 : " + c.plus(100, 5));
		
		Result c2 = new Result();
		System.out.println("100 - 5 : " + c2.minus(100, 5));
		
		Result c3 = new Result();
		System.out.println("100 * 5 : " + c3.mucous(100, 5));
		
		Result c4 = new Result();
		System.out.println("100 / 5 : " + c4.division(100, 5));
		
	
		
	}

}
