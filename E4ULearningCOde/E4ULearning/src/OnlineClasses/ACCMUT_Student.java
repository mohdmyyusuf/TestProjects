package OnlineClasses;

public class ACCMUT_Student {
	
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	public void setAge(int p_age) {
		this.age = p_age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String p_name) {
		this.name = p_name;
	}
	
	public void displayDetais() {
		System.out.println("Name of student "+getName());
		System.out.println("Age of student "+getAge());
	}
	
	public static void main(String[] args) {
		
		ACCMUT_Student obj = new ACCMUT_Student();
		obj.setAge(30);
		obj.setName("Test user");
		obj.displayDetais();
		
		
	}
	
	

}
