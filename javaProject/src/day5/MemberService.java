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
//		member.setName("홍길동");
//		member.setId("abc");
//		member.setPw("123");
		//연습문제1 Member bean class에 사용자 정보를 입력해서 출력하시오.(system.in 사용)
		member = new Member();
		member.setName(name);
		member.setPw(pw);
		member.setId(id);
	}
	public boolean login(String id, String pw) {
		boolean result = false;
		//연습문제3 아이디와 비밀번호를 각각 확인하여 로그인인 기능을 실행하시오.
		if(member.getId().equals(id) && member.getPw().equals(pw)) {
			System.out.println(member.getName()+"님 환영합니다,");
			result = true;
		}else {
			System.out.println("아이디와 비밀번호를 확인하세요.");
		}
		return result;
	}
	public void logout(String id) {
		//아이디를 비교 확인 후 로그아웃을 실행하시오.\
		if(member.getId().equals(id)) {
			System.out.println("로그아웃 되었습니다.");
		}else {
			System.out.println("아이디를 확인하세요.");
		}
		
		
	}
}
