package SP;

import java.io.File;
import java.io.FilenameFilter;

public class FileFilterTes {
	
	public static void main(String[] args) {
		
		String dirName = "D:\\Personal";
		File f = new File(dirName);
		
		FilenameFilter only = new FileFilter("pdf");
		String s[] = f.list(only);
		
		for (int i = 0; i < s.length; i++) {
			
			System.out.println(s[i]);
			
		}
		
		
		
		
	}

}
