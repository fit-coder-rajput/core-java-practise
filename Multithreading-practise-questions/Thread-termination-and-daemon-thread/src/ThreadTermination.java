import java.math.BigInteger;

public class ThreadTermination {
	public static void main(String[] args) {
		
		Thread th = new TerminateThread();
		th.start();
//		th.interrupt();  // interrupting the thread from another thread.. if that thread handle the inturruption it can be terminated
		
		
		Thread computePower = new BigComputation(new BigInteger("400"), new BigInteger("20"));
		computePower.setDaemon(true);  // when thread set to daemon it will also terminate when main terminated
		computePower.start();
		
//		computePower.interrupt(); //  a way to interrupt the thread if that that thread is handling interruption call
		
		
	System.out.println("main exited... and all daemon thread will also terminate");	
			
	}
	
	static class  BigComputation extends Thread{
		BigInteger power; BigInteger base;
		BigComputation(BigInteger base, BigInteger power){
			this.power = power;
			this.base = base;
		}
		BigInteger result = BigInteger.ONE;
		
		@Override
		public void run() {
			
			for(BigInteger i = BigInteger.ZERO; i.compareTo(power)!= 0; i=i.add(BigInteger.ONE)) {
				
				if(Thread.interrupted()) { // one way to terminate signal inerruption from other thread
					result = BigInteger.ONE;
					break;
				}
				result = result.multiply(base);
			}
			System.out.println(base+"^"+power+" = "+result.toString());
			
		}
	}
	
	static class TerminateThread extends Thread{
		
		@Override
		public void run() {
			
			try {
				Thread.sleep(2000);
			}catch(InterruptedException ex) {
				System.out.println("interrupte exited");
			}
		}
	}

}
