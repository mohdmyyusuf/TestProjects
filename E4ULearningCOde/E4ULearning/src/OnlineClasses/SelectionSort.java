package OnlineClasses;

public class SelectionSort {
	
	
	public int [] arrSort(int a[]) {
		
		int min, temp=0;
		for (int i = 0; i < a.length; i++) 
		{  
			min = i;
			for (int j = i+1; j < a.length; j++) 
			{
				if (a[j]<a[min]) 
				{					
					min = j;					
				}								
			}
			temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
		return a;
	}
	
	public static void main(String[] args) {
		
		SelectionSort obj = new SelectionSort();
		int farr[]= obj.arrSort(new int [] {6, 1, 2, 3, 5, 4});
		for (int i = 0; i < farr.length; i++) {
			System.out.println(farr[i]);
			
		}
		
	}

}
