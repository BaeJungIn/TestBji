package day2;

public class DoWhileBreakEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		boolean result = true;
		
		do {
			i++;
			if(result) {
				System.out.println("���� ����:"+i);
				if(i==5) {
					result = false;
				}
				if(! result) {
					System.out.println("���� ���� �����մϴ�.");
					break;
				}
				}else {
					System.out.println("i:"+i);
				}
			}while(i<10);
		
	}

}