package day11;

public class ExeptionEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int [] Array = new int[3];
			Array[0] = 0;
			Array[1] = 10;
			Array[2] = 20;
			
			for(int i=0; i<Array.length+1; i++)
				System.out.println("Array["+i+"]="+Array[i]);
			
		}catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			e.printStackTrace();
			return;
		}finally {
			System.out.println("finally ½ÇÇà");
		}
	}

}
