package OnlineClasses;

public class RecursionTest {
	
	static void table(int num, int lim) {
		
		if(lim!=1) {
			table(num, lim-1);
		}
		System.out.println(num*lim);
	}
	
	public static void main(String[] args) {
			
		RecursionTest.table(2, 10);
		
	}

}
