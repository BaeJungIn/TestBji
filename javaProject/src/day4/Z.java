package day4;
class X{
	protected int i = 10;
	protected String msg = "i am an X";
	
	public void print() {
		System.out.println(msg);
	}
	
	public void play() {
		System.out.println("play..."+msg);
	}
}

class Y extends X{
	protected int i=20;
	protected String msg = "i am an Y";
	
	public void print() {
		System.out.println(msg);
	}
}



public class Z extends Y{
	protected int i = 30;
	protected String msg = "i am a Z";
	
	public void print() {
		System.out.println(msg);
	}
	
	public void play() {
		System.out.println("play..."+msg);
	}
	
	public void doZ() {
		System.out.println("do something in Z");
	}
	
	public void test(int i) {
		Z z = new Z();
		Y y = z;
		X x = z;
		
		//����
		z.print();
		y.print();
		x.print();
		super.print();
		play();
		super.play();
		
		System.out.println("i = "+i);
		System.out.println("this.i = "+this.i);
		System.out.println("super.i = "+super.i);
		System.out.println("y.i = "+y.i);
		System.out.println("x.i = "+x.i);
		System.out.println("((Y)this).i = "+((Y)this).i);
		System.out.println("((X)this).i = "+((X)this).i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Z z = new Z();
		z.test(15);
	}

}
