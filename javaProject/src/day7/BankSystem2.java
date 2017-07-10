package day7;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import day5.Member;

public class BankSystem2 extends JFrame implements ActionListener{
	public JFrame frame;
	public JPanel pn1;
	public JTextField tf1, tf2, tf3;
	public JTextArea ta1, ta2, ta3;
	public JLabel lb1, lb2, lb3;
	public JButton btn1, btn2, btn3, btn4, btn5;
	public JDialog dialog;
	static String name;
	static String pw;
	static String id;
	Member member;
	Scanner scan= new Scanner(System.in);
	public Bank[] list;
	 
	public BankSystem2() {
		 pn1 = new JPanel(new FlowLayout());
		 ta1 = new JTextArea();
		 ta2 = new JTextArea();
		 ta3 = new JTextArea();
		 lb1 = new JLabel();
		 lb2 = new JLabel();
		 lb3 = new JLabel();
		 btn1 = new JButton("계좌등록");
		 btn2 = new JButton("계좌조회");
		 btn3 = new JButton("입금");
		 btn4 = new JButton("출금");
		 btn5 = new JButton("종료");
		 tf1 = new JTextField();
		 tf2 = new JTextField();
		 tf3 = new JTextField();
		 
		 pn1.add(btn1);
		 pn1.add(btn2);
		 pn1.add(btn3);
		 pn1.add(btn4);
		 pn1.add(btn5);
		 
		 add(pn1);
		 setSize(500,500);
		 setVisible(true);
		 
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   }
	
	public int inputNum() {
		return scan.nextInt();
	}
	
	public String inputNumber() {
		return scan.next();
	}
	
	public int inputMoney() {
		return scan.nextInt();
	}
	
	public String inputName() {
		return scan.next();
	}
	
	public String inputId() {
		return scan.next();
	}
	
	
	
	public boolean login(String id, String pw) {
		boolean result = false;
		if(member.getId().equals(id) && member.getPw().equals(pw)) {
			System.out.println(member.getName()+"님 환영합니다,");
			result = true;
		}else {
			System.out.println("아이디와 비밀번호를 확인하세요.");
		}
		make();
		return result;
	}

	public void make() {
		System.out.println("입력할 계좌 수를 입력하세요 : ");
		int su = inputNum();
		list = new Bank[su];
		
		for(int i=0; i<list.length; i++) {
			System.out.println("아이디 :");
			String id = inputId();
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
		System.out.println("계좌를 입력하세요 : ");
		String number = inputNumber();
		if(list.equals(number)) {
		System.out.println("금액을 입력하세요 : ");
		int money = inputMoney();
		
		for(int i=0; i<list.length; i++) {
			money += list[i].money;
			System.out.println("계좌번호 : "+number);
			System.out.println("예금액 : "+money);
		}
		System.out.println("예금이 성공되었습니다.");
		
	}
	}
	public void output() {
		System.out.println("계좌를 입력하세요 : ");
		String number = inputNumber();
		if(list.equals(number)) {
		System.out.println("출금할 금액을 입력하세요 : ");
		int money = inputMoney();
		
		for(int i=0; i<list.length; i++) {
			money -= list[i].money;
			System.out.println("계좌번호 : "+number);
			System.out.println("출금액 : "+money);
		}
		System.out.println("출금이 성공되었습니다.");
		
	}
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
		
		new BankSystem2().execute();
		
	}

	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
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


