package day2;

import java.util.Scanner;

public class WhileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("�ݺ� ���� :");
//		int input = scan.nextInt();
//		
//		int count=0;
//		while(count<input) {
//			count++;
//			System.out.println("���� ���� cnt :"+count);
//		}
		
		// ���� 1~100 ���������� Ȧ���� ���� ���Ͻÿ�.
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
