package day2;

public class ArrayEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]arr = new int[3][2];
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[1][0] = 3;
		arr[1][1] = 4;
		arr[2][0] = 5;
		arr[2][1] = 6;

		System.out.println("arr[0][0] : "+arr[0][0]);
		System.out.println("arr[0][1] : "+arr[0][1]);
		System.out.println("arr[1][0] : "+arr[1][0]);
		System.out.println("arr[1][1] : "+arr[1][1]);
		System.out.println("arr[2][0] : "+arr[2][0]);
		System.out.println("arr[2][1] : "+arr[2][1]);
		
		System.out.println();
		
		int[][] arr2 = {{10,20},{30,40}, {50,60}};
		
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) { //열에 대한 length
				System.out.println("arr["+i+"]["+j+"]"+arr[i][j]);
			}
		}
		
		for(int[] i:arr2) {
			for(int j:i) {
				System.out.println(i);
			}
		}
	}

}
