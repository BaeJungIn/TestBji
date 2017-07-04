package day2;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------");
			System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
			System.out.println("-----------------------");
			System.out.println("선택>");
			
			int selectNo = sc.nextInt();
			
			if(selectNo==1) {
				System.out.print("학생수>"+scores.length);
			}else if(selectNo==2) {
			
				for(int i=0; i<scores.length; i++) {
				studentNum = sc.nextInt();
				System.out.println("scores[i]");
			
			}
			}else if(selectNo==3) {
				
			}else if(selectNo==4) {
				
			}else if(selectNo==5) {
				run=false;
			}
		}
		System.out.println("프로그램 종료");
	}

}
