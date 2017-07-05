package day4;


public class AnimalEx extends Animal{ //상속
	String name;
	int ageA;
	public AnimalEx() {
		name = "나비";
	}
	
	public static void main(String[] args) {
		Animal obj =new AnimalEx();
		obj.bark();
		System.out.println(obj.name);
	}

}
class Animal{
	String name;
	int age;
	String bark;
	public Animal() {
		this.name = "호랑이";
		this.age = 10;
	}
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void bark() {
		System.out.println("어흥!!");
	}
	public void bark(String bark) {
		this.bark = bark;
	}
	public void display() {
		System.out.println("이름:"+name+" 나이:"+age+" "+bark);
		
	}
}