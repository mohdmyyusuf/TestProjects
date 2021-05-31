
public class SeriesFibo {
	
	public void fibonnaci(int num) {
		
		int n1 = 0, n2= 1, n3;
		if(num ==0) {
			System.out.println("The list dont have any items.....");                           
		}
		
		if(num == 1 )
		{
			System.out.println(n1);
		}
		
		else if(num == 2 )
		{
			System.out.println(n1+","+n2);
		}
		
		else {
			System.out.print(n1+","+n2+",");
			
			
			for (int i = 2; i < num; i++) {
				n3 = n1+n2;
				System.out.print(n3+",");
				n1 = n2;
				n2 = n3;
			}
		}
			
	}
	
	public int fiboRecursive(int n) {
		if(n==0) 
		{
			return 0;
		}
		if(n==1|| n==2) 
		{
			return 1;
		}
		
		return fiboRecursive(n-2)+fiboRecursive(n-1);
		
	}
	
	public static void main(String[] args) {
		
		SeriesFibo obj = new SeriesFibo();
		//obj.fibonnaci(10);
		for (int i = 0; i < 10; i++) {
			System.out.println(obj.fiboRecursive(i));
			System.out.println("The tete jhjh the way we ater having the things...");
			
		}
		//int res = obj.fiboRecursive(10);
		//System.out.println(res);
		
		
	}

}
