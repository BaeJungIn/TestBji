package day2;

public class Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<6; i++) {
			for(int j=0; j<6; j++) {
				if(i<j)
				System.out.print("*");
				}
			System.out.println();
		}
		
		for(int a=0; a<7; a++) {
			for(int b=7; b>0; b--) {
				if(a>b) System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
		
		
	}

}
