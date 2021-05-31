package SP;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class WritingToFile {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\myusuf\\Desktop\\TestLearning\\testFileTwo.txt");
		int i=0;		
		try {
			while((i=fis.read())!=-1) {
				
				System.out.print((char)i);
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
