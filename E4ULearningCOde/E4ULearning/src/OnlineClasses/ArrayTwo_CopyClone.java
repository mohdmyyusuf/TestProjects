package OnlineClasses;

public class ArrayTwo_CopyClone {
	
	public static void main(String[] args) {
		
		int a[] = new int [] {1, 2, 3, 12, 5, 6, 7, 8, 9};
		int b[];
		
		b = a.clone();  //copied array a to b
		
		
		for (int i = 0; i <  b.length; i++) {
			b[i] = b[i]*2;
			System.out.println(a[i]);
			//System.out.println("---");
		
			
		}
		
		for (int x:b) {
			System.out.println(x);
		}
		
	}

}
