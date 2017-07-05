package day3;

public class ClassEx1 {
	
	public String name;
	public int age;
	public void method1() {
		System.out.println("method1");
	}
	
	public String method2() {
		return "method2";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassEx1 object = new ClassEx1();
		System.out.println("name:"+object.name);
		System.out.println("age:"+object.age);
		object.method1();
		String result = object.method2();
		System.out.println(result);
		System.out.println(object.method2()); //object.method2로 하면 출력 안됨
	}

}


