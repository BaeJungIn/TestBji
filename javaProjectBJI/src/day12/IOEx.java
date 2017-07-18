package day12;

public class IOEx {

	public static void main(String[] args) {
		System.out.println("입력:");
		char ch = 'a';
		try {
			ch = (char) System.in.read();
		} catch (Exception e) {
			System.out.println("Exception:"+e.getMessage());
		}
		System.out.println("출력:"+ch);

	}

}
