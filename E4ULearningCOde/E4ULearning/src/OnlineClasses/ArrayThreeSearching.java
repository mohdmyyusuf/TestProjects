package OnlineClasses;

public class ArrayThreeSearching {
	
	//Method input = array, search key....Returns index
	
	public int searchArr(int a[], int key) {
		
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]==key) {
				
				int position = i+1;
				return position;
			}
			
		}		
		return -1;		
	}
	
	public static void main(String[] args) {
		
		ArrayThreeSearching obj = new ArrayThreeSearching();
		int index = obj.searchArr(new int[] {1, 2, 3, 4, 5, 6, 8, 9}, 2);
		System.out.println("The element was found at "+index+" position");
		
		
	}

}
