package day5;

public class AbstractEx extends Abs{
	
	public int getA() {
		System.out.println("�߻� �޼ҵ� ������...");
		return 100;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractEx ab = new AbstractEx();
		Abs abs = ab;
		abs.setA();
		abs.getA();
	}


}

abstract class Abs{
	int a = 10;
	public void setA() {
		System.out.println();
	}
	public abstract int getA();
	
}
