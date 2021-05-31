package OnlineClasses;

public class ThisKeywordExpl {
	
	int a;
	int b;
	
	ThisKeywordExpl(int a){
		
		this.a = a;
	}
	
	public static void main(String[] args) {
		
		ThisKeywordExpl obj = new ThisKeywordExpl(5);
		ThisKeywordExpl obj1 = new ThisKeywordExpl(6);
		System.out.println(obj.a);
		System.out.println(obj1.a);
		
		
	}
	

}
