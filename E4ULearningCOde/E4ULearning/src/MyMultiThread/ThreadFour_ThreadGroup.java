package MyMultiThread;

public class ThreadFour_ThreadGroup implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		
		ThreadFour_ThreadGroup obj = new ThreadFour_ThreadGroup();
		ThreadGroup tg = new ThreadGroup("Parent thread group");
		Thread t1 = new Thread(tg, obj, "one");
		t1.start();
		Thread t2 = new Thread(tg, obj, "two");
		t2.start();
		Thread t3 = new Thread(tg, obj, "three");
		t3.start();
		
		System.out.println(tg.getName());
		tg.list();
	}

}
