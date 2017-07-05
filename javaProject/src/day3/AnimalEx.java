package day3;

public class AnimalEx {

	
	public static void main(String[] args) {
		Animal li = new Animal();
		System.out.println("이름:"+li.name);
		System.out.println("나이:"+li.age);
	
		li.bark();
	
		Animal li2 = new Animal("사자",50);
		li2.bark("크헝!");
		li2.display();
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