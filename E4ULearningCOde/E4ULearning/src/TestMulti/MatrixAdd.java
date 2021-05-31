package TestMulti;

public final class MatrixAdd {
	
	public int[][] addMatrix(int a[][], int b[][])
	{
		int rowsFirstMat = a.length;
		int rowsSecondMat = b.length;
		
		int colsFirstMat = a[0].length;
		int colsSecondMat = b[0].length;
		
		int c[][] = new int[rowsFirstMat][colsFirstMat];
		
		if(rowsFirstMat == rowsSecondMat && colsFirstMat == colsSecondMat ) 
		{
			for (int i = 0; i < a.length; i++) 
			{
				for (int j = 0; j < a[0].length; j++) 
				{
					c[i][j] = a[i][j]+b[i][j];					
				}				
			}				
		}
		else 
		{
			System.out.println("Matrices can not be added");
		}
				
		return c;		
	}
	
	public static void main(String[] args) {
		
		MatrixAdd obj = new MatrixAdd();
		int sumMat[][]= obj.addMatrix(new int[][] {{1, 2, 3},{4, 5, 6},{7, 8, 9}}, new int[][] {{2, 4, 6},{8, 10, 12},{14, 16, 18}});
		
		for (int i = 0; i < sumMat.length; i++) 
		{
			for (int j = 0; j < sumMat[i].length; j++) 
			{
				System.out.print(sumMat[i][j]+" ");
				
			}
			System.out.print("\n");
			
		}
		
		
	}
}
