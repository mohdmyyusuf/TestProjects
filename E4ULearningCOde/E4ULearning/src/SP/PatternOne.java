package SP;

public class PatternOne {
	
	
	public static void fib(int len)
	{
		int a = 0;
		int b = 1; 
		int c;
		System.out.print(a + ", "+b+", ");
		for (int i = 0; i <  len; i++) {
			c = a +b ;
			System.out.print(c+", "); 
			a = b;
			b = c;
		}
		
	}
	
	public static void main(String[] args) {
		
		PatternOne.fib(8);
		
		for (int i = 1; i < 4; i++) {
			
			for (int j = 1; j<=i; j++) {
				
				System.out.print("*");
				
			}
			System.out.println(" ");
		
		}
		
		
	}

}
