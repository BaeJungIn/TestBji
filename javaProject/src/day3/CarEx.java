package day3;

import java.util.Scanner;

public class CarEx {
	String company="���";
	String color="����";
	String model="�ҳ�Ÿ"; 
	int speed = 20;
	int choice;
	Scanner sc = new Scanner(System.in);
	
	public void carInfo() {
		System.out.println(company);
		System.out.println(color);
		System.out.println(model);
		System.out.println(speed);
	}
	public void engine() {
		
		while(true) {
		System.out.println("1.�õ��ɱ� | 2.�õ����� | 3. ���� ");
		choice = sc.nextInt();
		
		if(choice == 1) {
			System.out.println("engine On");
			System.out.println();
			System.out.println(start());
		}else if(choice == 2) {
			System.out.println("engine Off");
			System.out.println();
			System.out.println(stop());
		}else if(choice == 3) {
			System.out.println("����");
			break;
		}
	}
	}
	public String start() {
		return "Start";
	}
	public String stop() {
		return "Stop";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarEx ce = new CarEx();
		
		ce.carInfo();
		System.out.println();
		ce.engine();
		
	}

}


