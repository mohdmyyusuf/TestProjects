package OnlineClasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionOne {
	
	public void fileREading() throws FileNotFoundException {
	     FileInputStream in = new FileInputStream("in.txt");
			
	}
	
	public static void main(String[] args) {
		try {
		int a = 10;
		int b = 0;
		
		int c = a/b;
		
		System.out.println(c);
	}
	catch(ArithmeticException obj) {
			obj.printStackTrace();
			
		}
		
		System.out.println("No exception");
		
		
	}

}
