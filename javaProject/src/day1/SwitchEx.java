package day1;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("수르 입력하세요 (1~4) : ");
		Scanner scan = new Scanner(System.in);
		int su = scan.nextInt();
		
		switch(su) {
		case 1: 
			System.out.println("실해 구문1");
			break;
		case 2:
			System.out.println("실행 구문2");
			break;
		
		case 3:
			System.out.println("실해 구무3");
			break;
		case 4:
			System.out.println("실행 구문4");
		}
		
	}

}
