package day3;

public class EncapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encap encap = new Encap();
		int su1 = encap.a; //��ü ����(����)
		int su2 = encap.b; //���� ��Ű��, ���
		int su3 = encap.c; //���� ��Ű��
		encap.setD(10);
		int su4 = encap.getD();
		// int su4 = encap.d; //�ش� Ŭ���������� ���� ����
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
		return this.d; //this ���� ����
	}
}