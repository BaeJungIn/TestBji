package day5;

import java.util.Scanner;

public class MemberServiceEx {
	public static Scanner input;
	public static void main(String[] args) {
		MemberService service = new MemberService();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�̸��� �Է��ϼ��� : ");
		String name = input.next();
		
		boolean result = service.login(service.id,service.pw);
		if(result) {
			System.out.println("�α��� �Ǿ����ϴ�.");
			System.out.println("�α׾ƿ� �Ͻðڽ��ϱ�?(���̵� �Է����ּ���)");
			input = new Scanner(System.in);
			String id = input.next();
			service.logout(id);
		}else {
			System.out.println("���̵� �Ǵ� ��й�ȣ�� Ʋ���ϴ�.");
		}
	}
	
	public void run() {
		
	}

}
