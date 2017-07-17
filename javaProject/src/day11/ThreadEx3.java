package day11;

import java.awt.Toolkit;

public class ThreadEx3 {
	public ThreadEx3() {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					while(true) {
					System.out.println("¶¯");
					Thread.sleep(500);
				}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();
		
		Thread thread = new Thread(worker);
		thread.start();
	}
	
	Runnable worker = new Runnable() {
		
		@Override
		public void run() {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			while(true) {
				toolkit.beep();
			
			try {
				Thread.sleep(500);
			}
			 catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			}
		
	};
	public static void main(String[] args) {
		new ThreadEx3();

	}

}
