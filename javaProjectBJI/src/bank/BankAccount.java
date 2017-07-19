package bank;

public class BankAccount {
	   private String ano;
	   private String owner;
	   private int balance;
	   private String name;
	   private String id;
	   private String pw;
	   
	   public BankAccount(String ano, String owner, int balance) {
	      this.ano = ano;
	      this.owner = owner;
	      this.balance = balance;
	   }
	   public String getName() {
	      return name;
	   }
	   public void setName(String name) {
	      this.name = name;
	   }
	   public String getId() {
	      return id;
	   }
	   public void setId(String id) {
	      this.id = id;
	   }
	   public String getPw() {
	      return pw;
	   }
	   public void setPw(String pw) {
	      this.pw = pw;
	   }
	   public String getAno() { return ano; }
	   public void setAno(String ano) { this.ano = ano; }
	   public String getOwner() { return owner; }
	   public void setOwner(String owner) { this.owner = owner; }
	   public int getBalance() { return balance; }
	   public void setBalance(int balance) { this.balance = balance; }
	}