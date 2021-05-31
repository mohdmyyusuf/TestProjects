package OnlineClasses;

public class MethodOverload {
	
	int add() 
	{		
		int x = 10;
		int y = 11;
		
		int z = x+y;
		
		return z;
	}
	
	
	
	int add(int a, int b) 
	{		
		int x = a;
		int y = b;
		
		int z = x+y;
		
		return z;
	}
	
	String add(String a, String b) {
		String c = a+b;
		return c;	
	}
	
	float add(float a, float b) {
		float c = a+b;
		return c;	
	}

	public static void main(String[] args) {
		
		MethodOverload obj = new MethodOverload();
		String retStr = obj.add("Test", " String");
		float n = obj.add(2.5f, 78.6f);
		
		
	}
}
