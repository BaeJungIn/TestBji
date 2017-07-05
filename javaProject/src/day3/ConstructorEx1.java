package day3;

public class ConstructorEx1 {

	int a;
	
	//기본 생성자를 정의해야 할 경우(다른 생성자를 정의할 때 없으면 에러, 다른 생성자 정의 안했다면 상관X(이미 존재))
	ConstructorEx1(){
		a= 50;
		System.out.println("Constructor1="+this.a);
	}
	
	//오버로드
	ConstructorEx1(int a){ //a가 아닌 b일때는 this.a 멤버 변수를 호출함 (=0)
		System.out.println("Constructor2 , a="+a);
	}
	
	//오버로드
	ConstructorEx1(int a, String s){
		System.out.println("Constructor3");
	}
	ConstructorEx1(String a, int b){
		System.out.println("Constructor4");
	}
	public static void main(String[] args) {
		new ConstructorEx1();
		new ConstructorEx1(5,"A");  //3번
		new ConstructorEx1("A", 5); //4번
		new ConstructorEx1(10);
		
	}

}
