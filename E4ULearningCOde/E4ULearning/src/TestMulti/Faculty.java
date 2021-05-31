package TestMulti;

public class Faculty extends Person {
	
	String subTaech;
	Faculty(String subT){
		subTaech = subT;
	}

	@Override
	void setDetails(int id, String name, String address, long phoneNumber, String dept) {
		int FID = id;
		String FName = name;
		String FAddress = address;
		long FPnumber = phoneNumber;
		String FDept = dept;
		String sTaech = subTaech;
		System.out.println("Faculty id"+FID);
		System.out.println("Faculty name"+FName);
		System.out.println("Faculty address"+FAddress);
		System.out.println("Faculty phone number"+FPnumber);
		System.out.println("Faculty department"+FDept);
		System.out.println("Faculty teaches"+sTaech);
	}

}
