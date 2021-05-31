package DataStructures;

public class ArrayInsertion {
	
	public int [] deleteArr(int a[], int delKy) {
		
		int b[] = new int [a.length-1];
		
		for (int i = 0; i < a.length; i++) 
		{
			if(delKy==a[i]) 
			{
				for (int j = i; j < a.length-1; j++) {
					a[j] = a[j+1];
				}
				break;
			}
		}
		for (int i = 0; i < b.length; i++) {
			b[i] = a[i];
		}
		return b;
	}
	
	public static void main(String[] args) {
		
		ArrayInsertion obj = new ArrayInsertion();
		int ret[] = obj.deleteArr(new int[] {2, 5, 7, 9, 6, 3, 1, 7}, 9 );
		for (int i = 0; i < ret.length; i++) {
			System.out.println(ret[i]);
		}
	}
	
	
	
	
	
	
	
	
	
	
	public int [] frontInsertion(int a[], int key, int position) {
		
		int arraylenth = a.length;
		for (int i = arraylenth-1; i < position; i--) {
			
			a[i-1] = a[i-2];
			
			
		}
		//arraylenth++;
		a[position] = key;	
		
		
		return a;
		
	}
	

}
