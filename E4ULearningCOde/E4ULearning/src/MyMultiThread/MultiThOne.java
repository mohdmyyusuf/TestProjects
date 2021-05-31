package MyMultiThread;

public class MultiThOne implements Runnable{

	public MultiThOne(String test) {
		
		System.out.println(test);
	}
	
	@Override
	public void run() {
		
		for (int i = 0; i < 3; i++) {
		
			System.out.println("I am thread...");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		MultiThOne obj = new MultiThOne("First");
		MultiThOne obj1 = new MultiThOne("Second");
		MultiThOne obj2 = new MultiThOne("Third");
		Thread t = new Thread(obj);
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj1);
		t.start();
		
		 try { t.join(500); } catch(InterruptedException e) { e.printStackTrace(); }
		 
		t1.start();
		t2.start();
	}
}
