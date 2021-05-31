package OnlineClasses;

public class VarArguments {
	
	static public int add(int x, int... a) 
	{
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum+a[i];
		}		
		return sum*x;		
	}
	public static void main(String[] args) {
		
		int a[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
		int res = VarArguments.add(2, 1, 2, 3, 4, 5, 6, 7, 8, 9);
		System.out.println(res);
		
	}

}
