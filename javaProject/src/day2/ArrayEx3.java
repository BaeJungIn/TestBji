package day2;

public class ArrayEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 연습문제1 배열의 max값을 구하시오
		int[] array = {1,5,3,8,2};
		int max=0;
		
		for(int i=0; i<array.length; i++) {
			if(array[i]>array[i+1]) {
				max = array[i];
				i++;
			}
					}
		System.out.println("최대값:"+max);
		
		System.out.println();
		
		
		// 연습문제2 배열의 total, avg를 구하시오
		int[][] array2 = {{95,86},{83,92,96},{78,83,93,87,88}};
		int total = 0;
		int cnt=0;
		int avg=0;
		for(int i=0; i<array2.length; i++) {
			for(int j=0; j<array2[i].length; j++) {
				total +=array2[i][j];
				cnt++;
			}
		}
		avg=total/cnt;
		System.out.println("합계:"+total);
		System.out.println("평균:"+avg);

		
		
		}
	}


