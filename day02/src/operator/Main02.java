package operator;

public class Main02 {

	public static void main(String[] args) {
		int source = 100;
		
		System.out.println("int source = 100  ");
		source += 100;  // source = source + 100; 200
		System.out.println("source += 100     " + source);
		
		source -= 50;   // 150
		System.out.println("source -= 50      " + source);
		
		source *= 2;	// 300
		System.out.println("source *= 2       " + source);

		source /= 100;	// 3
		System.out.println("source /= 100     " + source);
		
		source %= 2;	// 1
		System.out.println("source %= 2       " + source);
		
	}

}
