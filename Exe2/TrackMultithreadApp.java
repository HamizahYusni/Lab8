
public class TrackMultithreadApp {
	
	public static void main(String[] args) throws InterruptedException {
		
		//create objects of thread
		Runnable choose1 = new TrackMultithread();
		Runnable choose2 = new TrackMultithread();
		
		//create frame to the objects
		Thread thread1 = new Thread(choose1, "word1");
		Thread thread2 = new Thread(choose2, "text");
		
		//execute the objects
		thread1.start();
		thread2.start();
		
	}
}