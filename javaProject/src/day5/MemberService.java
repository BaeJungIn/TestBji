package day5;

import java.util.Scanner;

public class MemberService {
	Scanner sc = new Scanner(System.in);
	String name;
	String pw;
	String id;
	public Member member;
	public MemberService() {
//		member = new Member();
//		member.setName("ȫ�浿");
//		member.setId("abc");
//		member.setPw("123");
		//��������1 Member bean class�� ����� ������ �Է��ؼ� ����Ͻÿ�.(system.in ���)
		member = new Member();
		member.setName(name);
		member.setPw(pw);
		member.setId(id);
	}
	public boolean login(String id, String pw) {
		boolean result = false;
		//��������3 ���̵�� ��й�ȣ�� ���� Ȯ���Ͽ� �α����� ����� �����Ͻÿ�.
		if(member.getId().equals(id) && member.getPw().equals(pw)) {
			System.out.println(member.getName()+"�� ȯ���մϴ�,");
			result = true;
		}else {
			System.out.println("���̵�� ��й�ȣ�� Ȯ���ϼ���.");
		}
		return result;
	}
	public void logout(String id) {
		//���̵� �� Ȯ�� �� �α׾ƿ��� �����Ͻÿ�.\
		if(member.getId().equals(id)) {
			System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
		}else {
			System.out.println("���̵� Ȯ���ϼ���.");
		}
		
		
	}
}
