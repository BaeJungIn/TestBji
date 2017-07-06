package day5;

class Interface{}
class Parent extends Interface{
	int a = 10;
}
class Child extends Parent{
	
}
public class InstanceOffEx {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
		if(child instanceof Interface) {
			System.out.println("child is instance of Interface");
		}
		if(child instanceof Object) {
			System.out.println("child is instance of Object");
		}
		if(child instanceof Parent) {
			System.out.println("child is instance of Parent");
		}
		if(child instanceof Child) {
			System.out.println("child is instance of Child");
		}
		
		if(child instanceof Object) {
			System.out.println("child is instance of Object");
		}else if(child instanceof Interface) {
			System.out.println("child is instance of Interface");
		}else if(child instanceof Parent) {
			System.out.println("child is instance of Parent");
		}else if(child instanceof Child) {
			System.out.println("child is instance of Child");
		}
	}

}
