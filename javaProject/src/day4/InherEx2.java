package day4;

public class InherEx2 extends superClass{
	int age = 10;
	String name1;
	
	public void method() {
		// TODO Auto-generated method stub
				//super() ���
				//this() ���
				//super.��ü���
				//this.��ü���
				System.out.println("subClass Method");
				super.method();
	}
	public static void main(String[] args) {
		InherEx2 obj = new InherEx2();
		
		//1 ����ȯ
		superClass sc = obj;
		Object object1 = obj;
		Object object2 = sc;
		
		//2 ĳ����
		obj = (InherEx2)sc;
		obj = (InherEx2)object1;
		
		//3 object �� ��ȯ
		obj.method();
		sc.method();
		
		System.out.println(obj.age);
		System.out.println(sc.age);
		
		//4 �������̵� ���
		
		
		//5 ���к��� ���
	}
}

class superClass{
	int age = 20;
	String name2;
	
	public void method() {
	}
}
