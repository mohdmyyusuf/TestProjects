package DataStructures;

public class DAMain {
	
	public static void main(String[] args) {
		ArrayInsertion obj = new ArrayInsertion();
		int a[]= obj.frontInsertion(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9}, 11, 0);
		
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println(a[i]);
		}
	}

}
