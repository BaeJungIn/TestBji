package day1;

import java.util.Scanner;

public class SwitchEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Yes/No ?");
		System.out.println("수를 입력하세요 (1~10) :");
		Scanner scan = new Scanner(System.in);
		String c = scan.next();
		
		switch(c) {
		case "y":
		case "Y":
			System.out.println("Yes");
			break;
		case "n":
		case "N":
			System.out.println("No");
			break;
		default:
		}
		
		
	}

}
