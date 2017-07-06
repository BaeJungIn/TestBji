package day5;

abstract class Animal {
	int age;
	String name;
	abstract void bark();
}
public class AbstractEx2 extends Animal{
	public AbstractEx2() {
		age = 10;
		name = "»£∂˚¿Ã";
	}
	public void bark() {
		System.out.println("æÓ»Ô~~");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractEx2 animal = new AbstractEx2();
		System.out.println(animal.name);
		System.out.println(animal.age);
		
	}
	

}
