package OnlineClasses;

public class FunctOne {
	
	/*We have created a function
    with parameter and return type as
    int and called that with double... it will not accept and throw error 
    parameters*/
	public String detailProvider(String name, String add, String occup) 
	{	
		String Uname = name;
		String Uadd = add;
		String Uoccup = occup;
		
		String finalString = "The user "+Uname+" lives at "+ Uadd+ " and is a "+ Uoccup;
		return finalString;
	}
	
	public static void main(String[] args) {
		
		
		
		//int res;
		FunctOne obj = new FunctOne();
		//res = obj.add(7, 8);
		String outputString = obj.detailProvider("Mohd Yusuf", "Bijnor", "Java Developer");
		System.out.println(outputString);
		
	}

}
