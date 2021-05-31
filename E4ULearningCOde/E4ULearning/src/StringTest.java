
public class StringTest {
	public static void main(String[] args) {
		
		String s = "test_filename.xls";		
		
		String subStr = s.substring(s.indexOf("."));
		
		System.out.println(subStr);
		
	}

}
