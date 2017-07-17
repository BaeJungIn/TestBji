package day11;

public class ExceptionEx3 {
	String str = "";
	public void foo(int i) {
		try {
			if(i==1) {
				throw new Exception();
			}
			str += " 1 ";
		} catch (Exception e) {
			str += " 2 ";
			return;
		}finally {
			str += " 3 ";
		}
		str += " 4 ";
	}
	public static void main(String[] args) {
		ExceptionEx3 ex = new ExceptionEx3();
		ex.foo(0);
		ex.foo(1);
		System.out.println(ex.str);

	}

}
