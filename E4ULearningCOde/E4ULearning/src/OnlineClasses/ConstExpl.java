package OnlineClasses;

public class ConstExpl 
{
	int a;
	int b;
	char c;
	String s;
	int f;
	ConstExpl obj;
	ConstExpl(){
		System.out.println("Love java");
	}
	
	ConstExpl(int x, int y, char z, String n)
	{
		a = x;
		b = y;
		 c = z;
		 s = n;
	}
	
	ConstExpl(ConstExpl obj)
	{
		a = obj.a;
		b = obj.b;
		c = obj.c;
		s = obj.s;
		 
	}
	
	
	public static void main(String[] my) 
	{		
		ConstExpl obj = new ConstExpl();
		ConstExpl obj1 = new ConstExpl(10, 20, 'w', "Java test");
		//ConstExpl obj2 = new ConstExpl(obj1);
		obj.a  = obj1.a;
		obj.b = obj1.b;
		
	
		System.out.println(obj.a);
		System.out.println(obj.b);
		for (int i = 0; ; i++) {
			System.out.println("Test");
		}
		
	}
	

}
