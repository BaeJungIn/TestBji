package day11;

public class ThreadEx4 extends Thread{
	public void run(){
		for(int i=0; i<10; i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("�۾���(��)...");
		}
		System.out.println("�۾��� �Ϸ�Ǿ����ϴ�.");
	}
	public static void main(String[] args) {
		ThreadEx4 th = new ThreadEx4();
		th.start();
		for(int i=0; i<10; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("main �۾���(��)");
		}
		for(int i=0; i<10; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("main2 �۾���(��)");
		}

	}

}
