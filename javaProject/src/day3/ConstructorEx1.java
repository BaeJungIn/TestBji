package day3;

public class ConstructorEx1 {

	int a;
	
	//�⺻ �����ڸ� �����ؾ� �� ���(�ٸ� �����ڸ� ������ �� ������ ����, �ٸ� ������ ���� ���ߴٸ� ���X(�̹� ����))
	ConstructorEx1(){
		a= 50;
		System.out.println("Constructor1="+this.a);
	}
	
	//�����ε�
	ConstructorEx1(int a){ //a�� �ƴ� b�϶��� this.a ��� ������ ȣ���� (=0)
		System.out.println("Constructor2 , a="+a);
	}
	
	//�����ε�
	ConstructorEx1(int a, String s){
		System.out.println("Constructor3");
	}
	ConstructorEx1(String a, int b){
		System.out.println("Constructor4");
	}
	public static void main(String[] args) {
		new ConstructorEx1();
		new ConstructorEx1(5,"A");  //3��
		new ConstructorEx1("A", 5); //4��
		new ConstructorEx1(10);
		
	}

}
