package day3;

public class AnimalEx {

	
	public static void main(String[] args) {
		Animal li = new Animal();
		System.out.println("�̸�:"+li.name);
		System.out.println("����:"+li.age);
	
		li.bark();
	
		Animal li2 = new Animal("����",50);
		li2.bark("ũ��!");
		li2.display();
	}

}
class Animal{
	String name;
	int age;
	String bark;
	public Animal() {
		this.name = "ȣ����";
		this.age = 10;
	}
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void bark() {
		System.out.println("����!!");
	}
	public void bark(String bark) {
		this.bark = bark;
	}
	public void display() {
		System.out.println("�̸�:"+name+" ����:"+age+" "+bark);
		
	}
}