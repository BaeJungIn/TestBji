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
		System.out.println("�Է��� ���� ���� �Է��ϼ��� : ");
		int su = inputNum();
		list = new Bank[su];
		
		for(int i=0; i<list.length; i++) {
			System.out.println("���¹�ȣ : ");
			String number = inputNumber();
			System.out.println("�ʱ��Աݾ� : ");
			int money = inputMoney();
			System.out.println("�̸� : ");
			String name = inputName();
			list[i] = new Bank(name, money, number);
		
		}
		System.out.println("���°� �����Ǿ����ϴ�.");
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
			System.out.println("���¹�ȣ : "+list[i].number);
			System.out.println("���ݾ� : "+sum);
		}
		System.out.println("������ �����Ǿ����ϴ�.");
		
	}
	
	public void output() {
		System.out.println("���¹�ȣ : ");
		String number = inputNumber();
		System.out.println("��ݾ� : ");
		int money = inputMoney();
	}

	public void execute() {
		 System.out.println("==================================================");
	      System.out.println("    1.���»���    |    2.���¸��    |    3.����    |    4.���    |    5.����   ");
	      System.out.println("==================================================");
	      System.out.print("����>\t");
	      
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