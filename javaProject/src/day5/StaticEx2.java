package day5;

public class StaticEx2 {

   public static final int AGE = 10;
   public String name;
   public StaticEx2() {
      name = "ȫ�浿";
   }
   public StaticEx2(String name) {
      this.name = name;
   }
   public static void main(String[] args) {
      StaticEx2 se = new StaticEx2();
      System.out.println(se.name + "�� ���̴� " + StaticEx2.AGE);
      StaticEx2 se2 = new StaticEx2("������");
      System.out.println( se2.name + "�� ���̴� " + StaticEx2.AGE);

   }

}