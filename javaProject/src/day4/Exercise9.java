package day4;

import java.util.Scanner;

public class Exercise9 {

   public Scanner scan;
   public Student[] list;
   public Exercise9() {
      scan= new Scanner(System.in);
   }
   
   public void studentNum() {
	   System.out.println("�л����� �Է��ϼ���.");
       int su = inputNum();
       list = new Student[su];
       System.out.println(list.length + "���� �л����� �߰��� �ּ���");
       execute();
   }
   
   public void addStudent() {
	   for(int i=0; i<list.length; i++) {
		   System.out.print("�л� �̸� �Է� : ");
		   String name = inputStr();
		   System.out.println("�л� ���� �Է� : ");
		   int score = inputScore();
		   list[i] = new Student(name, score);
	   }
	   execute();
	   
   }
   
   public void listStudent() {
	   for(int i=0; i<list.length; i++) {
		   System.out.println("�л��̸� : "+list[i].name);
		   System.out.println("���� : "+list[i].score);
	   }
	   execute();
   }
   
   public int inputNum() {
      return scan.nextInt();
   }
   
   public int inputScore() {
	      return scan.nextInt();
	   }
   
   public String inputStr() {
      return scan.next();
   }
   
   public void result() {
	   int sum=0;
	   int avg=0;
	   for(int i=0; i<list.length; i++) {
		   sum += list[i].score; 
		   avg = list[i].score / list.length;
	   }
	   System.out.println("�հ� : "+sum);
	   System.out.println("��� : "+avg);
	   execute();
   }
   
   public void execute() {
      System.out.println("==================================================");
      System.out.println("    1.�л���    |    2.�����Է�    |    3.��������Ʈ    |    4.�м�    |    5.����   ");
      System.out.println("==================================================");
      System.out.print("����>\t");
      
      switch(inputNum()) {
      
      case 1:
    	 studentNum();
         break;
         
      case 2:
         addStudent();
          break;
          
      case 3:
    	  listStudent();
    	  break;
    	  
      case 4:
    	  result();
          break;
    	  
    	  
      }while(true);
   }
   
   public static void main(String[] args) {
      new Exercise9().execute();
      System.out.println("���α׷� ����");
   }
}
class Student{
   int score;
   String name;
   public Student(String name, int score) {
      this.name=name;
      this.score=score;
   }
}