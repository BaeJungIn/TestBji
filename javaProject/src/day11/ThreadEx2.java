package day11;

public class ThreadEx2 implements Runnable{
	public ThreadEx2() {
		Thread th = new Thread(this);
		th.start();
	}
	
	@Override
	public void run() {
		
		
		try {
			while(true) {
			System.out.println("ÀÛ¾÷Áß...");
			Thread.sleep(1000);
		}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new ThreadEx2();

	}


}
