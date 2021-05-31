package TestMulti;

public class Students extends Person{

	long Rno;
	Students(int rNo){
		Rno = rNo;
	}
	
	@Override
	void setDetails(int id, String name, String address, long phoneNumber, String dept) {
		int StID = id;
		String StName = name;
		String StAddress = address;
		long stPnumber = phoneNumber;
		String StDept = dept;
		boolean isRegular = true;
		long stRno = Rno;
		
		System.out.println("Student roll number"+stRno);
		System.out.println("Student id"+StID);
		System.out.println("Student name"+StName);
		System.out.println("Student address"+StAddress);
		System.out.println("Student phone number"+stPnumber);
		System.out.println("Student department"+StDept);
		System.out.println("Student is regular "+isRegular);
		
		
	}

}
