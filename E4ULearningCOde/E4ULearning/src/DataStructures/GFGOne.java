package DataStructures;

import java.util.Arrays;

public class GFGOne {
	
	public int [] arrayRearrange(int a[]) {
		int Arrlen = a.length;
		int evePos = Arrlen/2;
		System.out.println(evePos);
		int oddPos = Arrlen - evePos;
		System.out.println(oddPos);
		int tempArr[] = new int [Arrlen];
		
		for (int i = 0; i < Arrlen; i++) 
		{
			tempArr[i] = a[i];
		}
		Arrays.sort(tempArr);
		int j = oddPos - 1;
		
		for (int i = 0; i < Arrlen; i+=2) 
		{
			 a[i] = tempArr[i];
			 j--;
		}
		
		j =oddPos;
		
		for (int i = 1; i < tempArr.length; i++) {
			 a[i] = tempArr[i];
			 j++;
		}
		
		return a;
	}
	
	public static void main(String[] args) {
		GFGOne obj =  new GFGOne();
		int res[] = obj.arrayRearrange(new int [] {1, 5, 8, 2, 6, 7, 3, 9, 11, 12});
		
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
	}

}
