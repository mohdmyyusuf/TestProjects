package OnlineClasses;

//import OnlineClasses.InsertionSort;

public class DuplicateRemoval {
	
	
	InsertionSort obj= new InsertionSort();
	
	public int [] dupRemove(int a[])
	{
		int temp[]= new int[a.length];
		obj.sortFunct(a);
		int j = 0;
		for (int i = 0; i < a.length-1; i++) {
			
			if(a[i]!= a[i+1]) {
				
				temp[j] = a[i];
				j++;
			}
			
			
		}
		temp[j] = a[a.length-1];
		
		
		return temp;	
	}
	
	public static void main(String[] args) {
		
		DuplicateRemoval obj = new DuplicateRemoval();
				int arr[] = obj.dupRemove(new int[] {1, 2, 2, 3, 4, 5, 6, 7, 8, 9, 2, 8, 5, 8, 8, 5} );
	
				for (int i = 0; i < arr.length; i++) {
					System.out.print(arr[i]);
				}
	}
	
	
	

}
