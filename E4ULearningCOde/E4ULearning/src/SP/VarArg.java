package SP;

public class VarArg {
	
	public static void testvar(int... var) {
		
		if(var.length ==0)
		System.out.println("No arguments");
		
		int min = var[0];
		
		for (int i = 0; i < var.length; i++) 
		{
			
			if(min>var[i]) {
				min = var[i];
			}
		}
		System.out.println("The minimum value is "+min);
		
	}
	
	public static void main(String[] args) {
		
		VarArg.testvar(1, 2, 3, 4, 4, 7, 0, 45, 1);
		
	}
	
	

}
