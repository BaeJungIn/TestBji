package day1;

public class ForEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		for(int i=0; i<10; i++) {
			System.out.println("실행구문"+i);
		}
		*/
		
		/*
		System.out.println("**********합***************************");
		int sum=0;
		// 문제 1 : 1~100까지의 합
		for(int i=1; i<101;i++) {
			sum +=i;
		}
		System.out.println(sum);
		
		System.out.println();
		System.out.println("**************짝수***************************");
		
		for(int i=1; i<101; i++) {
			
			if(i%2==0)
			 System.out.print(" "+i);
		}
		*/
		
		
		// 구구단
		for(int i=2; i<10; i++) {
			System.out.println("*****"+i+"단*****");
			for(int j=1; j<10; j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
		
		
		for(int a=1; a<10; a++) {
			System.out.println();
			for(int b=2; b<10; b++) {
				System.out.print(b+"*"+a+"="+a*b+" "+"\t");
			}
			
		}
		
	}

}
