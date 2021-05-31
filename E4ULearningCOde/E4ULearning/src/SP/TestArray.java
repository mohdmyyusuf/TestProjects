package SP;

import java.util.ArrayList;

public class TestArray {
	
	public void deleteDup(int a[]) {
		
		
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]==a[i+1]) 
			{				
				a[i+1] = a[i+2]; 				
			}
		}	
		
	}
	
	public static void main(String[] args) {
		
		int a[] = new int[]{1, 2, 3, 5, 5, 6, 7, 7, 9, 10};
		//ArrayList<E> testAL = new ArrayList<E>();
		TestArray obj = new TestArray();
		obj.deleteDup(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
	
		for (int i = 0; i < a.length; i++) {
			
			//testAL.add(a[i]);
		}
		
		
		
	}
	
	

}
