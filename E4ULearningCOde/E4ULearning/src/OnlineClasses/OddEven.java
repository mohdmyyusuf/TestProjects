package OnlineClasses;

import java.util.Scanner;

public class OddEven
{
	public static void main(String[] arg)
	{
		int i;
		System.out.println("enter the number to check prime or not");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		for(i=2;i<a;i++)
			if(a%i==0) {
				System.out.println("this is not a prime number");
				break;
			}
			else {
				System.out.println("this is a prime no");
				break;
			}
}
}