package day5;

import java.util.Scanner;

public class MemberServiceEx {
	public static Scanner input;
	public static void main(String[] args) {
		MemberService service = new MemberService();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요 : ");
		String name = input.next();
		
		boolean result = service.login(service.id,service.pw);
		if(result) {
			System.out.println("로그인 되었습니다.");
			System.out.println("로그아웃 하시겠습니까?(아이디 입력해주세요)");
			input = new Scanner(System.in);
			String id = input.next();
			service.logout(id);
		}else {
			System.out.println("아이디 또는 비밀번호가 틀립니다.");
		}
	}
	
	public void run() {
		
	}

}
