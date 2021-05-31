package SP;

public interface TestOne {
	
	int a = 5;

	void test();
	
	static void testOne(){
		
		System.out.println("Great!!!");
		
	}
	
	default void testTwo(){
		
		System.out.println("Wow!!!");
		
	}
}
