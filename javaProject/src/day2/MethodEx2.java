package day2;

public class MethodEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] result = method2();
		for(int i=0; i<result.length;i++) {
			System.out.println(result[i]);
		}
		
		
		
		
	}
	
	
	//����1 �迭�� ������ ������ ����ŭ �������� ����Ͻÿ�
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
		
		//����2 �� ����� �������� ���� ���ϰ� �迭�� ��ȯ�Ͽ� ���� ����Ͻÿ�
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
