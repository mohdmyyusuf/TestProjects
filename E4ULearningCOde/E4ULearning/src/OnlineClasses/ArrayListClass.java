package OnlineClasses;

import java.util.List;

public class ArrayListClass {
	
	public static void main(String[] args) {
		
		int a = 10;
		int ls = a<<2;
		int rs = a>>2;
		int rrs = a>>>-2;
		int b = 11;
		b*=10; // b = b+10
		System.out.println("Compounded b"+b);
		int age = 15; 
		boolean voteRight = false;
		
		System.out.println("Left shifted values "+ ls);
		System.out.println("Right shifted values "+ rs);
		System.out.println("Right right shifted values "+ rrs);
        int testVar = (a>b)?a:b;
        System.out.println("Selected value "+testVar);
        
       boolean flag =  (age>18)?voteRight = true:(voteRight = false);
       
       if(flag)
       {
    	   System.out.println("Candidate is eligibale for vote");
    	   
       }
       else {
    	   System.out.println("Candidate is NOT eligibale for vote");
       }
		
		
		System.out.println(a<b&&++a<15);
		System.out.println("first itr;;;;;"+a);
		System.out.println(a>b&++a<15);
		System.out.println("Second itr;;;;;"+a);
		
		int c = ++a + b--;
		System.out.println("value of a "+a);
		System.out.println("value of b "+b);
		System.out.println("value of c "+c);
		
		
		
		
	}

}
