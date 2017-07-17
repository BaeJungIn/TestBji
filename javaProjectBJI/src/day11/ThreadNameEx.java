package day11;

public class ThreadNameEx {

	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println("���α׷� ���� ������ �̸�:"+mainThread.getName());
		
		ThreadA threadA = new ThreadA();
		System.out.println("�۾� ������ �̸�:"+threadA.getName());
		threadA.start();
		
		ThreadB threadB = new ThreadB();
		System.out.println("�۾� ������ �̸�:"+threadB.getName());
		threadB.start();
		

	}

}
class ThreadA extends Thread{
	public ThreadA() {
		setName("ThreadA");
	}
	
	
	public void run() {
		for(int i=0; i<2; i++) {
			System.out.println(getName()+"�� ����� ����");
		}
	}
}
class ThreadB extends Thread{
	public ThreadB() {
		setName("ThreadB");
	}
	
	
	public void run() {
		for(int i=0; i<2; i++) {
			System.out.println(getName()+"�� ����� ����");
		}
	}
}