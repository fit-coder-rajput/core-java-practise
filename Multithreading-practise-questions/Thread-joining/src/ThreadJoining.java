import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreadJoining {

	public static void main(String[] args) {
		
		
		List<Long> list = Arrays.asList(1234l, 1212121l ,323l ,22l);
		List<FactorialThread> threads = new ArrayList<>();
		for(long num: list) {
			threads.add(new FactorialThread(num));
		}
		
		for(Thread th: threads) {
			th.setDaemon(true); // setting daemon so that on main termination all thread will laso terminate
			th.start();
		}
		
		for(Thread th: threads) {
			try {
				th.join(2000);   // some thread may takevery long time and if we dont want to wait that much we can specify time
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		// when joining time finished the thread may be running in background for that we have to handle the termination in some way
		// as of now setting daemon thread will be fine it has to be set before starting
		
		for(FactorialThread ft: threads) {  // without joining thread due to race condition some thread may be busy in computation
			if(ft.isFinished()) {			// and if we want to wait for the computation we have to join those threads in current thread which is dependent
				System.out.println(ft.num+"! = "+ft.getResult()); 
			}else {
				System.out.println(ft.num+"! = inprogress....");
			}
		}

	}
	
	
	static class FactorialThread extends Thread{
			
		boolean finished = false;
		BigInteger result = BigInteger.ZERO;
		Long num = 0l;
		
		public FactorialThread(long num){
			this.num = num;
		}
		
		@Override
		public void run() {
			result = factorial();
			finished =true;
		}
		private BigInteger factorial() {
			BigInteger fact = BigInteger.ONE;
			for(int i=1; i<=num; i++) {
				fact = fact.multiply(new BigInteger(String.valueOf(i)));
			}
			return fact;
			
		}
		
		boolean isFinished() {
			return finished;
		}
		
		BigInteger getResult() {
			return result;
		}
	}

}
