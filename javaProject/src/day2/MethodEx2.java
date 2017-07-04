package day2;

public class MethodEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] result = method2();
		for(int i=0; i<result.length;i++) {
			System.out.println(result[i]);
		}
		
		
		
		
	}
	
	
	//문제1 배열에 나열된 정수의 값만큼 구구단을 출력하시오
	public static void method1(int array[]) {
		int [] dan = {2,6,8};
		int[]hap = new int[3];
		int num=0;
		int result=0;
		int sum1=0;
		
		for(int i=0; i<dan.length; i++) {
			num = dan[i];
			for(int j=1; j<10; j++) {
				result = num*j;
				System.out.println(num+"*"+j+"="+result);
				sum1 +=result;
				hap[i]=sum1;
			}
			System.out.println(sum1);
			System.out.println();
		}
		

	}
	public static int[] method2() {
		
		//문제2 각 출력한 구구단의 합을 구하고 배열로 반환하여 합을 출력하시오
		int[] result = new int[9];
		
		for(int dan=2; dan<10; dan++) {
			for(int i =1; i<10; i++) {
				System.out.println(dan+"*"+i+"="+(dan*i)+"\t");
				result[dan-2] +=(dan*i);
			}
			System.out.println();
		}
		return result;
	}
	
	

}
