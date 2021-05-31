package OnlineClasses;

public class  ArrayPassing{
	
	public int[] avg(int a[]) {
		int n_values = a.length;
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			 sum = sum + a[i];			 
			}
	
		int avg = sum/n_values;
		for (int i = 0; i < a.length; i++) {
			a[i] = a[i]*avg;
		}
		return a;
	}
	
	public static void main(String[] args) {
		ArrayPassing obj = new ArrayPassing();
		int s[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println("Original array content");
		for (int a = 0; a < s.length; a++) {
			System.out.println(s[a]);
		}
		System.out.println("________________________________");
		System.out.println("Array content after cryptography...");
		int far[]= obj.avg(s);
		for (int a = 0; a < far.length; a++) {
			System.out.println(far[a]);
		}
	}

}
