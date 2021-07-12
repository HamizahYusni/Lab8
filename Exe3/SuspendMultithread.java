import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class SuspendMultithread implements Runnable{

	private String array[] = { "it","is","recommended","to","use","Calendar","class."};
	
	//use for checking thread "word1" condition
		private static boolean condition = true;
	
	/**
	 * This method rearrange sequence of sentence
	 * Thread: word1
	 */
	private void randomOrder() {
		Random random = new Random();
		Set<Integer>set = new LinkedHashSet<Integer>();
		
		while(set.size() < array.length) {
			int randomNumber = random.nextInt(array.length);
			set.add(randomNumber);
		}
		
		Object arrange[] = set.toArray();
		
		//set the new sentence
		String randomWord = "";
		for(int i = 0; i < array.length; i++) {
			randomWord += array[(int)arrange[i]] + " ";
		}
		System.out.println(randomWord);
	}
	
	private void randomOrder(String threadName) {
		Random random = new Random();
		Set<Integer>set = new LinkedHashSet<Integer>();
		
		while(set.size() < array.length) {
			int randomNumber = random.nextInt(array.length);
			set.add(randomNumber);
		}
		
		Object arrange[] = set.toArray();
		
		//set the new sentence
		String randomWord = "";
		for(int i = 0; i < array.length; i++) {
			randomWord += array[(int)arrange[i]] + " ";
			
			try {
				if (condition == true) {
					//suspend current thread for 5 secs
					System.out.println("\n\n** "+ threadName + " is sleeping\n\n");
					Thread.sleep(5000);
					condition = false;
				}
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		System.out.println(threadName + ": " + randomWord);}
	}
	
	/**
	 * extract characters from text
	 * Thread: text
	 */
	private void extractText() {
		String text = "Hi,pretty!";
		String extraction = "";
		char portion;
		
		for(int i = 0; i < 10; i++) {
			portion = text.charAt(i);
			extraction += portion;
			System.out.println(extraction);
		}
	}
	
	@Override
	public void run() {
		Thread currentThread = Thread.currentThread();
		String threadName = currentThread.getName();
		if(threadName.equals("text")) {
			extractText();
		}
		else if(threadName.equals("word2")) {
			randomOrder();
		}
		else
			randomOrder(currentThread.getName());
	}

}