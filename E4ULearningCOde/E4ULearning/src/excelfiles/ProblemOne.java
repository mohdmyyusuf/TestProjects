package excelfiles;

public class ProblemOne {
	public  int seconDlargest(int a[]) {	
		
		int temp, min;
		for (int i = 0; i < a.length; i++) {
			min = i;
			for (int j = i+1; j < a.length; j++) {
				
				if(a[j]<a[min])
				{
					min = j;
				}
			}
			
			temp = a[i];
			a[i] = a[min];
			a[min] = temp;
			
			
		}
		return 0;
		
	}
	
	
	public static void main(String[] args) {
		
		ProblemOne obj = new ProblemOne();
		
		
		
	}

}
