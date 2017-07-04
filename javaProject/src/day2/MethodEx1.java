package day2;

import java.util.Scanner;

public class MethodEx1 {


	public static int hol(int su) {
		int sum = 0;
		for(int i=0; i<=su; i++) {
			if(i%2 ==1) {
				sum +=i;
				System.out.println(i);
				
			}
		}
		return sum;
	}
	public static int jjak(int su) {
		int sum = 0;
		for(int i=0;i<=sum;i++) {
			if(i%2 ==0) {
				sum+=i;
			System.out.println(i);
			
			}
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int su = Integer.parseInt(args[0]);
		int result = hol(su);
		System.out.println("결과:"+result);
		result = jjak(su);
		System.out.println("결과:"+result);
		
	}
	
	

}
                                             