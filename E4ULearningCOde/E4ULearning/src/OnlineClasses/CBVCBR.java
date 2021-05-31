package OnlineClasses;

public class CBVCBR {
	
	//call by value
	int a = 500;
   public void incrTest(int a){
		
		//obj.a = obj.a+40;
	   a = a+40;
		//System.out.println(a);
	}
	
   public static void main(String[] args) {
	
	   CBVCBR obj = new CBVCBR();
	   System.out.println("Before method "+obj.a);
	   obj.incrTest(obj.a);
	   System.out.println("After method "+obj.a);
}

}
