package SP;

public class TestInterfacesImp implements Test1 {

	@Override
	public void test() 
	{
		System.out.println("I Love java");
	}
	public void testM() 
	{
		System.out.println("I Love java too");
	}

	public static void main(String[] args) 
	{
		TestOne.testOne();

		Test1 obj = new TestInterfacesImp();
		obj.testTwo();
		TestInterfacesImp objImp = new TestInterfacesImp();
		objImp.test();
		((TestInterfacesImp) obj).testM();
		obj.testtwoM();

	}
	@Override
	public void testtwoM() {

		System.out.println("I am from TestTwo");
		
	}
}
