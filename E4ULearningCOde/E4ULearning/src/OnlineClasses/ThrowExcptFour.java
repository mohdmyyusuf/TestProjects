package OnlineClasses;

public class ThrowExcptFour {
	
	private int a;
	
	public void setA(int x ) {
		
		if(a < 1) {
			a = 1;
		}
		else {
		this.a = x;
		}
	}
	
	public int getA() {
		
		return a;
	}
	
	public static void main(String[] args) {
		
		int age = 20;
		
		if(age <18) {
			
			throw new ArithmeticException("can not vote...");
		}
		else {
			
			System.out.println("Jai modi chacha...");
			
		}
		
	}

}
