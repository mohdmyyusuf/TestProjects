package SP;

public class ArrayProb {
	
	public static int removeDuplicateElements(int arr[], int len){  
        if (len==0 || len==1){  
            return len;  
        }  
        int[] temp = new int[len];  
        int j = 0;  
        for (int i=0; i<len-1; i++)
        {  
            if (arr[i] != arr[i+1])
            {  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[len-1];     
        // Changing original array  
        for (int i=0; i<j; i++){  
            arr[i] = temp[i];  
        }  
        return j;  
    }  
	
	public static void main(String[] args) {
		
		ArrayProb obj = new ArrayProb();
		
		int a[] = {1, 2, 3, 4, 5, 2, 8};
		int len = a.length;
		
		int x = ArrayProb.removeDuplicateElements(a, len);
		System.out.println(x);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		
		
		
	}

}
