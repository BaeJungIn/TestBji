package day2;

import java.util.Scanner;

public class WhileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("반복 제한 :");
//		int input = scan.nextInt();
//		
//		int count=0;
//		while(count<input) {
//			count++;
//			System.out.println("실해 구문 cnt :"+count);
//		}
		
		// 문제 1~100 범위까지의 홀수에 합을 구하시오.
		int sum=0;
		int i=0;
		while(i<100) {
			if(i%2==1) {
				sum+=i;
			}
			i++;
		}
		System.out.println(sum);
	}

}
