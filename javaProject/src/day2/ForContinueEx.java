package day2;

public class ForContinueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=0;
		for(int i=0; i<10; i++) {
			System.out.println("�ݺ� ���๮");
			k++;
			if(k>4) {
				continue;
			}
			System.out.println("�ݺ� ���� ����");
		}
		
		//���� for��    ?
		int[] arr = new int[] {1,2,3};
		for(int a: arr) {
			System.out.println(a);
		}
		
		for(String str : args) {
			System.out.println(str);
		}
		
	}

}
