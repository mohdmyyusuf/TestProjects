package OnlineClasses;

public class InsertionSort {
	
	public int [] sortFunct(int a[]) {
		
		int temp, j;
		for (int i = 1; i < a.length; i++) {       
			
			temp = a[i]; 
			j = i;
			while (j>0&&a[j-1]>temp) {
				
				a[j] = a[j-1];
				j = j-1;
			}
			a[j] = temp;
			
		}
		
		return a;
		
	}
	
	public static void main(String[] args) {
		InsertionSort obj = new InsertionSort();
		int out[] = obj.sortFunct(new int[] {2, 1, 6, 3, 5, 4} );
		for (int i = 0; i < out.length; i++) {
			
			System.out.println(out[i]);
		}
	}

}
