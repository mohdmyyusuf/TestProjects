package OnlineClasses;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreation {
	
	public static void main(String[] args) throws IOException {
		
		File fileObj = new File("C:\\Users\\myusuf\\Desktop\\IOPrac\\test.txt");
		boolean flag = fileObj.createNewFile();
		String input = "I waana be a great programmer";
		byte b[]=input.getBytes();
		
		if(flag) 
		{			
			System.out.println("File "+fileObj.getName()+" has been created..");
			FileOutputStream fout = new FileOutputStream("C:\\Users\\myusuf\\Desktop\\IOPrac\\test.txt");
			fout.write(b);
		}
		
	}

}
