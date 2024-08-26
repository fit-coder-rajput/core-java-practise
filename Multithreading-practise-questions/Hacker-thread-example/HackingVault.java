import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HackingVault {
	public static void main(String[] args) {
		
		Random rand = new Random();
		int nextInt = rand.nextInt(99999);
		
		Vault v = new Vault(nextInt);
		Thread th1 = new AscendingThread(v);
		Thread th2 = new DescendingThread(v);
		Thread PoliceThread = new PoliceThread();
		
		List<Thread> thl = new ArrayList<>();
		thl.add(th1); thl.add(th2); thl.add(PoliceThread);
		
		for(Thread t: thl) {
			t.start();
		}
		

	}

	static class Vault{
		int password=0;
		Vault(int password){
			this.password = password;
			System.out.println(this.password);
		}
		
		public boolean isCorrectPassword(int pass) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return this.password == pass;
		}
	}
	
	 abstract static  class  HackerThread extends Thread{

		 	Vault vault;
		 	HackerThread(Vault v){
		 		this.setName(this.getClass().getSimpleName());
		 		this.vault = v;
		 	}
		 	
		 @Override
		 public void start() {
			 System.out.println(this.getName()+" thread is started ");
		 		super.start();
		 }
	 }

	 static class AscendingThread extends HackerThread{

		AscendingThread(HackingVault.Vault v) {
			super(v);
		}
		@Override
		public void run() {
				
			for(int i=0; i<99999; i++) {
				if(vault.isCorrectPassword(i)) {
					System.out.println("password cracked by "+this.getName() +" it is: "+i);
					System.exit(0);
				}
			}
		}
		 
	 }
	 static class DescendingThread extends HackerThread{

		 DescendingThread(HackingVault.Vault v) {
				super(v);
			}
			@Override
			public void run() {
					
				for(int i=99999; i>=0; i--) {
					if(vault.isCorrectPassword(i)) {
						System.out.println("password cracked by "+this.getName() +" it is: "+i);
						System.exit(0);
					}
				}
			}
			 
		 }
	 static class PoliceThread extends Thread{
		 	
		 @Override
		 public void run() {
			 for(int i=1; i<21; i++) {
				 try {
					 System.out.println(i);
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 }
			 System.out.println("time up we got you gave over");
			 System.exit(0);
		 }
	 }
}
