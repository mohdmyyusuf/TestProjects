package Udemy;

public class EuclidAlgo {
	
	/*This is the function to calculate the GCD
	 * using recursion
	 * */
	public int gcd(int num, int div) {
		
		int rem = num%div;
		if(rem != 0) {
			return gcd(div, rem);
		}
		else {
			return div;
		}
	}
	
	/**
	 * This function checks the small number to be zero... if it is not zero in while loop condition
	 * it takes the reinder of both numbers and put that in temp then small number bucome large number
	 * and remainder becomes samller number and repeat the same stap again.
	 * 
	 * **/
	public int gcdNR(int num, int div) {
		
		while(div != 0) {
			int temp = num%div;
			num =  div;
			div = temp;
		}
		
		return num;
	}
	
	public static void main(String[] args) {
		
		EuclidAlgo obj = new EuclidAlgo();
		//*int res = obj.gcd(15, 2);
		//System.out.println(res);
		int res = obj.gcdNR(36, 8);
		System.out.println(res);

		
	}
}
