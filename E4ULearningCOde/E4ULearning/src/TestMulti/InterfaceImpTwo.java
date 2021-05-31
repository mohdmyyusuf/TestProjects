package TestMulti;

public class InterfaceImpTwo implements InterfaceTwi, InterfaceThree{

	@Override
	public void move() {
		System.out.println("I move "+ a+" times");
		
	}

	@Override
	public void eat() {
		System.out.println("I love to eat shami kebab");
		
	}

	@Override
	public void jump() {
		System.out.println("I want to jump "+numberOfJump+" times daily");
		
	}
	
	public static void main(String[] args) {
		
		InterfaceImpTwo cobj = new InterfaceImpTwo();
		cobj.move();
		cobj.eat();
		cobj.jump();
	}

}
