package OnlineClasses;

public class InsertArray {
	
	public int[] insertArr(int a[], int pos, int ele) {
		
		for (int i = a.length-1; i >pos-1; i--) 
		{	
			a[i] = a[i-1];
		}
		a[pos-1] = ele;
		
		return a;
		
	}
	
	
	public static void main(String[] args) 
	{
		InsertArray obj = new InsertArray();
		int c[]=obj.insertArr(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9}, 5, 15);
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}

}
