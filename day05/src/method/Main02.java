package method;

public class Main02 {

	public static void main(String[] args) {
		plus( 10, 20 );
		plus( 31, 10 );
		plus( 18, 15 );
		minus( 10, 5 );
		minus( 10, 15 );
		
		
	}

	public static void plus( int x, int y) {
		int z = x + y;
		System.out.println(z);
	}
	
	// minus, int x, int y, x - y, 출력
	
	public static void minus ( int x, int y) {
		System.out.println( x- y );
	}
}
