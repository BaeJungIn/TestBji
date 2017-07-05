package day4;

public class InherEx extends SuperEx{

	int a;
	String b;
	public InherEx() {
		super(); //생략 가능, 메인메소드에서 사용 불가
		System.out.println("class A");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InherEx sub = new InherEx();
		sub.a = 10;
		System.out.println(sub.a);
		sub.c = 50;
	}

}
class SuperEx{
	public SuperEx() {
		System.out.println("class B");
	}
	
	int c;
	String d;
}
