package day4;


public class AnimalEx extends Animal{ //���
	String name;
	int ageA;
	public AnimalEx() {
		name = "����";
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