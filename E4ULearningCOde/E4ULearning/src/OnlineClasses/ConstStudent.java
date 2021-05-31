package OnlineClasses;

public class ConstStudent {
	
	String name;
	ConstStudent(){		
		System.out.println("Unknown student");
	}
	ConstStudent(String n){		
		name =n;
	}
	
	public static void main(String[] args) {
		ConstStudent s1 = new ConstStudent();
		ConstStudent s2 = new ConstStudent("Ratan");
		
	}

}
