public class MultithreadApplication {

	public static void main(String[] args) throws InterruptedException {
		
		//create objects of thread
		Multithread thread1 = new Multithread();
		Multithread thread2 = new Multithread();
		
		//set name to the objects
		thread1.setName("Thread 1");
		thread2.setName("Thread 2");
		
		//execute the objects
		thread1.start();
		thread2.start();
		
	}

}