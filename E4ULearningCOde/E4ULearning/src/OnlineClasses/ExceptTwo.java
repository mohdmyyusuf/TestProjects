package OnlineClasses;

public class ExceptTwo {
	
	public static void main(String[] args) {
		try {
			int m = 10;
			int b = m/0;
			System.out.println(b);
			int a[] = {1, 2, 3, 4, 5};
			System.out.println(a[6]);
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			ex.printStackTrace();
			System.out.println("I am from array exceptio...");
		}
		
		catch(Exception e) {
			
			System.out.println("Not appropriate...");
			e.printStackTrace();
		}
		
		System.out.println("Test to test exception...");
		
	}

}
