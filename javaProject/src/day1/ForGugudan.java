package day1;

import java.util.Scanner;

public class ForGugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("단을 입력해주세요 : ");
		int dan = new Scanner(System.in).nextInt();
		
		for(int i=1; i<10; i++) {
			int result = dan*i;
				System.out.println(dan+"*"+"="+result);
			}
		}

}
