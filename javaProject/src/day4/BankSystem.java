package day4;

import java.util.Scanner;

public class BankSystem {
	
	 public Scanner scan;
	 public Bank[] list;
	 public BankSystem() {
	 scan= new Scanner(System.in);
	   }
	
	public int inputNum() {
		return scan.nextInt();
	}
	
	public String inputNumber() {
		return scan.nextLine();
	}
	
	public int inputMoney() {
		return scan.nextInt();
	}
	
	public String inputName() {
		return scan.nextLine();
	}
	
	public void make() {
		System.out.println("입력할 계좌 수를 입력하세요 : ");
		int su = inputNum();
		list = new Bank[su];
		
		for(int i=0; i<list.length; i++) {
			System.out.println("계좌번호 : ");
			String number = inputNumber();
			System.out.println("초기입금액 : ");
			int money = inputMoney();
			System.out.println("이름 : ");
			String name = inputName();
			list[i] = new Bank(name, money, number);
		
		}
		System.out.println("계좌가 생성되었습니다.");
		execute();
	}
	
	public void list() {
		for(int i=0; i<list.length; i++) {
			System.out.println(list[i].number+"\t"+list[i].name+"\t"+list[i].money);			
		}
		execute();
	}
	
	public void input() {
		int sum=0;
		for(int i=0; i<list.length; i++) {
			sum += list[i].money;
			System.out.println("계좌번호 : "+list[i].number);
			System.out.println("예금액 : "+sum);
		}
		System.out.println("예금이 성공되었습니다.");
		
	}
	
	public void output() {
		System.out.println("계좌번호 : ");
		String number = inputNumber();
		System.out.println("출금액 : ");
		int money = inputMoney();
	}

	public void execute() {
		 System.out.println("==================================================");
	      System.out.println("    1.계좌생성    |    2.계좌목록    |    3.예금    |    4.출금    |    5.종료   ");
	      System.out.println("==================================================");
	      System.out.print("선택>\t");
	      
	      switch(inputNum()) {
	      
	      case 1:
	    	  make();
	         break;
	         
	      case 2:
	    	  list();
	          break;
	          
	      case 3:
	    	  input();
	    	  break;
	    	  
	      case 4:
	    	  output();
	          break;
	    	  
	    	  
	      }while(true);
	}
	public static void main(String[] args) {
		new BankSystem().execute();

	}

}

class Bank{
	   int money;
	   String name;
	   String number;
	   
	   public Bank(String name, int money, String number) {
	      this.name=name;
	      this.money=money;
	      this.number=number;
	   }
	}