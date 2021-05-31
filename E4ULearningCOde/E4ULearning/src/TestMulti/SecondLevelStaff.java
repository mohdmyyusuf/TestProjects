package TestMulti;

public class SecondLevelStaff extends Person{

	int fLevel;
	SecondLevelStaff(int fL){
		fLevel = fL;
	}
	
	@Override
	void setDetails(int id, String name, String address, long phoneNumber, String dept) {
		int sLID = id;
		String sLName = name;
		String sLAddress = address;
		long sLPnumber = phoneNumber;
		String sLDept = dept;
		
		int level = fLevel;
		
		System.out.println("second leve staff level"+level);
		System.out.println("second leve staff id"+sLID);
		System.out.println("second leve staff name"+sLName);
		System.out.println("second leve staff address"+sLAddress);
		System.out.println("second leve staff phone number"+sLPnumber);
		System.out.println("second leve staff department"+sLDept);
		
		
	}
	
	

}
