package bank;



public class BankFunction {
	BankMain bm;
	BankMember member;
	public boolean Login(String id, String pw) {
		boolean result = false;
		if(member.getId().equals(id) && member.getPw().equals(pw)) {
			System.out.println(member.getId()+"님 환영합니다,");
			result = true;
		}else {
			System.out.println("아이디와 비밀번호를 확인하세요.");
		}

		return result;
	}
	
	public void make() {
		System.out.println("입력할 계좌 수를 입력하세요 : ");
		int su = bm.inputNum();
		bm.list = new BankList[su];
		
		for(int i=0; i<bm.list.length; i++) {
			System.out.println("아이디 :");
			String id = bm.inputId();
			System.out.println("계좌번호 : ");
			String number = bm.inputNumber();
			System.out.println("초기입금액 : ");
			
			int money = bm.inputMoney();
			System.out.println("이름 : ");
			String name = bm.inputName();
			bm.list[i] = new BankList(name, money, number);
		
		}
		System.out.println("계좌가 생성되었습니다.");

	}
	
	public void list() {
		for(int i=0; i<bm.list.length; i++) {
			System.out.println(bm.list[i].number+"\t"+bm.list[i].name+"\t"+bm.list[i].money);			
		}

	}
	
	public void input() {
		System.out.println("계좌를 입력하세요 : ");
		String number = bm.inputNumber();
		if(bm.list.equals(number)) {
		System.out.println("금액을 입력하세요 : ");
		int money = bm.inputMoney();
		
		for(int i=0; i<bm.list.length; i++) {
			money += bm.list[i].money;
			System.out.println("계좌번호 : "+number);
			System.out.println("예금액 : "+money);
		}
		System.out.println("예금이 성공되었습니다.");

	}
	}
	
	public void output() {
		System.out.println("계좌를 입력하세요 : ");
		String number = bm.inputNumber();
		if(bm.list.equals(number)) {
		System.out.println("출금할 금액을 입력하세요 : ");
		int money = bm.inputMoney();
		
		for(int i=0; i<bm.list.length; i++) {
			money -= bm.list[i].money;
			System.out.println("계좌번호 : "+number);
			System.out.println("출금액 : "+money);
		}
		System.out.println("출금이 성공되었습니다.");
		
	}
	}

}
