package OnlineClasses;

public class ConstChaining {
	
	int n;
	ConstChaining(){		
		this(5);
		System.out.println("khali hun");		
	}
	ConstChaining(int x){
		
		this(4,5);
		System.out.println("Single value"+x);
	}
	
	ConstChaining(int a, int b){
		
		System.out.println("Product of parameter"+a*b);
		
	}
	
	public static void main(String[] args) {
		
		new ConstChaining(); 
		
	}
	
	
	

}
