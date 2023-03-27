package method;

public class Main03 {

	public static void main(String[] args) {
		int result = plus( 10 , 15 );
		System.out.println(result);
		System.out.println(plus( 10 , 15 ));
		
		int result2 = minus( 8 , 15 );
		System.out.println( result2 );
		System.out.println(minus( 8 , 15 ));
	}
	
	public static int plus( int x, int y ) {
		int z = x + y;
		return z; 
		
	}
	
	// minus, int x, int  y, return x - y,
	// main에서 minus 호출한 결과값 출력
	public static int minus( int x, int y ) {
		return x - y; 
	}
	
}
