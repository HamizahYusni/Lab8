
public class SuspendMultithreadApp {
	
	public static void main(String[] args) throws InterruptedException {
		
		//create objects of thread
		Runnable choose1 = new SuspendMultithread();
		Runnable choose2 = new SuspendMultithread();
		Runnable choose3 = new SuspendMultithread();
		
		//create frame to the objects
		Thread thread1 = new Thread(choose1, "word1");
		Thread thread2 = new Thread(choose2, "word2");
		Thread thread3 = new Thread(choose3, "text");
		
		//execute the objects
		thread1.start();
		thread2.start();
		thread3.start();
	}
}