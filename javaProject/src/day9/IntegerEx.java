package day9;

public class IntegerEx {

	public static void main(String[] args) {
		int a= Integer.parseInt(args[0]);
		Integer b = new Integer(10);
		int c = b.intValue();
		int sum = a + c;
		System.out.println("결과1:"+sum);
		
		int d = new Integer(100);
		Integer e = 200;
		int sum2 = d+e;
		Integer sum3 = d+e;
		
		System.out.println("결과2:"+sum2);
		System.out.println("결과3:"+sum3);
	}

}
