package OnlineClasses;

public class ArrayMerger {
	
	public int[] merger(int a[], int b[]) {
		
		int len_c = a.length + b.length;
		int c[] = new int [len_c];
		
		for (int i = 0; i < a.length; i++) 
		{	
			c[i] = a[i];
		}
		
		for (int i = 0; i < b.length; i++) 
		{	
			c[a.length + i] = b[i];
		}	
		
		return c;		
	}
	
	public static void main(String[] args) {
		
		ArrayMerger obj = new ArrayMerger();
		int c[] = obj.merger(new int [] {1, 2, 3, 4, 5, 6}, new int [] {7, 8, 9});
		for (int i = 0; i < c.length; i++) {
			System.out.print("|"+c[i]);
		}
		System.out.print("|");
	}
	
	

}
