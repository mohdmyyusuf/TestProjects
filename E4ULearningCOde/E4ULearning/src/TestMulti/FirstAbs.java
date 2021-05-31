package TestMulti;

public abstract class FirstAbs {
	
	// Partial abstraction...
	
	int a;
	int b;
	FirstAbs(){
		a = 0;
		b=0;
	}
	
	public final void test() {
		
		System.out.println("Tests....");
		
	}
	
	public abstract void testAbs();
	
	
}
