package day4;

public class InherEx2 extends superClass{
	int age = 10;
	String name1;
	
	public void method() {
		// TODO Auto-generated method stub
				//super() 사용
				//this() 사용
				//super.객체요소
				//this.객체요소
				System.out.println("subClass Method");
				super.method();
	}
	public static void main(String[] args) {
		InherEx2 obj = new InherEx2();
		
		//1 형변환
		superClass sc = obj;
		Object object1 = obj;
		Object object2 = sc;
		
		//2 캐스팅
		obj = (InherEx2)sc;
		obj = (InherEx2)object1;
		
		//3 object 형 변환
		obj.method();
		sc.method();
		
		System.out.println(obj.age);
		System.out.println(sc.age);
		
		//4 오버라이드 사용
		
		
		//5 은닉변수 사용
	}
}

class superClass{
	int age = 20;
	String name2;
	
	public void method() {
	}
}
