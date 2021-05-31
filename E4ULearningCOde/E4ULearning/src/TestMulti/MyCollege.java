package TestMulti;

public class MyCollege{

	public static void main(String[] args) {
		
		Faculty objFac = new Faculty("Java");
		objFac.setDetails(124, "Raghib", "Okhla", 1234568, "Computer science");
		
		Faculty objFac1 = new Faculty("Drawing");
		objFac1.setDetails(123, "Yaqoob", "Maujpur", 1234569, "Kala snakay");
		
		Students obj2 = new Students(1234567);
		obj2.setDetails(786, "Santa", "Delhi", 12345679, "CS");
	}
	
}
