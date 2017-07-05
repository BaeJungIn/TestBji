package day3;

public class EncapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encap encap = new Encap();
		int su1 = encap.a; //전체 접근(공유)
		int su2 = encap.b; //같은 패키지, 상속
		int su3 = encap.c; //같은 패키지
		encap.setD(10);
		int su4 = encap.getD();
		// int su4 = encap.d; //해당 클래스에서만 접근 가능
	}

}
class Encap{
	public int a = 10;
	protected int b = 5;
    int c = 3;
	private int d = 50;
	
	public void setD(int d) {
		this.d = d;
	}
	public int getD() {
		return this.d; //this 생략 가능
	}
}