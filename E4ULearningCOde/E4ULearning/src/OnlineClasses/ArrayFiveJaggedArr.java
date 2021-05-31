package OnlineClasses;

public class ArrayFiveJaggedArr {
	
	public int searchArr(int a[], int key) 
	{
		for (int i = 0; i < a.length; i++) 
		{
			
			if(a[i]==key) {
			 return i;
				
			}
	}
		return -1;
}
	
	
	public int [] delArray(int a[], int key) {
		
		int elements = a.length;
		int loc = searchArr(a, key);
		for (int i = loc; i < a.length-1; i++) {
			
			a[i] = a[i+1];
		}
		return a;	
	}
	
	public static void main(String[] args) 
	{	
		int srca[] =new int [] {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int desta[];
	      
	    ArrayFiveJaggedArr obj = new ArrayFiveJaggedArr();
	    desta = obj.delArray(srca, 6);
	
	for (int i = 0; i < desta.length-1; i++) 
	{
		System.out.println(desta[i]);
	}
		
		
	}

}
