package day11;

import javax.swing.text.ChangedCharSetException;

public class ExceptonEx2 {

	public static void main(String[] args) {
		
		
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);

	}
	
	public static void changeDog(Animal animal) {
		Dog dog = (Dog) animal;
	}

}

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}
