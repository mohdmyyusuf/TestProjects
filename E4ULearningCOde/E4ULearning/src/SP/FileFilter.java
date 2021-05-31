package SP;

import java.io.File;
import java.io.FilenameFilter;

public class FileFilter implements FilenameFilter{

	String ext;
	FileFilter(String fext){
		
		this.ext = "."+fext;
		
	}
	@Override
	public boolean accept(File dir, String name) 
	{
		return name.endsWith(ext);
	}

}
