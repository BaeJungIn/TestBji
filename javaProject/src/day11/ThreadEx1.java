package day11;

public class ThreadEx1 extends Thread {
	
	public ThreadEx1() {
		super("ù��° ������");
	}
	
	@Override
	public void run() {
		
		
		try {
			while(true) {
			System.out.println("�۾���...");
			Thread.sleep(1000);
		}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		ThreadEx1 th = new ThreadEx1();
		th.start();

	}
	
	

}
