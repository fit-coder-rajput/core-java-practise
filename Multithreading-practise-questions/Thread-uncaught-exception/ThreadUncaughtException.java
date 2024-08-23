import javax.management.RuntimeErrorException;

public class ThreadUncaughtException {
	public static void main(String[] args) {

		Thread thread1 = new Thread(() -> { 
			throw new RuntimeErrorException(new Error("unwanted exception occured"));
		});
		thread1.setPriority(Thread.MAX_PRIORITY);  // will show effect when we have many threads
		thread1.setName("Exception thread !");
		
		thread1.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
			@Override
			public void uncaughtException(Thread t, Throwable e) {
				System.out.println("Exception occured from : "+t.getName());
				
			}
		});
		System.out.println("before thread start "+Thread.currentThread().getName());
		thread1.start();
		System.out.println("after thread start "+Thread.currentThread().getName());


	}
}
