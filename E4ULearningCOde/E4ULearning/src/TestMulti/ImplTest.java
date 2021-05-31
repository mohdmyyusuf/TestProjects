package TestMulti;

public class ImplTest implements Interface22c{

	@Override
	public void test() 
	{
		System.out.println("I am from 22b");		
	}

	@Override
	public void retest() 
	{		
		System.out.println("I am from 22d");		
	}
	
	public static void main(String[] args) 
	{
		
		/*Interface22b obj = new ImplTest();
		obj.test();
		Interface22d obja = new ImplTest();
		obja.retest();*/
		
		Interface22c objc = new ImplTest();
		objc.retest();
		objc.test();
		
	}

}
