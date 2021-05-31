package TestMulti;

public class Dihadi implements Question, Question1
{
	
	public int a; 
	@Override
	public void test() 
	{
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) 
	{		
		Question obj = new Dihadi();
		Dihadi obj1 = new Dihadi();
		obj.test();
		obj1.test();
		obj1.a = 5;
		((Dihadi)obj).a = 6;
		System.out.println(obj1.a);
		
	}
}
