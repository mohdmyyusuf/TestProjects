package OnlineClasses;

public class ArrayOne {
	
	public static void main(String[] args) {
		
		int a[] = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
		Class c = a.getClass();
		String name = c.getName();
		
		System.out.println("Name of class "+ name);
		
		String s[] = new String[] {"I ", "love ", "jave"};
		Class c1 = s.getClass();
		String name1 = c1.getName();
		System.out.println("Name of class again"+ name1);
		
	}

}
