package day5;

public class StaticEx2 {

   public static final int AGE = 10;
   public String name;
   public StaticEx2() {
      name = "홍길동";
   }
   public StaticEx2(String name) {
      this.name = name;
   }
   public static void main(String[] args) {
      StaticEx2 se = new StaticEx2();
      System.out.println(se.name + "의 나이는 " + StaticEx2.AGE);
      StaticEx2 se2 = new StaticEx2("개똥이");
      System.out.println( se2.name + "의 나이는 " + StaticEx2.AGE);

   }

}