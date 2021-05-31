package MyMultiThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest {
	
	public static void main(String[] args) {
		
		ExecutorService executer = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 10; i++) {
			
			Runnable worker = new MultiThreadRTwo_ThreadPool(""+i);
			executer.execute(worker);
			
		}
		executer.shutdown();
		
		while (!executer.isTerminated()) {
			
			
		}
		System.out.println("Finished all threads...");
		
		
	}

}
