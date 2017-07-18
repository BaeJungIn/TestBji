package day12;

public class IOEx3 {

	public static void main(String[] args) {
		byte b[] = new byte[10];
		System.out.println("입력:");
		char ch = 'a';
		try {
			System.in.read(b, 0, 0);
		} catch (Exception e) {
			System.out.println("Exception:"+e.getMessage());
		}
		
		System.out.print("출력:");
		System.out.write(b,0,0);
		System.out.println();

	}

}
