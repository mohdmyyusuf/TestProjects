package excelfiles;

public class CheckPalin {
	
	
	public static void palin(String s) 
	{	
		int i = 0;
		int len  = s.length()-1;
		char a [] = s.toCharArray();
		
		for (int j = 0; j < a.length; j++) {
			int n = j;
			char temp[i] = a[i];
		}
		//s.substring(beginIndex)
		while(len > 0) {
			
			if(a[i++]!=a[len--]) 
			{	
				System.out.println("The string is Not palindrome");
			}
		}
		System.out.println("it is palin");
		
	}
	
	
	public static void main(String[] args) {
		
		CheckPalin.palin("nitin");
		
	}
	

}
