package OnlineClasses;

public class BankForm {
	
	String name;
	long acc_no;
	String addr;
	static int count_cust;
	
	BankForm(String n, long acn, String add){
		name = n;
		acc_no = acn;
		addr = add;
		count_cust = count_cust +1;
	}
	
	public static void main(String[] args) {
		
		BankForm cust1 = new BankForm("raja", 123134, "bijnor");
		BankForm cust2 = new BankForm("aaja", 123135, "jhalu");
		BankForm cust3 = new BankForm("baja", 123136, "khari");
		BankForm cust4 = new BankForm("taja", 123137, "chandpur");
		BankForm cust5 = new BankForm("maja", 123138, "nagina");
		
		System.out.println("|"+cust1.name+"|"+cust1.acc_no+"|"+cust1.addr+"|");
		System.out.println("|"+cust2.name+"|"+cust2.acc_no+"|"+cust2.addr+"|");
		System.out.println("|"+cust3.name+"|"+cust3.acc_no+"|"+cust3.addr+"|");
		System.out.println("|"+cust4.name+"|"+cust4.acc_no+"|"+cust4.addr+"|");
		System.out.println("|"+cust5.name+"|"+cust5.acc_no+"|"+cust5.addr+"|");
		
		System.out.println("Total number of cutomers "+BankForm.count_cust);
	}
	

}
