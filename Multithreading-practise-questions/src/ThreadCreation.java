
public class ThreadCreation {

	public static void main(String[] args) {
			
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				System.out.println("First thread created my name is : "+Thread.currentThread().getName());
			}
		});
		
			Thread thread2 = new Thread(()-> {  // using lambda we can reduce to this
				
				System.out.println("Second thread created my name is : "+Thread.currentThread().getName());
			});
		
		
		System.out.println("Before thread start current thread is : "+Thread.currentThread().getName());
		thread1.start();
		thread2.start();
		System.out.println("after thread start current thread is : "+Thread.currentThread().getName());

	}

}
