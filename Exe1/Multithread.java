import java.util.Calendar;
import java.util.Date;

public class Multithread extends Thread{
	
	public void printNumber(String threadName) {
		for(int i = 0; i < 10; i++) {
			Date time = Calendar.getInstance().getTime();
			System.out.println(threadName + ": " + time + " -- " + i);
		}
	}
	
	public void run() {
		Thread currentThreat = Thread.currentThread();
		printNumber(currentThreat.getName());
	}
}
