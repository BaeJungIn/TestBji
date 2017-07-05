package day4;

import java.util.Scanner;

public class Exercise9 {

   public Scanner scan;
   public Student[] list;
   public Exercise9() {
      scan= new Scanner(System.in);
   }
   
   public void studentNum() {
	   System.out.println("학생수를 입력하세요.");
       int su = inputNum();
       list = new Student[su];
       System.out.println(list.length + "명의 학생들을 추가해 주세요");
       execute();
   }
   
   public void addStudent() {
	   for(int i=0; i<list.length; i++) {
		   System.out.print("학생 이름 입력 : ");
		   String name = inputStr();
		   System.out.println("학생 점수 입력 : ");
		   int score = inputScore();
		   list[i] = new Student(name, score);
	   }
	   execute();
	   
   }
   
   public void listStudent() {
	   for(int i=0; i<list.length; i++) {
		   System.out.println("학생이름 : "+list[i].name);
		   System.out.println("점수 : "+list[i].score);
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
	   System.out.println("합계 : "+sum);
	   System.out.println("평균 : "+avg);
	   execute();
   }
   
   public void execute() {
      System.out.println("==================================================");
      System.out.println("    1.학생수    |    2.점수입력    |    3.점수리스트    |    4.분석    |    5.종료   ");
      System.out.println("==================================================");
      System.out.print("선택>\t");
      
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
      System.out.println("프로그램 종료");
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