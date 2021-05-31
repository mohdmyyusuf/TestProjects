package TestMulti;

public class ClassImpl22 implements Interface22, Interface22a {

	int a = 10;
	@Override
	public void test() {
		System.out.println("I am class method..");
		
	}
	
	void testOne() {
		System.out.println("Test method purely in class");
	}
	
	public static void main(String[] args) 
	{
		Interface22 obj = new ClassImpl22();
		obj.test();
		((ClassImpl22)obj).test();
		System.out.println(((ClassImpl22)obj).a);
	}

	
}
