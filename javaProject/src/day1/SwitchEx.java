package day1;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("���� �Է��ϼ��� (1~4) : ");
		Scanner scan = new Scanner(System.in);
		int su = scan.nextInt();
		
		switch(su) {
		case 1: 
			System.out.println("���� ����1");
			break;
		case 2:
			System.out.println("���� ����2");
			break;
		
		case 3:
			System.out.println("���� ����3");
			break;
		case 4:
			System.out.println("���� ����4");
		}
		
	}

}
