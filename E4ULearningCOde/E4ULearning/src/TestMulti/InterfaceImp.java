	package TestMulti;
	
	public class InterfaceImp implements InterfaceOne{
		
		public void test() {
			
			System.out.println("Test to print");
		}
	
		@Override
		public void move() {
			
			System.out.println("I wanna move by the sea.."+a+"times");
			
		}
	
		@Override
		public void eat() 
		{
			System.out.println("I wanna eat cocoa by the sea..");
			
		}
		
		public static void main(String[] args) 
		{		
			InterfaceImp objImp = new InterfaceImp();
			objImp.eat();
			objImp.move();
			objImp.test();
			InterfaceOne obj = new InterfaceImp();
			obj.eat();
			obj.move();		
			
		}
	
	}
