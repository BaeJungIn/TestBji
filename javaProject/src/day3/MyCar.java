package day3;

public class MyCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car Car = new Car();
		Car.display();
		Car car2 = new Car("그렌저");
		car2.setWheel(300);
		car2.display();
		Car car3 = new Car("에쿠스",500);
		car3.display();
		car3.display("티코",100);
	}

}

class Car{
	int wheel;
	String name;
	
	public Car() {
		name ="라프";
		wheel=4;
	}
	public Car(String name){
		this.name = name;
	}
	public Car(String name, int wheel) {
		this.name = name;
		this.wheel = wheel;
	}
	public void setWheel(int wheel) {
		this.wheel = wheel;
	}
	public int getWheel(int wheel) {
		return wheel;
	}
	public void display() {
		System.out.println("차이름: "+name+", 바퀴수: "+wheel);
	}
	public void display(String name, int wheel) {
		System.out.println("차이름: "+this.name+"바퀴수: "+this.wheel);
	}
}