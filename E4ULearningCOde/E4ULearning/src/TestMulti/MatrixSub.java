package TestMulti;

public class MatrixSub 
{
	public int[][] subMatrix(int a[][], int b[][])
	{		
		int firstMatRow = a.length;
		int secondMatRow = b.length;
		
		int firstMatCol = a[0].length;
		int secondMatCol = b[0].length;
		
		
		boolean flag = false; 
		if(firstMatRow==secondMatRow&&firstMatCol==secondMatCol) 
		{	
			flag = true;
		}	
		if(flag) 
		{
			int c[][]=new int[firstMatRow][firstMatCol];
		
			for (int i = 0; i < a.length; i++) 
			{
				for (int j = 0; j < a[0].length; j++) 
				{
					c[i][j] = a[i][j]-b[i][j];
				}				
			}
		//	return c;
		}
		else 
		{
			System.out.println("We can not subtract two matrices...");
		}
		return a;		
				
	}
	
	public static void main(String[] args) 
	{		
		MatrixSub obj = new MatrixSub();
		int farr[][]= obj.subMatrix(new int[][] {{1, 2, 3},{4, 5, 6},{7, 8, 9}}, new int[][] {{2, 4, 6},{8, 10, 12}});
		
		for (int i = 0; i < farr.length; i++)
		{
			for (int j = 0; j < farr[i].length; j++)
			{
				System.out.print(farr[i][j]+" ");
			}
			System.out.print("\n");
		}
	}
}
