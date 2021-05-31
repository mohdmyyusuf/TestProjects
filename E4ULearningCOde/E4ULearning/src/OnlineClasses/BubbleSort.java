package OnlineClasses;

public class BubbleSort {
	
	public int [] sortArrayBubb(int a[]) 
	{	
		int temp;
		for (int i = 0; i < a.length; i++) 
		{
			int flag = 0;
			for (int j = 0; j < a.length-1; j++) {
				
				if(a[j] > a[j+1])
				{
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					flag = 1;
				}
				if(flag ==1) 
				{
					break;
				}
			}
			
			
			
		}
		
		return a;
		
	}
	public static void main(String[] args) {
		
		BubbleSort obj = new BubbleSort();
		int sorted[] = obj.sortArrayBubb(new int [] {6, 2, 1, 3, 5, 4});
		
		for (int i = 0; i < sorted.length; i++) {
			System.out.println(sorted[i]);
		}
		
	}

}
