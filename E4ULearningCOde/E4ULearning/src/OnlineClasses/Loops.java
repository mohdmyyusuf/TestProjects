package OnlineClasses;

public class Loops {
	
	public static void main(String[] args) {
		
		int tableNum = 12345;
		int digit = 0;
		int revnum = 0;
		
		
		while(tableNum>0) 
		{
			digit = tableNum%10;			
			revnum = revnum*10+digit;
			tableNum = tableNum/10;
			//System.out.println(tableNum);
		}
		System.out.println(revnum);
		/*int  i = 11;
		float j = 0;
		for (i = 1, j = 5; true; i++, j--) 
		{	
			System.out.println("table value");
			System.out.println(tableNum*i);
		}
		
		//System.out.println("Test");
		
		do{
			System.out.println("do table value");
			System.out.println(tableNum*i);
			
		} while (i <= 10&j>i);
		
		while (i <= 10&j>i) {
			
			System.out.println("while table value");
			System.out.println(tableNum*i);
			int base = 5;
		int pow = 3;
		int fval = 1;
		for (int j = 1; j <=pow; j++) {
			
			 fval = fval*base;
		}
		
		System.out.println(fval);
			
		}
		
		
		
	*/
		}

}
