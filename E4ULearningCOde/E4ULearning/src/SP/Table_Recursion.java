package SP;

public class Table_Recursion {
	
	public void table(int num, int tl) {
		
		int itr = 1;
		while(itr <=tl) {
			
			System.out.println(num*itr);
			itr++;
		}
		
	}
	
	public static void tab(int x, int y) {
		
		if(y!=1) 
		{
			tab(x, y-1);	
		}
		System.out.println(x*y);
		
	}
	
	public static void main(String[] args) {
		Table_Recursion obj = new Table_Recursion();
		//obj.table(5, 10);
		
		tab(2, 1);
		
	}

}
