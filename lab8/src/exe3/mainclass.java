package exe3;


public class mainclass {
	public static void main (String args[]) {
		Runnable display1 = new Suspending();
		Runnable display2 = new Suspending();
		Runnable display3 = new Suspending();
		
		
		Thread DT3 = new Thread(display1,"text");
		Thread DT4 = new Thread(display2,"word1");
		Thread DT5 = new Thread(display3,"word2");
		
		DT3.start();
		DT4.start();
		DT5.start();
		
	}

}
