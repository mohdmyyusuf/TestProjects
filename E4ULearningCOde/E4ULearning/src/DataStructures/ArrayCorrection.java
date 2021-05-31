package DataStructures;

import java.util.HashSet;
import java.util.Set;

public class ArrayCorrection {
	
	public int [] corect(int a[]) {
		
		Set<Integer> s = new HashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			s.add(a[i]);
		}
		
		for (int i = 0; i < a.length; i++) {
			if(s.contains(a[i])) {
				
				a[i] = a[i];
			}
			else {
				a[i] = -1;
			}
		}
		return a;
	}
	public static void main(String[] args) {
		
		ArrayCorrection obj = new ArrayCorrection();
		int[] res = obj.corect(new int[] {11, 12, 15, 14, 17, 18, 12, 17});
		
		for (int j = 0; j < res.length; j++) {
			System.out.println(res[j]);
		}
		
	}
}
