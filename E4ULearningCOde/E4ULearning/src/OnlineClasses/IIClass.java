package OnlineClasses;

public class IIClass extends TestClass implements InterfaceTwo{
	
	int i = 10;

	
	public static void main(String[] args) {
		
		InterfaceTwo ob = new IIClass();
		//System.out.println(ob.);
		ob.test();
		System.out.println();
		
		
	}

}
