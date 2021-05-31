package SP;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreation {
	
	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\myusuf\\Desktop\\TestLearning\\testFileTwo.txt");
		String s = "I love programming its magical....";
		byte b[] = s.getBytes();
		try 
		{
			boolean var=file.createNewFile();
			if(var) 
			{				
				System.out.println("File has been created..");
				FileOutputStream fout = new FileOutputStream("C:\\Users\\myusuf\\Desktop\\TestLearning\\testFileTwo.txt");
				fout.write(b);
				
			}
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}

}
