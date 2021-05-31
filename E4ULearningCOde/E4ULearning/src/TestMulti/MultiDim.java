package TestMulti;

public class MultiDim {
	
	public static void main(String[] args) {
		
		System.out.println("The list");
		
		int a[][][] = new int[][][]{{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {2, 4, 6}, {3, 5, 7}, {9, 8, 7}}};

		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				for (int k = 0; k < a[i][j].length; k++) 
				{
					System.out.print(a[i][j][k]);
					System.out.print(" | ");
				}
				
			}
			
		}
		
		
	}

}
